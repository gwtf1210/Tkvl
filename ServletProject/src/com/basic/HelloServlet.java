package com.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* servlet 클래스가 되기 위한 조건 : HttpServlet 상속
 * @WebServlet : url mapping(클라이언트가 브라우저에서 호출할 때 사용하는 값) 값 지정하는 목적 */

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet { 
	
	//service 메소드 : 클라이언트로부터 들어온 요청에 대한 응답을 만들어 내는 메소드
	//request : 클라이언트에서 서버로 보내는 요청 관련 모든 정보가 들어있는 객체
	//response : 서버에서 클라이언트로 보내는 응답 돤련 모든 정보가 들어있는 객체 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//서버에서 클라이언트로 나갈 문서의 타입을 지정(mime type)
		response.setContentType("text/html;charset=euc-kr");
		
		//응답 내보낼 때 사용할 출력 스트림 얻기
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		out.print("<h1>hello servlet!! 입니다</h1>");
		out.print("<a href=MessageServlet>메세지 서블릿으로 가기</a>");
		out.print("</body></html>");
		
	}

}
