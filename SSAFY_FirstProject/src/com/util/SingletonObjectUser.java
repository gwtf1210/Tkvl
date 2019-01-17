package com.util;

public class SingletonObjectUser {
	public static void main(String[] args) {
		SingletonObject o1 = SingletonObject.getInstance();
		SingletonObject o2 = SingletonObject.getInstance();
		SingletonObject o3 = SingletonObject.getInstance();
		
		SingletonObject.getInstance().print();
		
		o1.getInstance().print();
		o2.getInstance().print();
		o3.getInstance().print();
		
		System.out.println(o1 == o2);
		System.out.println(o2 == o3);
		
		
	}
}
