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

	public void list(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<Board> list = dao.selectAll();
		request.setAttribute("list", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("view/list.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void read(HttpServletRequest request, HttpServletResponse response) {
		int num = Integer.parseInt(request.getParameter("num"));
		Board b = dao.selectOne(num);
		b.setCount(b.getCount() + 1);
		dao.modifyCnt(b);
		request.setAttribute("b", b);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/view/read.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insertForm(HttpServletRequest request, HttpServletResponse response) {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/view/insert.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insertProcess(HttpServletRequest request, HttpServletResponse response) {
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		String title = request.getParameter("title");
		String content = request.getParameter("content");

		Board b = new Board(0, pass, name, "", title, content, 0);

		dao.insert(b);

		try {
			response.sendRedirect("list.bod");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(HttpServletRequest request, HttpServletResponse response) {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/view/list.jsp");
		int num = Integer.parseInt(request.getParameter("num"));

		dao.delete(num);
		request.setAttribute("list", dao.selectAll());

		try {
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void search(HttpServletRequest request, HttpServletResponse response) {
		String condition = request.getParameter("condition");
		String word = request.getParameter("word");

		ArrayList<Board> list = dao.search(condition, word);
		request.setAttribute("list", list);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/view/list.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void modifyForm(HttpServletRequest request, HttpServletResponse response) {
		int num = Integer.parseInt(request.getParameter("num"));
		Board b = dao.selectOne(num);
		request.setAttribute("b", b);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/view/modifyForm.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void modifyProcess(HttpServletRequest request, HttpServletResponse response) {
		int num = Integer.parseInt(request.getParameter("num"));
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		String wdate = request.getParameter("wdate");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		int count = Integer.parseInt(request.getParameter("count"));
		Board b = new Board(num, pass, name, wdate, title, content, count);
		dao.modify(b);
		request.setAttribute("list", dao.selectAll());

		RequestDispatcher dispatcher = request.getRequestDispatcher("/view/list.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// LOGIN 贸府
	public void login(HttpServletRequest req, HttpServletResponse res) {
		HttpSession session = req.getSession();
		String id = req.getParameter("id");
		session.setAttribute("id", id);

		try {
			res.sendRedirect("list.bod");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// LOGOUT 贸府
	public void logout(HttpServletRequest req, HttpServletResponse res) {
		HttpSession session = req.getSession();
		session.setAttribute("id", null);

		try {
			res.sendRedirect("list.bod");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
