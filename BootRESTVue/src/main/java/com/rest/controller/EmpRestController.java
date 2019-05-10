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

import com.mybatis.service.EmpService;
import com.mybatis.vo.Emp;

// @RestController : @Controller + @ResponseBody
@RestController
public class EmpRestController {

	@Autowired
	EmpService service;

	// localhost:8080/rest/users
	@RequestMapping(value = "/emps", method = RequestMethod.GET)
	public List<Emp> allEmps() {
		return service.selectAll();
	}

	@RequestMapping(value = "/emps/{id}", method = RequestMethod.GET)
	public Emp findByID(@PathVariable String id) {
		return service.selectOne(id);
	}

	@RequestMapping(value = "/emps/{name}", method = RequestMethod.GET)
	public List<Emp> findByName(@PathVariable String name) {
		return service.findByName(name);
	}

	@RequestMapping(value = "/emps", method = RequestMethod.POST, produces = { "application/json;charset=euc-kr" })
	public Map insertEmp(@RequestBody Emp e) {
		service.insert(e);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "insert success");
		return map;
	}

}
