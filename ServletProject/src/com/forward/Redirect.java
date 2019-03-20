package com.forward;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//요청하는 서블릿 간에 연관성이 없는 경우에는 redirect로 화면을 넘길 것
@WebServlet("/Redirect")
public class Redirect extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("city", "seoul");
		request.setAttribute("age", "25");
		
		//redirect 방식으로 화면 전환 : 처음에 클라이언트로부터 받은 request 객체가 redirect된 서블릿으로 전달되지 않음. 새로운 객체가 만들어짐
		response.sendRedirect("Result");
	}

}
