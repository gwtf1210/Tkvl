package com.di;

public class MessageBeanEN implements MessageBean {

	String num;
	String name;

	// 생성자 주입
	public MessageBeanEN(String num, String name) {
		this.num = num;
		this.name = name;
	}

	@Override
	public void sayHello() {
		System.out.println("hello, " + num);
		System.out.println("hello, " + name);
	}
}
