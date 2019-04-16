package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCUpdatePre {
	public static void main(String[] args) {
		// url(jdbc url)
		// jdbc:protocol �̸�. mysql : db�̸�, 127.0.0.1:db server, 3306:port, scott:db�̸�
		String url = "jdbc:mysql://localhost:3306/scott?serverTimezone=UTC";
//		String url = "jdbc:mysql://127.0.0.1:3306/scott?serverTimezone=UTC";
		String user = "scott";
		String pass = "tiger";

		Connection con;
		PreparedStatement pstat;
		String q = "update customer set address = ? where num = ?";

		try {
			// 1. DriverMananger �� driver ���
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Connection ����
			con = DriverManager.getConnection(url, user, pass);

			// 3. Statement ����
			pstat = con.prepareStatement(q);

			pstat.setString(1, args[0]);
			pstat.setString(2, args[1]);

			// 4. Query ����
			int cnt = pstat.executeUpdate();

			System.out.println(cnt + "�ุŭ �߰��Ͽ����ϴ�.");
			// 6. ������
			pstat.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
