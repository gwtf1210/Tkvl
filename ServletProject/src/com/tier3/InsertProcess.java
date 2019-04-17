package com.tier3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertProcess")
public class InsertProcess extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		request.setCharacterEncoding("euc-kr");

		String num = request.getParameter("num");
		String name = request.getParameter("name");
		String address = request.getParameter("address");

		CustomerService service = new CustomerDAO();

		service.insert(new Customer(num, name, address));

		response.sendRedirect("Start");
	}
}
