package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {
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

		try {
			// 1. DriverMananger 에 driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Connection 연결
			con = DriverManager.getConnection(url, user, pass);

			// 3. Statement 생성
			stat = con.createStatement();

			// 4. Query 전송
			ResultSet rs = stat.executeQuery(q);

			// 5. db에서 온 결과 처리
			while (rs.next()) {
				String num = rs.getString(1);
				String name = rs.getString(2);
				String address = rs.getString(3);

				System.out.println(num + "--" + name + "--" + address);
			}
			
			// 6. 마무리
			stat.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		

	}
}
