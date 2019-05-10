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

import com.mybatis.service.BoardService;
import com.mybatis.vo.Board;

// @RestController : @Controller + @ResponseBody
@RestController
public class BoardRestController {

	@Autowired
	BoardService service;

	// localhost:8080/rest/users
	@RequestMapping(value = "/articles", method = RequestMethod.GET)
	public List<Board> allBoards() {
		return service.selectAll();
	}

	@RequestMapping(value = "/articles/{num}", method = RequestMethod.GET)
	public Board oneBoard(@PathVariable String num) {
		return service.read(num, 0);
	}

	@RequestMapping(value = "/articles/{find}/{val}", method = RequestMethod.GET, headers = {
			"Content-type=application/json" })
	public List<Board> findBoard(@PathVariable String find, @PathVariable String val) {
		if (find.equals("name")) {
			return service.findByName(val);
		} else if (find.equals("title")) {
			return service.findByTitle(val);
		}
		return null;
	}

	@RequestMapping(value = "/articles/{num}", method = RequestMethod.DELETE)
	public String deleteBoard(@PathVariable String num) {
		service.delete(num);
		return "delete success";
	}

	@RequestMapping(value = "/articles", method = RequestMethod.POST, produces = { "application/json;charset=euc-kr" })
	public Map insertBoard(@RequestBody Board b) { // @RequestBody:Request에 담겨져 서버로 전송되는 데이터(json)을 자바 객체로 변환해 줌.
													// json -> java
		service.insert(b);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "insert success");
		return map;
	}

	@RequestMapping(value = "/articles", method = RequestMethod.PUT, headers = { "Content-type=application/json" })
	public Map modifyBoard(@RequestBody Board b) {
		service.modify(b);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "update success");
		return map;
	}
}
