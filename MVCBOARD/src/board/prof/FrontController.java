/*
package board.filter;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.controller.BoardController;

@WebServlet("*.board")
public class FrontController extends HttpServlet {

	BoardController controller;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("euc-kr"); // �ѱ�ó��

			// client�� ������ ��û���ڸ� ����
			// http://localhost:8080//board/list.board
			String reqString = req.getServletPath(); // list.board�� �����

			if (reqString.equals("/list.board")) {// �ʱ�ȭ��
				controller.list(req, res);

			} else if (reqString.equals("/read.board")) { // ��ȭ��
				controller.read(req, res);

			} else if (reqString.equals("/insertForm.board")) {
				controller.insertForm(req, res);
				
			} else if (reqString.equals("/insertProcess.board")) {
				controller.insertProcess(req, res);
				
			} else if (reqString.equals("/search.board")) {
				controller.search(req, res);
				
			} else if (reqString.equals("/delete.board")) {
				controller.delete(req, res);
				
			} else if (reqString.equals("/modifyForm.board")) {
				controller.modifyForm(req, res);
				
			} else if (reqString.equals("/modifyProcess.board")) {
				controller.modifyProcess(req, res);
				
			} else if (reqString.equals("/login.mvc")) {
				controller.login(req, res);

			} else if (reqString.equals("/logout.mvc")) {
				controller.logout(req, res);
			}
			
		} catch (Exception w) {
			req.setAttribute("error", w);
			RequestDispatcher dispatcher = req.getRequestDispatcher("/view/error.jsp");
			try {
				dispatcher.forward(req, res);
			} catch (Exception e) {}
		}
	}

	@Override
	public void init() throws ServletException {
		controller = new BoardController();
	}

}
*/