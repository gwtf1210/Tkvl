package com.aop.board;

public interface Board {
	String read(int num);

	void delete(int num);

	void write(String content);
}
