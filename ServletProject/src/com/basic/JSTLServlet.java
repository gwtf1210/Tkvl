package com.basic;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JSTLServlet
 */
@WebServlet("/JSTLServlet")
public class JSTLServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<String> color = new ArrayList<String>();
		color.add("blue");
		color.add("red");
		color.add("yellow");
		color.add("pink");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("jstl/color.jsp");
		request.setAttribute("col", color);
		dispatcher.forward(request, response);
		
	}


}
