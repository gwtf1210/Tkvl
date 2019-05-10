package com.aop.board;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BoardTracker {

	@Before("execution(void *(*))")
	public void before_del_wri(JoinPoint jp) {
		System.out.println("로그인 체크!");
	}

	@After("execution(String read*(*))")
	public void after_read(JoinPoint jp) {
		System.out.println("로그 남김!");
	}
}
