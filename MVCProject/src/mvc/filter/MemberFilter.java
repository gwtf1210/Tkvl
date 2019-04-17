package mvc.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
// Front Controller : Ŭ���̾�Ʈ�κ��� ������ ��� ��û�� ����
// ���� ��û ó���� ���� Controller(MemberController)���� �۾��� �ѱ�
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.controller.MemberController;

//@WebFilter("*.mvc")
public class MemberFilter implements Filter {
	MemberController controller;

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		req.setCharacterEncoding("euc-kr"); // �ѱ� ó��
		
		// Ŭ���̾�Ʈ�� ������ ��û���ڸ� ����
		// http://localhost:8080/mvc/list.mvc
		String reqString = req.getServletPath();
		
		if(reqString.equals("/list.mvc")) { // �ʱ�ȭ��
			controller.list(req, res);
		}else if(reqString.equals("/read.mvc")){ // ��ȭ��
			controller.read(req, res);			
		}else if(reqString.equals("/insertForm.mvc")){ // �Է�ȭ��
			controller.insertForm(req, res);			
		}
		else if(reqString.equals("/insertProcess.mvc")){ // �Է�ó��
			controller.insertProcess(req, res);			
		}
		else if(reqString.equals("/delete.mvc")){ // ����ȭ��
			controller.delete(req, res);			
		}
		else if(reqString.equals("/search.mvc")){ // �˻�ȭ��
			controller.search(req, res);			
		}
		else if(reqString.equals("/modifyForm.mvc")){ // ����ȭ��
			controller.modifyForm(req, res);			
		}
		else if(reqString.equals("/modifyProcess.mvc")){ // ����ȭ��
			controller.modifyProcess(req, res);			
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		controller = new MemberController();
	}

}
