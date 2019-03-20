package com.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertForm")
public class InsertForm extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//클라이언트로부터 전송되는 한글 처리
		request.setCharacterEncoding("utf-8"); 
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//1.클라이언트가 보낸 데이터 받기
		String num = request.getParameter("num");
		String pass = request.getParameter("pass");
		String address = request.getParameter("address");
		String code = request.getParameter("code");
		
		//2.화면에 출력
		out.print("<html><body>");
		out.print("<h1>Data form client</h1>");
		out.print("num:"+ num + "<br>");
		out.print("pass:"+ pass + "<br>");
		out.print("address:"+ address + "<br>");
		out.print("code:"+ code + "<br>");
		out.print("</body></html>");
		
	}

}
