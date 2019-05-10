package com.mvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.mapper.BoardMapper;
import com.mvc.vo.AddressBook;

@Repository
public class AddressBookDAOImpl implements AddressBookDAO {

	@Autowired
	BoardMapper mapper;

	@Override
	public List<AddressBook> list() {
		return mapper.list();
	}

	@Override
	public AddressBook detail(String id) {
		return mapper.detail(id);
	}

	@Override
	public void insert(AddressBook addressBook) {
		mapper.insert(addressBook);
	}

	@Override
	public List<AddressBook> searchByName(String name) {
		System.out.println(name);
		return mapper.searchByName(name);
	}

	@Override
	public List<AddressBook> searchByCompany(String company) {
		return mapper.searchByCompany(company);
	}

	@Override
	public List<AddressBook> searchByAddress(String address) {
		return mapper.searchByAddress(address);
	}

	@Override
	public AddressBook loginCheck(String id) {
		return mapper.loginCheck(id);
	}

	@Override
	public void delete(String id) {
		mapper.delete(id);
	}
	
	

}
