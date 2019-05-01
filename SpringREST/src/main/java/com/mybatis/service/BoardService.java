package com.mybatis.service;

import java.util.List;

import com.mybatis.vo.Board;

// CLIENT(BoardApp.java)를 위한 인터페이스
public interface BoardService {
	public List<Board> selectAll();

	public Board selectOne(String num);

	public void insert(Board b);

	public void delete(String num);
}
