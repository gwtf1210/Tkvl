package board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
			// 1. JNDI�� ����ؼ� ConnectionPool ã�ƿ���
			InitialContext context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/mysql"); // �����ڿ��� ã�ƿ���

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Board> selectAll() {
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public Board selectOne(int snum) {
		Board b = null;
		try {
			String q = "select * from board where num=" + snum;
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
		try {
			String q = "insert into board values(null,?,?,sysdate(),?,?,0)";

			Connection con = ds.getConnection();
			// 3. Statement ����
			PreparedStatement pstat = con.prepareStatement(q);

			pstat.setString(1, b.getPass());
			pstat.setString(2, b.getName());
			pstat.setString(3, b.getTitle());
			pstat.setString(4, b.getContent());

			int rs = pstat.executeUpdate();
			// 5. db���� �� ��� ó��
			System.out.println(rs + "���� ���ڵ� �߰�!");

			pstat.close();
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
			PreparedStatement pstat = con.prepareStatement(q);
			int rs = pstat.executeUpdate(q);
			System.out.println(num + "�� ������ ���� �Ϸ�!");
			pstat.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return;
	}

	@Override
	public void modify(Board b) {
		try {
			String q = "update board set wdate = sysdate(), title = ?, content = ? where num = " + b.getNum();

			Connection con = ds.getConnection();
			PreparedStatement pstat = con.prepareStatement(q);

			pstat.setString(1, b.getTitle());
			pstat.setString(2, b.getContent());
			int rs = pstat.executeUpdate();
			System.out.println(rs + "���� ���ڵ� ����!");
			pstat.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return;
	}

	@Override
	public ArrayList<Board> search(String condition, String word) {
		ArrayList<Board> temp = new ArrayList<>();
		try {
			ArrayList<Board> list = selectAll();
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		return temp;
	}

	@Override
	public void modifyCnt(Board b) {
		try {
			String q = "update board set count = ? where num = " + b.getNum();
			Connection con = ds.getConnection();
			// 3. Statement ����
			PreparedStatement pstat = con.prepareStatement(q);

			// 3-1. ?�� �� setting
			pstat.setInt(1, b.getCount());

			// 4. Query ����
			int rs = pstat.executeUpdate();

			// 5. db���� �� ��� ó��
			System.out.println(rs + "���� ���ڵ� ����!");

			// 6. ������
			pstat.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
