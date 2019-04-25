package com.mvc.mapper;

import java.util.List;

import com.mvc.vo.AddressBook;

public interface BoardMapper {
	public List<AddressBook> list();

	public AddressBook detail(String id); // 로그인시 재사용

	public void insert(AddressBook addressBook);

	public List<AddressBook> searchByName(String name);

	public List<AddressBook> searchByCompany(String company);

	public List<AddressBook> searchByAddress(String address);

	public AddressBook loginCheck(String id);

	public void delete(String id);
}
