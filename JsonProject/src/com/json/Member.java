package com.json;

public class Member {
	private String num, name, address;

	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", address=" + address + "]";
	}

	public Member() {
	}
	
	public Member(String num, String name, String address) {
		super();
		this.num = num;
		this.name = name;
		this.address = address;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
