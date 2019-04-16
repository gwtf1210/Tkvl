package com.tier3;

import java.util.List;

// client ���α׷�. CustomerDAO�� �̿�
public class CustomerApp {
	public static void main(String[] args) {

		CustomerDAO dao = new CustomerDAO();
		List<Customer> list = dao.selectAll();
		for (Customer c : list) {
			System.out.println(c.getNum() + " -- " + c.getName() + " -- " + c.getAddress());
		}
		System.out.println("--------------------------------------------------------");

		Customer c2 = dao.selectOne("111");
		System.out.println(c2.getNum() + "--" + c2.getName() + "--" + c2.getAddress());
		System.out.println("--------------------------------------------------------");

		int idx = 500;
		dao.insert(new Customer(idx + "", "�̱⹮", "����"));
		idx++;
		list = dao.selectAll();
		for (Customer c : list) {
			System.out.println(c.getNum() + " -- " + c.getName() + " -- " + c.getAddress());
		}
		System.out.println("--------------------------------------------------------");
		
		dao.update(dao.selectOne("111"));
		idx++;
		list = dao.selectAll();
		for (Customer c : list) {
			System.out.println(c.getNum() + " -- " + c.getName() + " -- " + c.getAddress());
		}
		System.out.println("--------------------------------------------------------");
		
		dao.delete("111");
		list = dao.selectAll();
		for (Customer c : list) {
			System.out.println(c.getNum() + " -- " + c.getName() + " -- " + c.getAddress());
		}
		dao.insert(new Customer("111", "dada", "seoul"));
		System.out.println("--------------------------------------------------------");
		
		list = dao.select("����");
		for (Customer c : list) {
			System.out.println(c.getNum() + " -- " + c.getName() + " -- " + c.getAddress());
		}
		System.out.println("--------------------------------------------------------");
	}
}
