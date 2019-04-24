package com.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mybatis.dao.BoardDAO;
import com.mybatis.vo.Board;

/**  */
@Service("bservice")
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO dao;

	@Override
	public List<Board> selectAll() {
		return dao.selectAll();
	}

	@Override
	@Transactional
	public Board selectOne(String num) {
		dao.updateCount(num);
		return dao.selectOne(num);
	}

	@Override
	public void insert(Board b) {
		dao.insert(b);
	}

	@Override
	public void delete(String num) {
		dao.delete(num);
	}
}
