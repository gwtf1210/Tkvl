package com.mybatis.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mybatis.dao.CustomerDAO;
import com.mybatis.vo.Customer;

public class CustomerApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("customer.xml");

		CustomerDAO dao = context.getBean("cus", CustomerDAO.class);

		List<Customer> list = dao.selectAll();
		for (Customer c : list) {
			System.out.println(c.getNum() + " : " + c.getName() + " : " + c.getAddress());
		}
		System.out.println();

		Customer c1 = dao.selectOne("111");
		System.out.println(c1.getNum() + " : " + c1.getName() + " : " + c1.getAddress());

		System.out.println();
		dao.insert(new Customer("888", "며나짱2", "북경"));
		Customer c2 = dao.selectOne("888");
		System.out.println(c2.getNum() + " : " + c2.getName() + " : " + c2.getAddress());
		System.out.println();

		dao.delete("888");
		list = dao.selectAll();
		for (Customer c : list) {
			System.out.println(c.getNum() + " : " + c.getName() + " : " + c.getAddress());
		}
		System.out.println();

		dao.update(new Customer("777", "며나짱", "수정된함경북도짜응~"));
		Customer c3 = dao.selectOne("777");
		System.out.println(c3.getNum() + " : " + c3.getName() + " : " + c3.getAddress());
		System.out.println();

		list = dao.findByAddress("%seo%");
		for (Customer c : list) {
			System.out.println(c.getNum() + " : " + c.getName() + " : " + c.getAddress());
		}
		System.out.println();

	}
}
