package com.mybatis.mapper;

import java.util.HashMap;
import java.util.List;

import com.mybatis.vo.Customer;

// CLIENT(CustomerDAOImpl.java)瑜� �쐞�븳 �씤�꽣�럹�씠�뒪
public interface CustomerMapper {
	public List<Customer> selectAll();

	public Customer selectOne(String num);

	public void insert(Customer c);

	public void insert2(HashMap map);

	public void delete(String num);

	public void update(Customer c); // 踰덊샇湲곗��쑝濡� 二쇱냼留� �닔�젙

	public List<Customer> findByAddress(String address);

}
