package mvc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import mvc.service.MemberService;
import mvc.vo.Member;

// DAO(Data Access Object : 데이터 처리 객체 CRUD : create, read, update, delete)
public class MemberDAO implements MemberService {

	ArrayList<Member> list;
	DataSource ds; // ConnectionPool

	public MemberDAO() {
		try {
			// 1. JNDI를 사용해서 ConnectionPool 찾아오기
			InitialContext context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/mysql"); // 공유자원을 찾아오기
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Member> selelectAll() {
		ArrayList<Member> m = new ArrayList<Member>();
		String q = "select * from member";

		try {
			Connection con = ds.getConnection();
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery(q);

			while (rs.next()) {
				String mid = rs.getString(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				String tel = rs.getString(3);

				m.add(new Member(mid, name, address, tel));
			}

			stat.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return m;
	}

	@Override
	public Member selectOne(String id) {
		String q = "select * from member where mid=" + id;
		Member m = null;
		try {
			Connection con = ds.getConnection();
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery(q);
			if (rs.next()) {
				String mid = rs.getString(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				String tel = rs.getString(4);

				m = new Member(mid, name, address, tel);
			}

			stat.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return m;
	}

	@Override
	public void insert(Member m) {
		String mid = m.getId();
		String name = m.getName();
		String address = m.getAddress();
		String tel = m.getTel();

		String q = "insert into member values(" + mid + "," + name + "," + address + "," + tel + ")";
		try {
			Connection con = ds.getConnection();
			Statement stat = con.createStatement();
			int cnt = stat.executeUpdate(q);

			stat.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return;
	}

	@Override
	public void delete(String id) {
		String q = "delete from member where mid=" + id;
		try {
			Connection con = ds.getConnection();
			Statement stat = con.createStatement();
			int cnt = stat.executeUpdate(q);

			stat.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return;
	}

	@Override
	public ArrayList<Member> search(String condition, String word) {

		return null;
	}

	@Override
	public void modify(Member m) {
		String mid = m.getId();
		String name = m.getName();
		String address = m.getAddress();
		String tel = m.getTel();

		String q = "update member set name='" + name + "' where mid=" + mid;

		try {
			Connection con = ds.getConnection();
			Statement stat = con.createStatement();
			int cnt = stat.executeUpdate(q);

			System.out.println(cnt);
			stat.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return;
	}
}
