package com.basic;


// 1. final class : ����� �ȵ�
final class MyFinal{
	public void test() {
		System.out.println("MyFinal-Test");
	}
}

class YourFinal{
	
	public void test2() {
		// .... 
	}
	
//	2. final method : overriding�� �ȵ�
	public final void test() {
		System.out.println();
	}
}

public class FinalTest extends YourFinal{ // extends MyFinal�� �ϸ� error�� ��
//	3. final variable : ���� ������ �� ����. ���
	final int max = 999;
	
	public static void main(String[] args) {
		FinalTest f = new FinalTest();
//		f.max = 888;
		
		
		
		
	} // end of class
} // end of main
