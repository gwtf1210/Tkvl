package com.mvc.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// http://localhost:8080/mvc/home.mvc --> DispatcherServlet
@Controller
public class HomeController {
	@RequestMapping(value = "/home.mvc", method = RequestMethod.GET)
	public String home(Model model) {
		// Model:map������ ������ ���� ��ü
		model.addAttribute("city", "seattle");
		return "home"; // logical view name
	}
	
	@RequestMapping(value = "/school.mvc", method = RequestMethod.GET)
	public String school(Model model) {
		// Model:map������ ������ ���� ��ü
		
		model.addAttribute("name", "������");
		model.addAttribute("score", "100");
		
		return "school"; // logical view name
	}
	
	
}
