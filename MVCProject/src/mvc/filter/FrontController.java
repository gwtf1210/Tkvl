package mvc.filter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.controller.MemberController;

@WebServlet("*.mvc")
public class FrontController extends HttpServlet {
	MemberController controller;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("euc-kr"); // 한글처리

		// client가 보내온 요청문자를 구분
		// http://localhost:8080//mvc/list.mvc
		String reqString = req.getServletPath(); // list.mvc가 추출됨

		if (reqString.equals("/list.mvc")) {// 초기화면
			controller.list(req, res);

		} else if (reqString.equals("/read.mvc")) { // 상세화면
			controller.read(req, res);

		} else if (reqString.equals("/insertForm.mvc")) {
			controller.insertForm(req, res);
		} else if (reqString.equals("/insertProcess.mvc")) {
			controller.insertProcess(req, res);
		} else if (reqString.equals("/search.mvc")) {
			controller.search(req, res);
		} else if (reqString.equals("/delete.mvc")) {
			controller.delete(req, res);
		} else if (reqString.equals("/modifyForm.mvc")) {
			controller.modifyForm(req, res);
		} else if (reqString.equals("/modifyProcess.mvc")) {
			controller.modifyProcess(req, res);
		}
	}

	@Override
	public void init() throws ServletException {
		controller = new MemberController();
	}

}
