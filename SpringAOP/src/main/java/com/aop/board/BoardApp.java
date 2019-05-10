package com.aop.board;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BoardApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("board.xml");

		Board b = (Board) context.getBean("freeBoard");
		b.read(0);
		b.write("0");
		b.delete(0);
	}
}
