package com.array;

public class MethodTest {
	// hello() : ȭ�鿡 hello world ���
	public static void hello() {
		System.out.println("Hello World");
		
	} 
	
	// increase() : int �� �ϳ��� �Է� �޾� 1 ������ ���� ������
	public static int increase(int num){
		num++;
		return num;
	}
	
	// max() : int �� �� ���� �Է� �޾� �� �� ū ���� ������
	public static int max(int num1, int num2) {
		return (num1>num2)?num1:num2;
	}
	
	
	public static void main(String[] args) {
		hello();
		System.out.println(increase(6));
		
		System.out.println( max(10,50));
	}

}
