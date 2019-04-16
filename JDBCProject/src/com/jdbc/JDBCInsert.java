package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCInsert {
	public static void main(String[] args) {
		// url(jdbc url)
		// jdbc:protocol �̸�. mysql : db�̸�, 127.0.0.1:db server, 3306:port, scott:db�̸�
		String url = "jdbc:mysql://localhost:3306/scott?serverTimezone=UTC";
//		String url = "jdbc:mysql://127.0.0.1:3306/scott?serverTimezone=UTC";
		String user = "scott";
		String pass = "tiger";

		Connection con;
		Statement stat;
		String q = "insert into customer values (729,'Genie','la')";

		try {
			// 1. DriverMananger �� driver ���
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Connection ����
			con = DriverManager.getConnection(url, user, pass);

			// 3. Statement ����
			stat = con.createStatement();

			// 4. Query ����
			int row = stat.executeUpdate(q);

			System.out.println(row + "�ุŭ �߰��Ͽ����ϴ�.");
			// 6. ������
			stat.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
