package com.basic;

public class DataTypeTest {

	public static void main(String[] args) {
		HelloWorld h;
		int aa; 
		
		// ����
		boolean flag = true;
		
		// ������
		byte b = 12; // -128~127
		//b = b + 1; // �ڹٿ��� �������ͷ��� ����ؼ� ������ �� �� ���� 4byte�� �����
		int b2 = b + 1;
		b = (byte)(b+1);
		short s = 123;
		int i = 88888;
		long l = 12345678;
		char c = 'x';
		
		float f = 2.1f; 
		double d = 3.14; // �ڹٿ��� �Ǽ� ���ͷ��� ����� �� �� ���� 8byte�� �����
		
		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);
		System.out.println("c = " + c);
		
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		

	}

}
