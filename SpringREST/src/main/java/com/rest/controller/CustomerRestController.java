package com.rest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mybatis.service.CustomerService;
import com.mybatis.vo.Customer;

// @RestController : @Controller + @ResponseBody
@RestController
public class CustomerRestController {

	@Autowired
	CustomerService service;

	// localhost:8080/rest/users
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public List<Customer> allCustomers() {
		return service.selectAll();
	}

	@RequestMapping(value = "/customers/{num}", method = RequestMethod.GET)
	public Customer oneCustomer(@PathVariable String num) {
		return service.selectOne(num);
	}

	@RequestMapping(value = "/customers/{num}", method = RequestMethod.DELETE)
	public String deleteCustomer(@PathVariable String num) {
		service.delete(num);
		return "delete success";
	}

	@RequestMapping(value = "/customers", method = RequestMethod.POST, produces = { "application/json;charset=euc-kr" })
	public Map insertCustomer(@RequestBody Customer c) { // @RequestBody:Request에 담겨져 서버로 전송되는 데이터(json)을 자바 객체로 변환해 줌.
															// json -> java
		service.insert(c);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "insert success");
		return map;
	}

	@RequestMapping(value = "/customers", method = RequestMethod.PUT, headers = { "Content-type=application/json" })
	public Map updateCustomer(@RequestBody Customer c) {
		service.update(c);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "update success");
		return map;
	}

}
