/*
package board.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.dao.BoardDAO;
import board.service.BoardService;
import board.vo.Board;

public class BoardController {
	
	BoardService dao;
	
	public BoardController() {
		dao = new BoardDAO();
	}
	

	public void list(HttpServletRequest req, HttpServletResponse res) {
		
		ArrayList<Board> list = dao.selectAll();
		req.setAttribute("list", list);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/list.jsp");
		try {
			dispatcher.forward(req, res);
		} catch (Exception e) {}
	}

	public void read(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		int num = Integer.parseInt(req.getParameter("num"));
		Board b = dao.selectOne(num);
		int cnt = b.getCount();
		b.setCount(cnt+1);
		
		dao.modifyCnt(b);
		
		req.setAttribute("b", b);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/read.jsp");
		try {
			dispatcher.forward(req, res);
		} catch (Exception e) {}
	}

	public void insertForm(HttpServletRequest req, HttpServletResponse res) {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/insert.jsp");
		try {
			dispatcher.forward(req, res);
		} catch (Exception e) {}
	}

	public void insertProcess(HttpServletRequest req, HttpServletResponse res) {
		String pass = req.getParameter("pass");
		String name = req.getParameter("name");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		Board b = new Board(pass, name, title, content, 0);
		
		dao.insert(b);
		
		ArrayList<Board> list = dao.selectAll();
		req.setAttribute("list", list);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/list.jsp");
		try {
			dispatcher.forward(req, res);
		} catch (Exception e) {}
	}

	public void search(HttpServletRequest req, HttpServletResponse res) {
		
	}

	public void delete(HttpServletRequest req, HttpServletResponse res) {
		
		int num = Integer.parseInt(req.getParameter("num"));
		
	}

	public void modifyForm(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		int num = Integer.parseInt(req.getParameter("num"));
		
		Board b = dao.selectOne(num);
		
		req.setAttribute("b", b);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/modifyForm.jsp");
		try {
			dispatcher.forward(req, res);
		} catch (Exception e) {}
	}

	public void modifyProcess(HttpServletRequest req, HttpServletResponse res) {
		
		int num = Integer.parseInt(req.getParameter("num"));
		
		String pass = req.getParameter("pass");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		
		
	}
	//LOGIN 贸府
		public void login(HttpServletRequest req, HttpServletResponse res) {
			HttpSession session = req.getSession();
			String id = req.getParameter("id");
			session.setAttribute("id", id);
			
			try {
				res.sendRedirect("list.mvc");
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}

		//LOGOUT 贸府
		public void logout(HttpServletRequest req, HttpServletResponse res) {
			HttpSession session = req.getSession();
			session.setAttribute("id",null);
			
			try {
				res.sendRedirect("list.mvc");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
*/
