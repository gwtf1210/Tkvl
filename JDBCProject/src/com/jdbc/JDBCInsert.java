package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCInsert {
	public static void main(String[] args) {
		// url(jdbc url)
		// jdbc:protocol 이름. mysql : db이름, 127.0.0.1:db server, 3306:port, scott:db이름
		String url = "jdbc:mysql://localhost:3306/scott?serverTimezone=UTC";
//		String url = "jdbc:mysql://127.0.0.1:3306/scott?serverTimezone=UTC";
		String user = "scott";
		String pass = "tiger";

		Connection con;
		Statement stat;
		String q = "insert into customer values (729,'Genie','la')";

		try {
			// 1. DriverMananger 에 driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Connection 연결
			con = DriverManager.getConnection(url, user, pass);

			// 3. Statement 생성
			stat = con.createStatement();

			// 4. Query 전송
			int row = stat.executeUpdate(q);

			System.out.println(row + "행만큼 추가하였습니다.");
			// 6. 마무리
			stat.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
