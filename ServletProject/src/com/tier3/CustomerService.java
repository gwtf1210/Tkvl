package com.tier3;

import java.util.List;

public interface CustomerService {
	public List<Customer> selectAll();
	
	public Customer selectOne(String num);
	
	public void insert(Customer c);
	
	public void delete(String num);
	
	public void update(Customer c);
	
	public List<Customer> select(String address);
}
