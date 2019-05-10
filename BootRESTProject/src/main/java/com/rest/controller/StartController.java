package com.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StartController {
	@RequestMapping(value="/start",method=RequestMethod.GET)
	public String start() {
		return "customerRestService"; // jsp 파일명. view 이름
	}
}
