package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName = "MyFilter",
	urlPatterns= {"/FilterServlet","/Hello"})
public class MyFilter implements Filter {

	public MyFilter() {
		System.out.println("MyFilter 생성자");
	}

	public void destroy() {
		System.out.println("MyFilter-destroy");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 사전처리 내용
		System.out.println("filter-before...");
		chain.doFilter(request, response);
		// 사후처리 내용
		System.out.println("filter-after");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("MyFilter-init");
	}

}
