package com.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.service.AddressBookService;
import com.mvc.vo.AddressBook;

@Controller
public class AddressBookController {

	@Autowired
	AddressBookService service;

	@RequestMapping(value = "/login.addr", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/login.addr", method = RequestMethod.POST)
	public String loginProcess(HttpSession session, Model model, String id, String name) {
		System.out.println(id + ", " + name);
		AddressBook member = service.loginCheck(id);
		if (member != null && member.getName().equals(name)) {
			session.setAttribute("id", id);
			return "redirect:/list.addr";
		} else {
			model.addAttribute("msg", "아이디와 비밀번호를 확인해주세요.");
			return "login";
		}
	}

	@RequestMapping(value = "/logout.addr", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.setAttribute("id", null);
		return "redirect:/login.addr";
	}

	@RequestMapping(value = "/list.addr", method = RequestMethod.GET)
	public String list(Model model) {
		System.out.println("�뱾�뼱�샂");

		List<AddressBook> list = service.list();
		model.addAttribute("list", list);

		return "list"; // view �씠由�
	}

	@RequestMapping(value = "/detail.addr", method = RequestMethod.GET)
	public String detail(Model model, String id) {
		AddressBook book = service.detail(id);
		model.addAttribute("book", book);
		return "detail"; // view �씠由�
	}

	@RequestMapping(value = "/insert.addr", method = RequestMethod.GET)
	public String insertProcess(HttpSession session) {
		if (session.getAttribute("id") == null) {
			return "login";
		} else {
			return "insert"; // view �씠由�
		}
	}

	@RequestMapping(value = "/insert.addr", method = RequestMethod.POST)
	public String insertProcess(AddressBook book) {
		service.insert(
				new AddressBook(book.getId(), book.getName(), book.getPhone(), book.getAddress(), book.getCompany()));
		return "redirect:/list.addr"; 
	}

	@RequestMapping(value = "/delete.addr", method = RequestMethod.GET)
	public String deleteProcess(String id) {
		service.delete(id);
		return "redirect:/list.addr"; // view �씠由�
	}

	@RequestMapping(value = "/search.addr", method = RequestMethod.POST)
	public String search(Model model, String condition, String word) {
		List<AddressBook> list;
		word = "%" + word + "%";
		if (condition.equals("이름")) {
			list = service.searchByName(word);
		} else if (condition.equals("회사")) {
			list = service.searchByCompany(word);
		} else {
			list = service.searchByAddress(word);
		}
		model.addAttribute("list",list);
		return "search"; // view �씠由�
	}
	

	//Controller 안에 예외처리하는 메소드 추가하기
	@ExceptionHandler(Exception.class)
	public String handleException() {
		return "error"; //view 이름
	}


}
