package mvc.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
// Front Controller : 클라이언트로부터 들어오는 모든 요청을 받음
// 받은 요청 처리를 위해 Controller(MemberController)에게 작업을 넘김
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.controller.MemberController;

@WebFilter("*.mvc")
public class MemberFilter implements Filter {
	MemberController controller;

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		req.setCharacterEncoding("euc-kr"); // 한글 처리
		
		// 클라이언트가 보내온 요청문자를 구분
		// http://localhost:7070/mvc/list.mvc
		String reqString = req.getServletPath();
		
		if(reqString.equals("/list.mvc")) { // 초기화면
			controller.list(req, res);
		}else if(reqString.equals("/read.mvc")){ // 상세화면
			controller.read(req, res);			
		}else if(reqString.equals("/insertForm.mvc")){ // 입력화면
			controller.insertForm(req, res);			
		}
		else if(reqString.equals("/insertProcess.mvc")){ // 입력처리
			controller.insertProcess(req, res);			
		}
		else if(reqString.equals("/delete.mvc")){ // 삭제화면
			controller.delete(req, res);			
		}
		else if(reqString.equals("/search.mvc")){ // 검색화면
			controller.search(req, res);			
		}
		else if(reqString.equals("/modifyForm.mvc")){ // 수정화면
			controller.modifyForm(req, res);			
		}
		else if(reqString.equals("/modifyProcess.mvc")){ // 수정화면
			controller.modifyProcess(req, res);			
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		controller = new MemberController();
	}

}
