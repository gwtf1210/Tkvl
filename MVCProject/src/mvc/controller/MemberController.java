package mvc.controller;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.dao.MemberDAO;
import mvc.service.MemberService;
import mvc.vo.Member;

public class MemberController {
	MemberService dao;

	public MemberController() {
		dao = new MemberDAO();
	}

	// 모든 고객 정보 알아와서 리턴
	public void list(HttpServletRequest req, HttpServletResponse res) {
		ArrayList<Member> list = dao.selelectAll();
		req.setAttribute("list", list);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/list.jsp");
		try {
			dispatcher.forward(req, res);
		} catch (Exception e) {
		}
	}

	public void read(HttpServletRequest req, HttpServletResponse res) {
		String id = req.getParameter("id");
		Member m = dao.selectOne(id);
		req.setAttribute("m", m);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/read.jsp");
		try {
			dispatcher.forward(req, res);
		} catch (Exception e) {
		}

	}

	public void insertForm(HttpServletRequest req, HttpServletResponse res) {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/insertForm.jsp");
		try {
			dispatcher.forward(req, res);
		} catch (Exception e) {
		}
	}

	public void insertProcess(HttpServletRequest req, HttpServletResponse res) {

		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String address = req.getParameter("address");
		String tel = req.getParameter("tel");

		Member m = new Member(id, name, address, tel);

		dao.insert(m);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/insertSuccess.jsp");
		req.setAttribute("m", m);

		try {
			dispatcher.forward(req, res);
		} catch (Exception e) {
		}
	}

	public void delete(HttpServletRequest req, HttpServletResponse res) {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/list.jsp");
		String id = req.getParameter("id");

		dao.delete(id);
		req.setAttribute("list", dao.selelectAll());

		try {
			dispatcher.forward(req, res);
		} catch (Exception e) {
		}
		
	}

	public void search(HttpServletRequest req, HttpServletResponse res) {
		String condition = req.getParameter("condition");
		String word = req.getParameter("word");

		ArrayList<Member> list = dao.search(condition, word);
		req.setAttribute("list", list);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/list.jsp");
		try {
			dispatcher.forward(req, res);
		} catch (Exception e) {
		}
	}

	
	public void modifyForm(HttpServletRequest req, HttpServletResponse res) {
		String id = req.getParameter("id");
		Member m = dao.selectOne(id);
		req.setAttribute("m", m);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/modifyForm.jsp");
		try {
			dispatcher.forward(req, res);
		} catch (Exception e) {
		}
	}

	public void modifyProcess(HttpServletRequest req, HttpServletResponse res) {

		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String address = req.getParameter("address");
		String tel = req.getParameter("tel");

		Member m = new Member(id, name, address, tel);

		dao.modify(m);
		req.setAttribute("list", dao.selelectAll());
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/list.jsp");

		try {
			dispatcher.forward(req, res);
		} catch (Exception e) {
		}
	}
}
