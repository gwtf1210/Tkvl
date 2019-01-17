package com.util;
// SingletonObject pattern이 적용된 클래스
// 객체 생성을 한번만 수행하고 그 이후로는 생성된 객체 공유
// singleton pattern 객체:  
// private static field,
// 생성자: private
public class SingletonObject {
	private static SingletonObject instance;
	
	private SingletonObject() {}
	
	public static SingletonObject getInstance() {
		if(instance == null) {
			instance = new SingletonObject();
		}
		return instance;
	}
	
	public void print() {
		System.out.println("hello, print~");
	}
}
