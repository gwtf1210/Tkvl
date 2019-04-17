package com.tier3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Start")
public class Start extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();

		CustomerService service = new CustomerDAO();
		List<Customer> list = service.selectAll();

		out.println("<center><h1>Customer</h1>");
		out.println("<table border=1>");
		for (Customer c : list) {
			out.println("<tr><td>" + c.getNum() + "</td><td><a href=Read?num=" + c.getNum() + ">" + c.getName()
					+ "</a></td></tr>");
		}
		out.println("</table>");
		out.println("<a href=html/insertform.html>add customer</a></center>");

	}
}
