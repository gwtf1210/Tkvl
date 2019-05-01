package com.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mybatis.dao.BoardDAO;
import com.mybatis.vo.Board;

/**  */
@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO dao;

	@Override
	public List<Board> selectAll() {
		return dao.selectAll();
	}

	@Override
	@Transactional
	public Board read(String num, int type) {
		if (type == 0) { // default
			dao.updateCount(num);
		}
		return dao.read(num);
	}

	@Override
	public void insert(Board b) {
		dao.insert(b);
	}

	@Override
	public void delete(String num) {
		dao.delete(num);
	}

	@Override
	public void modify(Board b) {
		dao.modify(b);
	}

	@Override
	public List<Board> findByTitle(String word) {
		return dao.findByTitle(word);
	}

	@Override
	public List<Board> findByName(String word) {
		return dao.findByName(word);
	}
}
