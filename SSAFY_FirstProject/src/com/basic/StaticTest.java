package com.basic;

public class StaticTest {
//	1. static field : class area�� ������ �Ѱ��� �̸� �������
//	Compile ������ �����ϱ� ���� ������ / �� ���� ������

	static int scount; // class ����
//	heap�� ������ �Ǹ� ��ü���� ������� / instance ���� 
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
//		this, super�� static�� �پ��ִ� method���� ����� �� ����. �̸� ����� ���� �ʾұ� ������
		System.out.println(++StaticTest.scount);
		StaticTest.go();
//		System.out.println(++count); // non-static field���� error 
		
		/*
		 * // ��ü�� ���� ������ ������ -> Heap // scount�� ���� �ð��� ���̰� ���� ��ġ�� ���̰� �� count�� ��ü ��������
		 * ������ StaticTest s1 = new StaticTest(); StaticTest s2 = new StaticTest();
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
