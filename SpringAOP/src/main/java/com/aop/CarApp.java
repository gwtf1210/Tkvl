package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");

		Car a = (Car) context.getBean("avante");
		a.setColor("yellow"); // 핵심 메소드 호출

	}
}
