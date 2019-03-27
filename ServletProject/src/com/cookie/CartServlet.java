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
 * Servlet implementation class CartServlet
 */
@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		String msg = "";

		// 세션 생성 or 열기
		HttpSession session = request.getSession();
		if (session.isNew()) {
			session.setAttribute("apple", new int[] { 0 });
			session.setAttribute("tomato", new int[] { 0 });
			session.setAttribute("orange", new int[] { 0 });
		}

		int[] apple = (int[]) session.getAttribute("apple");
		int[] tomato = (int[]) session.getAttribute("tomato");
		int[] orange = (int[]) session.getAttribute("orange");

		if (request.getParameter("apple") != null) {
			apple[0]++;
			msg = "사과를 쇼핑백에 추가하였습니다. 바구니에 사과는 " + apple[0] + "개 있습니다.";

		} else if (request.getParameter("tomato") != null) {
			tomato[0]++;
			msg = "토마토를 쇼핑백에 추가하였습니다. 바구니에 토마토는 " + tomato[0] + "개 있습니다.";
		}else if(request.getParameter("orange") != null) {
			orange[0]++;
			msg = "오렌지를 쇼핑백에 추가하였습니다. 바구니에 오렌지는 " + orange[0] + "개 있습니다.";
		}

		out.println("<h3>" + msg + "</h3><hr>");
		out.println("<a href=ShopServlet>back</a>");
	}
}
