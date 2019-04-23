package com.mybatis.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mybatis.mapper.CustomerMapper;
import com.mybatis.vo.Customer;

// DAO(CRUD) 객체
public class CustomerDAOImpl implements CutomerDAO {

	@Autowired
	CustomerMapper mapper;

	@Override
	public List<Customer> selectAll() {
		return mapper.selectAll();
	}

	@Override
	public Customer selectOne(String num) {
		return mapper.selectOne(num);
	}

	@Override
	public void insert(Customer c) {
		mapper.insert(c);
	}

	@Override
	public void delete(String num) {
		mapper.delete(num);
	}

	@Override
	public void update(Customer c) {
		mapper.update(c);
	}

	@Override
	public List<Customer> findByAddress(String address) {
		return mapper.findByAddress(address);
	}

}
