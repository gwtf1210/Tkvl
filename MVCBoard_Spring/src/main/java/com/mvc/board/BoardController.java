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
	public String list(Model model) { // ���̺���� ��� ������ �˻��ؼ� ��������
		List<Board> list = service.selectAll();
		model.addAttribute("list", list);
		return "index";
	}

	@RequestMapping(value = "/read.bod", method = RequestMethod.GET)
	// public String list(Model model, String num) { // �ٸ� ���
	public String list(Model model, @RequestParam(value = "num") String number) { // ���̺���� ��� ������ �˻��ؼ� ��������
		Board Board = service.read(number);
		model.addAttribute("bod", Board);
		return "read";
	}

	@RequestMapping(value = "/insert.bod", method = RequestMethod.GET)
	public String insert(Board c) { // ���̺���� ��� ������ �˻��ؼ� ��������
		return "insert";
	}

	@RequestMapping(value = "/insert.bod", method = RequestMethod.POST)
	// public String list(Model model, String num) { // �ٸ� ���
	public String insertProcess(Model model, @ModelAttribute Board b) { // ���̺���� ��� ������ �˻��ؼ� ��������
		Board bod = new Board("0", b.getPass(), b.getName(), "", b.getTitle(), b.getContent(), "0");
		service.insert(bod);
		model.addAttribute("bod", bod);
		return "redirect:/index.bod";
	}

	@RequestMapping(value = "/delete.bod", method = RequestMethod.GET)
	// public String list(Model model, String num) { // �ٸ� ���
	public String delete(String num) { // ���̺���� ��� ������ �˻��ؼ� ��������
		service.delete(num);
		return "redirect:/index.bod";
	}
}
