package com.mybatis.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mybatis.mapper.EmpMapper;
import com.mybatis.vo.Emp;

@Repository
public class EmpDAOImpl implements EmpDAO {

	@Autowired
	EmpMapper mapper;
	
	@Override
	public List<Emp> selectAll() {
		return mapper.selectAll();
	}

	@Override
	public Emp selectOne(String id) {
		return mapper.selectOne(id);
	}

	@Override
	public void insert(Emp e) {
		mapper.insert(e);
	}

	@Override
	public List<Emp> findByName(String name) {
		return mapper.findByName(name);
	}
}
