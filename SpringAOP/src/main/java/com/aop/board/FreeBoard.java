package com.aop.board;

import org.springframework.stereotype.Component;

@Component
public class FreeBoard implements Board {
	int num;
	String content;

	@Override
	public String read(int num) {
		System.out.println("read 호출!");
		return content;
	}

	@Override
	public void delete(int num) {
		System.out.println("delete 호출!");
		return;
	}

	@Override
	public void write(String content) {
		System.out.println("write 호출!");
		return;
	}
}
