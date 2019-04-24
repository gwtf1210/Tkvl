package com.mybatis.mapper;

import java.util.List;

import com.mybatis.vo.Board;

public interface BoardMapper {
	public List<Board> selectAll();

	public Board read(String num);

	public void insert(Board b);

	public void delete(String num);

	public void updateCount(String num);
}
