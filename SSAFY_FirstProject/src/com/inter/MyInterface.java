package com.inter;

// interface : 내부에 추상메소드만 가지고 있는 객체
public interface MyInterface {
	
	// interface안의 field는 기본으로 static, final이 붙어 있음
	int num = 100; // static : 객체 생성 안해도 된다.
	
	// 인터페이스 안의 메소드는 기본으로 public,abstract가 붙어있다.
	public abstract void go(); // abstract 안 붙여도 똑같다.
	void stop();
}
