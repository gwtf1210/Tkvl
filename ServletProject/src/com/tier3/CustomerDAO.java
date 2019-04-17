package com.tier3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.sql.DataSource;

public class CustomerDAO implements CustomerService {
	DataSource ds; // ConnectionPool

	public CustomerDAO() {
		try {
			// 1. JNDI를 사용해서 ConnectionPool 찾아오기
			InitialContext context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/mysql"); // 공유자원을 찾아오기
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Customer> selectAll() {
		List<Customer> list_tmp = new ArrayList<Customer>();
		String q = "select * from customer";

		try {
			Connection con = ds.getConnection();
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery(q);

			while (rs.next()) {
				String num = rs.getString(1);
				String name = rs.getString(2);
				String address = rs.getString(3);

				list_tmp.add(new Customer(num, name, address));
			}

			stat.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list_tmp;
	}

	@Override
	public Customer selectOne(String num) {
		Customer customer = new Customer();
		String q = "select * from customer where num=" + num;

		try {
			// 2. Connection ����
			Connection con = ds.getConnection();
			// 3. Statement ����
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery(q);

			if (rs.next()) {
				customer.setNum(rs.getString(1));
				customer.setName(rs.getString(2));
				customer.setAddress(rs.getString(3));
			}

			stat.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return customer;
	}

	@Override
	public void insert(Customer c) {
		Customer customer = new Customer();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = ds.getConnection();
			String num = c.getNum();
			String name = c.getName();
			String address = c.getAddress();

			String q = "insert into customer values(?,?,?)";
			PreparedStatement pstat = con.prepareStatement(q);

			pstat.setString(1, num);
			pstat.setString(2, name);
			pstat.setString(3, address);

			int cnt = pstat.executeUpdate();

			System.out.println(cnt);
			pstat.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(String num) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = ds.getConnection();
			String q = "delete from customer where num = ?";
			PreparedStatement pstat = con.prepareStatement(q);

			pstat.setString(1, num);

			int cnt = pstat.executeUpdate();

			System.out.println(cnt + "�ุŭ �����Ͽ����ϴ�.");
			// 6. ������
			pstat.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Customer c) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = ds.getConnection();
			String q = "update customer set address = ? where num = ?";
			PreparedStatement pstat = con.prepareStatement(q);

			pstat.setString(1, "�Ͽ���");
			pstat.setString(2, c.getNum());

			int cnt = pstat.executeUpdate();

			System.out.println(cnt + "�ุŭ ������Ʈ�Ͽ����ϴ�.");
			// 6. ������
			pstat.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Customer> select(String address) {
		List<Customer> list_tmp = new ArrayList<Customer>();
		String q = "select * from customer where address='" + address + "'";

		try {
			// 2. Connection ����
			Connection con = ds.getConnection();
			// 3. Statement ����
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery(q);

			if (rs.next()) {
				list_tmp.add(new Customer(rs.getString(1), rs.getString(2), rs.getString(3)));
			}

			stat.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list_tmp;
	}
}
