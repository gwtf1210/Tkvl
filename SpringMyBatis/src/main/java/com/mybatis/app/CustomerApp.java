package com.mybatis.app;

import java.util.HashMap;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mybatis.service.CustomerService;
import com.mybatis.vo.Customer;

public class CustomerApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("customer.xml");
		CustomerService service = context.getBean("service", CustomerService.class);
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("num", "679");
		map.put("name", "diane");
		map.put("address", "london");
		service.insert2(map);

		List<Customer> list = service.selectAll();
		for (Customer c : list) {
			System.out.println(c.getNum() + " : " + c.getName() + " : " + c.getAddress());
		}
		System.out.println();

		Customer c1 = service.selectOne("111");
		System.out.println(c1.getNum() + " : " + c1.getName() + " : " + c1.getAddress());

		System.out.println();
		service.insert(new Customer("888", "며나짱2", "북경"));
		Customer c2 = service.selectOne("888");
		System.out.println(c2.getNum() + " : " + c2.getName() + " : " + c2.getAddress());
		System.out.println();

		service.delete("888");
		list = service.selectAll();
		for (Customer c : list) {
			System.out.println(c.getNum() + " : " + c.getName() + " : " + c.getAddress());
		}
		System.out.println();

		service.update(new Customer("777", "며나짱", "수정된함경북도짜응~"));
		Customer c3 = service.selectOne("777");
		System.out.println(c3.getNum() + " : " + c3.getName() + " : " + c3.getAddress());
		System.out.println();

		list = service.findByAddress("%seo%");
		for (Customer c : list) {
			System.out.println(c.getNum() + " : " + c.getName() + " : " + c.getAddress());
		}
		System.out.println();
	}
}
