package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCUpdatePre {
	public static void main(String[] args) {
		// url(jdbc url)
		// jdbc:protocol 이름. mysql : db이름, 127.0.0.1:db server, 3306:port, scott:db이름
		String url = "jdbc:mysql://localhost:3306/scott?serverTimezone=UTC";
//		String url = "jdbc:mysql://127.0.0.1:3306/scott?serverTimezone=UTC";
		String user = "scott";
		String pass = "tiger";

		Connection con;
		PreparedStatement pstat;
		String q = "update customer set address = ? where num = ?";

		try {
			// 1. DriverMananger 에 driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Connection 연결
			con = DriverManager.getConnection(url, user, pass);

			// 3. Statement 생성
			pstat = con.prepareStatement(q);

			pstat.setString(1, args[0]);
			pstat.setString(2, args[1]);

			// 4. Query 전송
			int cnt = pstat.executeUpdate();

			System.out.println(cnt + "행만큼 추가하였습니다.");
			// 6. 마무리
			pstat.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
