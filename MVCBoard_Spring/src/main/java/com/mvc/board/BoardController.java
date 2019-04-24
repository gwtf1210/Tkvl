package com.mvc.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mybatis.service.BoardService;
import com.mybatis.vo.Board;

@Controller
public class BoardController {

	@Autowired
	BoardService service;

	@RequestMapping(value = "/index.bod", method = RequestMethod.GET)
	public String list(Model model) { // 테이블안의 모든 데이터 검색해서 리턴해줌
		List<Board> list = service.selectAll();
		model.addAttribute("list", list);
		return "index";
	}

	@RequestMapping(value = "/read.bod", method = RequestMethod.GET)
	// public String list(Model model, String num) { // 다른 방법
	public String list(Model model, @RequestParam(value = "num") String number) { // 테이블안의 모든 데이터 검색해서 리턴해줌
		Board Board = service.read(number);
		model.addAttribute("bod", Board);
		return "read";
	}

	@RequestMapping(value = "/insert.bod", method = RequestMethod.GET)
	public String insert(Board c) { // 테이블안의 모든 데이터 검색해서 리턴해줌
		return "insert";
	}

	@RequestMapping(value = "/insert.bod", method = RequestMethod.POST)
	// public String list(Model model, String num) { // 다른 방법
	public String insertProcess(Model model, @ModelAttribute Board b) { // 테이블안의 모든 데이터 검색해서 리턴해줌
		Board bod = new Board("0", b.getPass(), b.getName(), "", b.getTitle(), b.getContent(), "0");
		service.insert(bod);
		model.addAttribute("bod", bod);
		return "redirect:/index.bod";
	}

	@RequestMapping(value = "/delete.bod", method = RequestMethod.GET)
	// public String list(Model model, String num) { // 다른 방법
	public String delete(String num) { // 테이블안의 모든 데이터 검색해서 리턴해줌
		service.delete(num);
		return "redirect:/index.bod";
	}
}
