package com.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybatis.dao.EmpDAO;
import com.mybatis.vo.Emp;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	EmpDAO dao;
	
	@Override
	public List<Emp> selectAll() {
		return dao.selectAll();
	}

	@Override
	public Emp selectOne(String id) {
		return dao.selectOne(id);
	}

	@Override
	public void insert(Emp e) {
		dao.insert(e);
	}

	@Override
	public List<Emp> findByName(String name) {
		return dao.findByName(name);
	}

}
