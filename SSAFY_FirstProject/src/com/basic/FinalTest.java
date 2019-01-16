package com.basic;


// 1. final class : 상속이 안됨
final class MyFinal{
	public void test() {
		System.out.println("MyFinal-Test");
	}
}

class YourFinal{
	
	public void test2() {
		// .... 
	}
	
//	2. final method : overriding이 안됨
	public final void test() {
		System.out.println();
	}
}

public class FinalTest extends YourFinal{ // extends MyFinal을 하면 error가 남
//	3. final variable : 값을 수정할 수 없음. 상수
	final int max = 999;
	
	public static void main(String[] args) {
		FinalTest f = new FinalTest();
//		f.max = 888;
		
		
		
		
	} // end of class
} // end of main
