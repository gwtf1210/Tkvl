package com.db;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/JDBCServletPool")
public class JDBCServletPool extends HttpServlet {
	DataSource ds; // ConnectionPool

	@Override
	public void init() throws ServletException {
		// 1. JNDI를 사용해서 ConnectionPool 찾아오기
		try {
			InitialContext context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/mysql"); // 공유자원을 찾아오기

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 서버에서 클라이언트로 나갈 문서의 타입을 지정(mime type)
		response.setContentType("text/html;charset=euc-kr");
		// 응답 내보낼 때 사용할 출력 스트림 얻기
		PrintWriter out = response.getWriter();

		Connection con;
		Statement stat;
		String q1 = "select num,name from customer order by num";
		String q2 = "insert into customer values(725,'bambi','seoul')";
		String q3 = "select empid, concat(fname, ' ',lname) from emp order by empid";

		try {
			// 2. Connection 연결
			con = ds.getConnection(); // pool에서 connection 한개 빌려옴

			// 3. Statement 생성
			stat = con.createStatement();

			// 4. Query 전송 : stat.execute()-select나select가 아니거나 다 실행을 시켜줌
			boolean flag = stat.execute(q3);
			if (flag) { // true. select인 경우
				ResultSet rs = stat.getResultSet();
				// 5. db에서 온 결과 처리

				out.print("<html><body><h2>table</h2>" + "<table border = 1px>" + "<tr><td>num</td><td>name</td></tr>");
				while (rs.next()) {
					String empid = rs.getString(1);
					String name = rs.getString(2);

					out.println(
							"<tr><td>" + empid + "</td><td><a href=Detail?empid=" + empid + ">" + name + "</a></td>");
				}

				out.print("</body></table></html>");
			} else { // false
				int cnt = stat.getUpdateCount();
				out.println("작업 성공 : " + cnt);
			}

			// 6. 마무리
			stat.close();
			con.close(); // pool에 반납
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
