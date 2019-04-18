/*
package board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import board.service.BoardService;
import board.vo.Board;

public class BoardDAO implements BoardService{
	
	ArrayList<Board> list;
	DataSource ds;
	
	public BoardDAO() {
		try {
			
			InitialContext context = new InitialContext();
			ds = (DataSource)context.lookup("java:comp/env/jdbc/mysql"); // 공유자원을 찾아오기
			
		} catch (Exception e) {
			
		}
	}

	@Override
	public ArrayList<Board> selectAll() {
		ArrayList<Board> list = new ArrayList<>();
		
		try {
			String q = "select num, name, wdate, title, count from board order by wdate desc, num desc";
			Connection con = ds.getConnection();
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery(q);

			// 5. db에서 온 결과 처리
			while (rs.next() == true) {
				int num = rs.getInt(1);
				String name = rs.getString(2);
				String wdate = rs.getString(3);
				String title = rs.getString(4);
				int count = rs.getInt(5);
				list.add(new Board(num, name, wdate, title, count));
			}

			// 6. 마무리
			stat.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Board selectOne(int num) throws Exception {
		Board b = null;
		
		try {
			String q = "select num, name, wdate, count, title, content from board where num = " + num;
			Connection con = ds.getConnection();
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery(q);

			// 5. db에서 온 결과 처리
			rs.next();
			int num1 = rs.getInt(1);
			String name = rs.getString(2);
			String wdate = rs.getString(3);
			int count = rs.getInt(4);
			String title = rs.getString(5);
			String content = rs.getString(6);

			
			b = new Board(num1, name, wdate, count, title, content);
			
			// 6. 마무리
			stat.close();
			con.close();
		} catch (SQLException e) {
			throw new Exception();//************
		}
		
		return b;
	}

	@Override
	public void insert(Board b) {
		try {
			String q = "insert into board values(null,?,?,sysdate(),?,?,0)";
			Connection con = ds.getConnection();

			// 3. Statement 생성
			PreparedStatement pstat = con.prepareStatement(q);

			// 3-1. ?에 값 setting
			pstat.setString(1, b.getPass());
			pstat.setString(2, b.getName());
			pstat.setString(3, b.getTitle());
			pstat.setString(4, b.getContent());

			// 4. Query 전송
			int rs = pstat.executeUpdate();

			// 5. db에서 온 결과 처리
			System.out.println(rs + "개의 레코드 추가!");

			// 6. 마무리
			pstat.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int num) {
		try {
			String q = "delete from board where num = '" + num + "'";
			Connection con = ds.getConnection();
			// 3. Statement 생성
			PreparedStatement pstat = con.prepareStatement(q);
			
			// 4. Query 전송
			int rs = pstat.executeUpdate(q);
			System.out.println(num + "번 데이터 삭제 완료!");
			// 6. 마무리
			pstat.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Board> search(String condition, String word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modify(Board b) {
		try {
			String q = "update board set wdate = sysdate(), title = ?, content = ? where num = " + b.getNum();
			Connection con = ds.getConnection();
			// 3. Statement 생성
			PreparedStatement pstat = con.prepareStatement(q);
			
			//3-1. ?에 값 setting
			pstat.setString(1, b.getTitle());
			pstat.setString(2, b.getContent());
			
			//4. Query 전송
			int rs = pstat.executeUpdate();
			
			//5. db에서 온 결과 처리
			System.out.println(rs + "개의 레코드 수정!");
			
			//6. 마무리
			pstat.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void modifyCnt(Board b) {
		try {
			String q = "update board set count = ? where num = " + b.getNum();
			Connection con = ds.getConnection();
			// 3. Statement 생성
			PreparedStatement pstat = con.prepareStatement(q);
			
			//3-1. ?에 값 setting
			pstat.setInt(1, b.getCount());
			
			//4. Query 전송
			int rs = pstat.executeUpdate();
			
			//5. db에서 온 결과 처리
			System.out.println(rs + "개의 레코드 수정!");
			
			//6. 마무리
			pstat.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
*/