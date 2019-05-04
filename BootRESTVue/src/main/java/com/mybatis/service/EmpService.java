package com.mybatis.service;

import java.util.List;

import com.mybatis.vo.Emp;

public interface EmpService {
	public List<Emp> selectAll();
	public Emp selectOne(String id); // findById
	public void insert(Emp e);
	public List<Emp> findByName(String name);
}
