package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ShopServlet")
public class ShopServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();

		out.println("<h1>dada's mall</h1>");
		out.println("<form method=post action=CartServlet>");
		out.println("<input type=submit value=사과담기 name=apple>");
		out.println("<input type=submit value=토마토담기 name=tomato>");
		out.println("<input type=submit value=오렌지담기 name=orange>");
		out.println("</form>");

		out.println("<form method=post action=CheckOutServlet>");
		out.println("<input type=submit value=바구니보기 name=see>");
		out.println("<input type=submit value=계산하기 name=buy>");
		out.println("</form>");

	}

}
