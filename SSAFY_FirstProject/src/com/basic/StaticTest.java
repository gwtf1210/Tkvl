package com.basic;

public class StaticTest {
//	1. static field : class area에 실행전 한개만 미리 만들어짐
//	Compile 끝나고 실행하기 전에 생성됨 / 한 개만 생성함

	static int scount; // class 변수
//	heap에 실행이 되면 객체마다 만들어짐 / instance 변수 
	int count;
	
//	2. static method
	public static void go() {
		System.out.println("gogogo~~~");
	}
	
//	3. static block : { }
	static {
		System.out.println("static block-1");
	}
	
	
	public static void main(String[] args) {
//		this, super는 static이 붙어있는 method에서 사용할 수 없다. 미리 만들어 놓지 않았기 때문에
		System.out.println(++StaticTest.scount);
		StaticTest.go();
//		System.out.println(++count); // non-static field여서 error 
		
		/*
		 * // 객체는 만날 때마다 생성됨 -> Heap // scount에 비해 시간도 차이가 나고 위치도 차이가 남 count는 객체 생성마다
		 * 생성됨 StaticTest s1 = new StaticTest(); StaticTest s2 = new StaticTest();
		 * StaticTest s3 = new StaticTest();
		 * 
		 * System.out.println(++s1.count + "--" + ++s2.count + "--" + ++s3.count);
		 * System.out.println(++s1.scount + "--" + ++s2.scount + "--" + ++s3.scount);
		 */
		
	}
	
	static {
		System.out.println("static block-2");
	}
	
}
