package com.mybatis.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mybatis.mapper.BoardMapper;
import com.mybatis.vo.Board;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	BoardMapper mapper;

	@Override
	public List<Board> selectAll() {
		return mapper.selectAll();
	}

	@Override
	public Board read(String num) {
		return mapper.read(num);
	}

	@Override
	public void insert(Board b) {
		mapper.insert(b);
	}

	@Override
	public void delete(String num) {
		mapper.delete(num);
	}

	@Override
	public void updateCount(String num) {
		mapper.updateCount(num);
	}

	@Override
	public void modify(Board b) {
		mapper.modify(b);
	}

	@Override
	public List<Board> findByTitle(String word) {
		return mapper.findByTitle(word);
	}

	@Override
	public List<Board> findByName(String word) {
		return mapper.findByName(word);
	}
}
