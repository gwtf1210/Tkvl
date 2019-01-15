package com.basic;

public class DataTypeTest {

	public static void main(String[] args) {
		HelloWorld h;
		int aa; 
		
		// 논리형
		boolean flag = true;
		
		// 정수형
		byte b = 12; // -128~127
		//b = b + 1; // 자바에서 정수리터럴을 사용해서 연살할 때 그 값은 4byte에 저장됨
		int b2 = b + 1;
		b = (byte)(b+1);
		short s = 123;
		int i = 88888;
		long l = 12345678;
		char c = 'x';
		
		float f = 2.1f; 
		double d = 3.14; // 자바에서 실수 리터럴을 사용할 때 그 값은 8byte에 저장됨
		
		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);
		System.out.println("c = " + c);
		
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		

	}

}
