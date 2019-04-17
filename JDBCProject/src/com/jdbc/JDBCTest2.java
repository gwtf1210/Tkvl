package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest2 {
	public static void main(String[] args) {
		// url(jdbc url)
		// jdbc:protocol 이름. mysql : db이름, 127.0.0.1:db server, 3306:port, scott:db이름
		String url = "jdbc:mysql://localhost:3306/scott?serverTimezone=UTC";
//		String url = "jdbc:mysql://127.0.0.1:3306/scott?serverTimezone=UTC";
		String user = "scott";
		String pass = "tiger";

		Connection con;
		Statement stat;
		String q = "select * from customer order by num";
		String q2 = "insert into customer values(725,'bambi','seoul')";

		try {
			// 1. DriverMananger 에 driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Connection 연결
			con = DriverManager.getConnection(url, user, pass);

			// 3. Statement 생성
			stat = con.createStatement();

			// 4. Query 전송 : stat.execute()-select나select가 아니거나 다 실행을 시켜줌
			boolean flag = stat.execute(q2);
			if(flag) { // true. select인 경우
				ResultSet rs  = stat.getResultSet();
				// 5. db에서 온 결과 처리
				while (rs.next()) {
					int num = rs.getInt("num");
					String name = rs.getString(2);
					String address = rs.getString(3);

					System.out.println(num + "--" + name + "--" + address);
				}
			}else { // false
				int cnt = stat.getUpdateCount();
				System.out.println("작업 성공 : " + cnt);
			}
			
			// 6. 마무리
			stat.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
