package com.db;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 이전화면에서 넘어온 empid를 받아 테이블에서 해당 사원 정보를 select 해옴
@WebServlet("/Detail")
public class Detail extends HttpServlet {
	String url = "jdbc:mysql://localhost:3306/scott?serverTimezone=UTC";
	String user = "scott";
	String pass = "tiger";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();

		// 1. 이전화면에서 넘어온 empid 받기
		String empid = request.getParameter("empid");

		// 2. 테이블에 가서 해당 번호 사원 정보 가져오기
		Connection con;
		Statement stat;
		String q = "select * from emp where empid = " + empid;

		try {
			// 1. DriverMananger 에 driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Connection 연결
			con = DriverManager.getConnection(url, user, pass); // <----------- pool / 시간이 가장 오래걸림

			// 3. Statement 생성
			stat = con.createStatement();

			// 4. Query 전송 : stat.execute()-select나select가 아니거나 다 실행을 시켜줌
			boolean flag = stat.execute(q);
			if (flag) { // true. select인 경우
				ResultSet rs = stat.getResultSet();
				out.print("<html><body><h2>table</h2>" + "<table border = 1px>"
						+ "<tr><td>empid</td><td>fname</td><td>lname</td><td>email</td><td>phone</td><td>hdate</td><td>jobid</td><td>salary</td><td>comm</td><td>mgrid</td><td>deptid</td></tr>");
				// 5. db에서 온 결과 처리

				rs.next();
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				String email = rs.getString(4);
				String phone = rs.getString(5);
				String hdate = rs.getString(6);
				String jobid = rs.getString(7);
				String salary = rs.getString(8);
				String comm = rs.getString(9);
				String mgrid = rs.getString(10);
				String deptid = rs.getString(11);

				out.println("<tr><td>" + empid + "</td><td>" + fname + "</td><td>" + lname + "</td><td>" + email
						+ "</td><td>" + phone + "</td><td>" + hdate + "</td><td>" + jobid + "</td><td>" + salary
						+ "</td><td>" + comm + "</td><td>" + mgrid + "</td><td>" + deptid + "</td></tr></table>");
				out.println("<a href=JDBCServlet>초기화면</a>");
				out.print("</body></html>");

			} else { // false
				int cnt = stat.getUpdateCount();
				out.println("작업 성공 : " + cnt);
			}

			// 6. 마무리
			stat.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
