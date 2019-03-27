package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieSave")
public class CookieSave extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// id, pass 값 받아와서 쿠키에 저장, 응답 보낼때 쿠키 같이 전송

		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();

		String id = request.getParameter("id");
		String pass = request.getParameter("pass");

		Cookie idcookie = new Cookie("id", id);
		Cookie passcookie = new Cookie("pass", pass);

		idcookie.setMaxAge(-1);
		passcookie.setMaxAge(-1);

		response.addCookie(idcookie);
		response.addCookie(passcookie);

		out.println("<h1>로그인 정보가 쿠키에 저장되었습니다.</h1>");
		out.println("<a href=CookieTest>쿠키테스트</a>");

	}
}
