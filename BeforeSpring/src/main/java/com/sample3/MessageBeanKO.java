package com.sample3;

public class MessageBeanKO implements MessageBean {
	public MessageBeanKO() {
		System.out.println("MessageBeanKO 생성자");
	}

	@Override
	public void sayHello() {
		System.out.println("안녕하세요? 스프링!!!");
	}
}
