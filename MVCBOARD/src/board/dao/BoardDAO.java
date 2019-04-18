package board.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import board.service.BoardService;
import board.vo.Board;

public class BoardDAO implements BoardService {
	DataSource ds;

	public BoardDAO() {
		try {
			// 1. JNDI를 사용해서 ConnectionPool 찾아오기
			InitialContext context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/mysql"); // 공유자원을 찾아오기
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Board> selelectAll() {
		ArrayList<Board> b = new ArrayList<>();
		String q = "select * from board order by wdate desc";

		try {
			Connection con = ds.getConnection();
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery(q);

			while (rs.next()) {
				int num = Integer.parseInt(rs.getString(1));
				String pass = rs.getString(2);
				String name = rs.getString(3);
				String wdate = rs.getString(4);
				String title = rs.getString(5);
				String content = rs.getString(6);
				int count = Integer.parseInt(rs.getString(7));

				b.add(new Board(num, pass, name, wdate, title, content, count));
			}
			stat.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public Board selectOne(int snum) {
		String q = "select * from board where num=" + snum;
		Board b = null;
		try {
			Connection con = ds.getConnection();
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery(q);

			if (rs.next()) {
				int num = Integer.parseInt(rs.getString(1));
				String pass = rs.getString(2);
				String name = rs.getString(3);
				String wdate = rs.getString(4);
				String title = rs.getString(5);
				String content = rs.getString(6);
				int count = Integer.parseInt(rs.getString(7));

				b = new Board(num, pass, name, wdate, title, content, count);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return b;
	}

	@Override
	public void insert(Board b) {
		String pass = b.getPass();
		String name = b.getName();
		String title = b.getTitle();
		String content = b.getContent();
		
		String q = "insert into board values(null" + " , '" + pass + "' , '" + name + "' , sysdate() , '" + title + "' , '" + content
				+ "', 0)";

		try {
			Connection con = ds.getConnection();
			Statement stat = con.createStatement();
			int cnt = stat.executeUpdate(q);
			stat.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return;
	}

	@Override
	public void delete(int num) {
		String q = "delete from board where num=" + num;
		try {
			Connection con = ds.getConnection();
			Statement stat = con.createStatement();
			int cnt = stat.executeUpdate(q);

			stat.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return;
	}

	@Override
	public void modify(Board b) {
		int num = b.getNum();
		String pass = b.getPass();
		String name = b.getName();
		String wdate = b.getWdate();
		String title = b.getTitle();
		String content = b.getContent();
		int count = b.getCount();

		String q = "update board set name='" + name + "' where num=" + num;

		try {
			Connection con = ds.getConnection();
			Statement stat = con.createStatement();
			int cnt = stat.executeUpdate(q);

			stat.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return;
	}

	@Override
	public ArrayList<Board> search(String condition, String word) {
		ArrayList<Board> list = selelectAll();
		ArrayList<Board> temp = new ArrayList<>();
		if (condition.equals("num")) {
			for (Board b : list) {
				if (b.getName().equals(word)) {
					temp.add(b);
				}
			}
		} else if (condition.equals("name")) {
			for (Board b : list) {
				if (b.getName().equals(word)) {
					temp.add(b);
				}
			}
		}
		return temp;
	}

	@Override
	public void increaseCount(Board b) {
		int num = b.getNum();
		String pass = b.getPass();
		String name = b.getName();
		String wdate = b.getWdate();
		String title = b.getTitle();
		String content = b.getContent();
		int count = b.getCount();

		String q = "update board set count='" + (count + 1) + "' where num=" + num;
		try {
			Connection con = ds.getConnection();
			Statement stat = con.createStatement();
			int cnt = stat.executeUpdate(q);

			stat.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return;
	}
}
