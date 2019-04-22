package com.sample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
// container 기능 : application에서 필요한 객체를 생성, 관리, 공급해주는 객체
// ApplicationContext(스프링이 제공해 주는 컨테이너 클래스.ClassPathXmlApplicationContext는 자식 클래스 중의 하나)

public class HelloApp {
	public static void main(String[] args) {
//		ApplicationContext context  = new GenericSystemXmlApplicationContext("context.xml");
//		ApplicationContext context  = new FileSystemXmlApplicationContext("c:\\context.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		MessageBean bean1 = context.getBean("bean1", MessageBean.class); // interface Type으로 받아야함
		bean1.sayHello();
		
		MessageBean bean2 = context.getBean("bean1", MessageBean.class); // interface Type으로 받아야함
		bean2.sayHello();
	}
}
