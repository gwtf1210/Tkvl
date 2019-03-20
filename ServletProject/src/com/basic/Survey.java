package com.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Survey")
public class Survey extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 클라이언트로부터 전송되는 한글 처리
		request.setCharacterEncoding("utf-8");

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		// 1.클라이언트가 보낸 데이터 받기
		String dept = request.getParameter("dept");
		String employee = request.getParameter("employee");
		String comment = request.getParameter("comment");
		String[] ide = request.getParameterValues("ide");

		// 2.화면에 출력
		out.print("<html><body>");
		out.print("<h1>Data form client</h1>");
		out.print("dept:" + dept + "<br>");
		out.print("employee:" + employee + "<br>");
		out.print("comment:" + comment + "<br>");
		out.print("ide: ");
		for(int i=0; i<ide.length; i++) {
			out.print(ide[i] + ",\t");
		}
		out.print("</body></html>");
	}

}
