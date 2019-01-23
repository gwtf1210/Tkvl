package com.exception;

class Truck{
	void go() {}
}

public class ExceptionTest {
	
	Truck t;
	
	public void second() {
		
		int a = 8, b = 0, c = 0;
		try {
			t.go();
			c = a/b;
		}catch(Exception x){
			if(x instanceof ReflectiveOperationException) {
				System.out.println("ReflectiveOperationException");
			}
			if(x instanceof NullPointerException) {
				System.out.println("null");
			}
		}finally { // ���ܹ߻� ���ο� ������� ��� ��쿡 �����ؾ� �Ǵ� ����
			System.out.println("finally");
		}
		System.out.println(c);
		
	}
	
	
	public static void main(String[] args) {
		ExceptionTest ex = new ExceptionTest();
		ex.first();
	}
	
	private void first() {
		second();
	}
}
