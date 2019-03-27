package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CheckOutServlet
 */
@WebServlet("/CheckOutServlet")
public class CheckOutServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();

		// session 열기
		HttpSession session = request.getSession(false);
		String msg = "";

		if (session == null) {

		} else {
			int[] apple = (int[]) session.getAttribute("apple");
			int[] tomato = (int[]) session.getAttribute("tomato");
			int[] orange = (int[]) session.getAttribute("orange");

			if (request.getParameter("see") != null) {
				msg = "당신은 사과 " + apple[0] + "개와 토마토 " + tomato[0] + "개와 오렌지 " + orange[0] + "를 가지고 있습니다.";

			} else {
				msg = "당신은 사과 " + apple[0] + "개와 토마토 " + tomato[0] + "개와 오렌지 " + orange[0] + "를 주문했습니다.";
				session.invalidate();
			}

			out.println("<h3>" + msg + "</h3><hr>");
			out.println("<a href=ShopServlet>back</a>");
		}
	}
}
