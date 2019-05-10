package com.mybatis.mapper;

import java.util.List;

import com.mybatis.vo.Emp;

public interface EmpMapper {
	public List<Emp> selectAll();

	public Emp selectOne(String id); // findById

	public void insert(Emp e);

	public List<Emp> findByName(String name);

}
