package com.mybatis.dao;

import java.util.List;

import com.mybatis.vo.Board;

// CLIENT(BoardApp.java)
public interface BoardDAO {
	public List<Board> selectAll();

	public Board read(String num);

	public void insert(Board b);

	public void delete(String num);

	public void updateCount(String num);
}
