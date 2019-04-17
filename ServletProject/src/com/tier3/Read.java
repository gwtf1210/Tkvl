package com.tier3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Read")
public class Read extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();

		CustomerService service = new CustomerDAO();

		String num = request.getParameter("num");
		Customer customer = service.selectOne(num);
		out.println("<center><h1>Customer</h1>");
		out.println("<table border=1>");
		out.println("<tr><td>" + customer.getNum() + "</td><td>" + customer.getName() + "</td><td>"
				+ customer.getAddress() + "</td><tr>");
		out.println("</table><a href=Start>초기 화면</a></center>");
	}
}
