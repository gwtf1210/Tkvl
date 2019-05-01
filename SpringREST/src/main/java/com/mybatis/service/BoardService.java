package com.mybatis.service;

import java.util.List;

import com.mybatis.vo.Board;

// CLIENT(BoardApp.java)
public interface BoardService {
	public List<Board> selectAll();

	public Board read(String num, int type);

	public void insert(Board b);

	public void delete(String num);

	public void modify(Board b);

	public List<Board> findByTitle(String word);

	public List<Board> findByName(String word);
}
