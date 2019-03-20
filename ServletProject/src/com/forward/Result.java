package com.forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Result")
public class Result extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		System.out.println(name);
		
		//이전 화면에서 forward된 데이터 꺼내기
		String city = (String) request.getAttribute("city");
		String age = (String) request.getAttribute("age");
		
		out.println("<h1>" + city + "</h1>");
		out.println("<h1>" + age + "</h1>");
	}

}
