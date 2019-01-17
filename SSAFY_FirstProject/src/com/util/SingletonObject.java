package com.util;
// SingletonObject pattern�� ����� Ŭ����
// ��ü ������ �ѹ��� �����ϰ� �� ���ķδ� ������ ��ü ����
// singleton pattern ��ü:  
// private static field,
// ������: private
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
