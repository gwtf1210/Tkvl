package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBCInsertPre {
	public static void main(String[] args) {
		// url(jdbc url)
		// jdbc:protocol �̸�. mysql : db�̸�, 127.0.0.1:db server, 3306:port, scott:db�̸�
		String url = "jdbc:mysql://localhost:3306/scott?serverTimezone=UTC";
		String user = "scott";
		String pass = "tiger";

		Connection con;
		Statement stat;

		int num = Integer.parseInt(args[0]);
		String name = args[1];
		String address = args[2];

		PreparedStatement pstat;
		String q = "insert into customer values(?,?,?)";

		try {
			// 1. DriverMananger �� driver ���
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Connection ����
			con = DriverManager.getConnection(url, user, pass);

			// 3. Statement ����
			pstat = con.prepareStatement(q);

			// 3-1.
			pstat.setLong(1, num);
			pstat.setString(2, name);
			pstat.setString(3, address);

			// 4. ���� ����
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
