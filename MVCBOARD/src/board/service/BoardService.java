package board.service;

import java.util.ArrayList;

import board.vo.Board;

public interface BoardService {
	public ArrayList<Board> selectAll();
	public Board selectOne(int num);
	public void insert(Board b);
	public void delete(int num);
	public void modify(Board b);
	public ArrayList<Board> search(String condition, String word);
	public void modifyCnt(Board b);
}
