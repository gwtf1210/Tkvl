package com.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MessageServlet")
public class MessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 서버에서 클라이언트로 나갈 문서의 타입을 지정(mime type)
		response.setContentType("text/html;charset=utf-8");

		// 응답 내보낼 때 사용할 출력 스트림 얻기
		PrintWriter out = response.getWriter();

		out.print("<html><body>");
		out.print("<h1>Message servlet!! 입니다</h1>");
		out.print("<a href=HelloServlet>hello 서블릿으로 가기</a><br>");
		out.print("<a href=InsertForm?num=123&pass=abc&address=서울&code=123vasdf>InsertForm 서블릿으로 가기</a>");
		out.print("</body></html>");
	}

}
