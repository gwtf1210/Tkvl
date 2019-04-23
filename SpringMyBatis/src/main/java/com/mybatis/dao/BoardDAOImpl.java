package com.mybatis.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mybatis.mapper.BoardMapper;
import com.mybatis.vo.Board;

public class BoardDAOImpl implements BoardDAO {

	@Autowired
	BoardMapper mapper;

	@Override
	public List<Board> selectAll() {
		return mapper.selectAll();
	}

	@Override
	public Board selectOne(String num) {
		return mapper.selectOne(num);
	}

	@Override
	public void insert(Board b) {
		mapper.insert(b);
	}

	@Override
	public void delete(String num) {
		mapper.delete(num);
	}

}
