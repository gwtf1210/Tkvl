package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// Aspect 객체(pointcut과 일치하는 때가 되면 advice 실행됨. 공통 업무를 가지고 있는 객체)
// pintcut(when) + advice(what)가 같이 들어 있음
@Aspect
public class ColorTracker {

	// advice : 핵심 업무 전에 weaving되어 실행될 내용을 가지고 있는 메소드
	@Before("execution(void set*(*))")
	public void colorTrackBefore(JoinPoint jp) {
		System.out.println("before advice 시작!");
		System.out.println("taget : " + jp.getTarget().getClass().getName());
		System.out.println("method : " + jp.getSignature().getName());
		System.out.println("args : " + jp.getArgs()[0]);
		System.out.println("advice 끝!");
	}

	@After("execution(void set*(*))")
	public void colorTrackAfter(JoinPoint jp) {
		System.out.println("after advice 시작!");
		System.out.println("taget : " + jp.getTarget().getClass().getName());
		System.out.println("method : " + jp.getSignature().getName());
		System.out.println("args : " + jp.getArgs()[0]);
		System.out.println("after advice 끝!");
	}
}
