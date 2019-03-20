package com.forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Include")
public class Include extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		//forward 방식으로 화면 전환 : 처음에 클라이언트로부터 받은 request 객체가 계속해서 forward된 서블릿으로 전달됨.
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/result.jsp");//화면 넘길 준비
		request.setAttribute("city", "osaka");// data 저장
		request.setAttribute("age", "22");// data 저장
		
		dispatcher.include(request, response);//화면 넘김
		out.print("after");
		dispatcher.include(request, response);//화면 넘김
		out.print("end");
		
	}

}
