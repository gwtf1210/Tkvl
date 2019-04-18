package board.frontcontroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.controller.BoardController;

@WebServlet("*.bod")
public class FrontController extends HttpServlet {
	BoardController controller;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");

		String reqString = request.getServletPath();
		System.out.println(reqString);
		if (reqString.equals("/list.bod")) {
			controller.list(request, response);
		} else if (reqString.equals("/read.bod")) {
			controller.read(request, response);
		} else if (reqString.equals("/insertForm.bod")) {
			controller.insertForm(request, response);
		} else if (reqString.equals("/insertProcess.bod")) {
			controller.insertProcess(request, response);
		} else if (reqString.equals("/delete.bod")) {
			controller.delete(request, response);
		} else if (reqString.equals("/search.bod")) {
			controller.search(request, response);
		} else if (reqString.equals("/modifyForm.bod")) {
			controller.modifyForm(request, response);
		} else if (reqString.equals("/modifyProcess.bod")) {
			controller.modifyProcess(request, response);
		}
	}

	@Override
	public void init() throws ServletException {
		controller = new BoardController();
	}
}
