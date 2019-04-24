package com.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mybatis.service.CustomerService;
import com.mybatis.vo.Customer;

@Controller
public class CustomerController {

	@Autowired
	CustomerService service;

	@RequestMapping(value = "/list.mvc", method = RequestMethod.GET)
	public String list(Model model) { // ���̺���� ��� ������ �˻��ؼ� ��������
		List<Customer> list = service.selectAll();
		model.addAttribute("list", list);
		return "list";
	}

	@RequestMapping(value = "/detail.mvc", method = RequestMethod.GET)
	// public String list(Model model, String num) { // �ٸ� ���
	public String list(Model model, @RequestParam(value = "num") String number) { // ���̺���� ��� ������ �˻��ؼ� ��������
		Customer customer = service.selectOne(number);
		model.addAttribute("cus", customer);
		return "detail";
	}

	@RequestMapping(value = "/insert.mvc", method = RequestMethod.GET)
	public String insert(Customer c) { // ���̺���� ��� ������ �˻��ؼ� ��������
		return "insert";
	}

	@RequestMapping(value = "/insert.mvc", method = RequestMethod.POST)
	// public String list(Model model, String num) { // �ٸ� ���
	public String insertProcess(Model model, @ModelAttribute Customer c) { // ���̺���� ��� ������ �˻��ؼ� ��������
		Customer cus = new Customer(c.getNum(), c.getName(), c.getAddress());
		service.insert(cus);
		model.addAttribute("cus", cus);
		return "insertSuccess";
	}

	@RequestMapping(value = "/delete.mvc", method = RequestMethod.GET)
	// public String list(Model model, String num) { // �ٸ� ���
	public String delete(String num) { // ���̺���� ��� ������ �˻��ؼ� ��������
		service.delete(num);
		return "redirect:/list.mvc";
	}

}
