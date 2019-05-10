package com.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dao.AddressBookDAO;
import com.mvc.vo.AddressBook;

@Service
public class AddressBookServiceImpl implements AddressBookService {

	@Autowired
	AddressBookDAO dao;

	@Override
	public List<AddressBook> list() {
		return dao.list();
	}

	@Override
	public AddressBook detail(String id) {
		return dao.detail(id);
	}

	@Override
	public void insert(AddressBook addressBook) {
		dao.insert(addressBook);
	}

	@Override
	public List<AddressBook> searchByName(String name) {
		System.out.println(name);
		return dao.searchByName(name);
	}

	@Override
	public List<AddressBook> searchByCompany(String company) {
		return dao.searchByCompany(company);
	}

	@Override
	public List<AddressBook> searchByAddress(String address) {
		return dao.searchByAddress(address);
	}

	@Override
	public AddressBook loginCheck(String id) {
		return dao.loginCheck(id);
	}

	@Override
	public void delete(String id) {
		dao.delete(id);
		
	}

}
