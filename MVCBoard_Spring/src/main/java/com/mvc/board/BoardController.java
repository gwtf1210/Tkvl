package com.mvc.board;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mybatis.service.BoardService;
import com.mybatis.service.MemberService;
import com.mybatis.vo.Board;
import com.mybatis.vo.Member;

@Controller
public class BoardController {

	@Autowired
	BoardService service;
	
	@Autowired
	MemberService mservice;

	@RequestMapping(value = "/index.bod", method = RequestMethod.GET)
	public String list(Model model) { // 테이블안의 모든 데이터 검색해서 리턴해줌
		List<Board> list = service.selectAll();
		model.addAttribute("list", list);
		return "index";
	}

	@RequestMapping(value = "/read.bod", method = RequestMethod.GET)
	// public String list(Model model, String num) { // 다른 방법
	public String list(Model model, @RequestParam(value = "num") String number) { // 테이블안의 모든 데이터 검색해서 리턴해줌
		Board Board = service.read(number, 0);
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

	// homework
	@RequestMapping(value = "/modify.bod", method = RequestMethod.GET)
	public String modify(Model model, @RequestParam(value = "num") String number) { // 테이블안의 모든 데이터 검색해서 리턴해줌
		Board board = service.read(number, 1);
		model.addAttribute("bod", board);
		System.out.println(board.getContent());
		return "modify";
	}

	@RequestMapping(value = "/modify.bod", method = RequestMethod.POST)
	public String modifyProcess(@ModelAttribute Board b) { // 테이블안의 모든 데이터 검색해서 리턴해줌
		Board bod = new Board(b.getNum(), b.getPass(), b.getName(), "", b.getTitle(), b.getContent(), "0");
		service.modify(bod);
		return "redirect:/index.bod";
	}

	@RequestMapping(value = "/search.bod", method = RequestMethod.POST)
	public String search(Model model, String key, String word) { // 테이블안의 모든 데이터 검색해서 리턴해줌
		List<Board> list = null;

		System.out.println(key + ", " + word);
		word = "%" + word + "%";
		if (key.equals("TITLE")) {
			list = service.findByTitle(word);

		} else if (key.equals("NAME")) {
			list = service.findByName(word);
		}

		model.addAttribute("list", list);
		return "search";
	}

	@RequestMapping(value = "loginProcess.bod", method = RequestMethod.POST)
	public String loginProcess(HttpSession session, String id, String pass) {
		System.out.println(id);
		Member m = mservice.selectOne(id);
		System.out.println(m.getPass());
		if(m.getPass().equals(pass)) {
			session.setAttribute("id", id);
			return "redirect:/index.bod";
		}else {
			return "redirect:/login.bod";
		}
	}
	
	@RequestMapping(value = "logoutProcess.bod", method = RequestMethod.GET)
	public String logoutProcess(HttpSession session) {
		session.setAttribute("id", null);
		return "redirect:/index.bod";
	}
}
