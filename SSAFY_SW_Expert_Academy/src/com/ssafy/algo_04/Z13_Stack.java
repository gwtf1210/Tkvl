package com.ssafy.algo_04;

import java.util.Stack;

/**
 * stack : LIFO ���Լ��� ����
 * 		top : ����⿡ ���� ������ �������� ��ġ 
 */
public class Z13_Stack {
	static int[] stack = new int[5];
	static int top = -1; // ������ �������� ��ġ
	public static void main(String[] args) {
//		Stack s = new Stack<>(); // Class�� �ִ�.
		push(1); // stack�� ����
		push(2); // stack�� ����
		push(3); // stack�� ����
		stack[++top] = 4; // �����͸� �˳��ϰ� ����� �̷��� ���
		
		System.out.println(pop()); // stack���� ������ ����
		System.out.println(pop()); // stack���� ������ ����
		System.out.println(pop()); // stack���� ������ ����
		System.out.println(stack[--top]); // stack���� ������ ����
		
	} // end of main
	
	/** ���ÿ� �����Ͱ� ���°�? */
	public static boolean isEmpty() {
		return top == -1;
	}
	
	/** ������ ������ ���Ҹ� ���� �� ���� */
	public static int pop() {
		if(isEmpty()) { // ���ÿ� �����Ͱ� ����ִ°�?
			System.out.println("stack underflow");
			return -1;
		}else {
			return stack[top--];	
		}
	}
	
	/** ���ÿ� �����Ͱ� �� á�°�? */
	public static boolean isFull() {
		return stack.length -1 == top;
	}
	
	/** ���ÿ� ���� �߰� */
	public static void push(int data) {
		// ������ �� ���� �ʾҴ��� Ȯ��
		if(isFull()) {
			System.out.println("stack overflow");
		}else {
			top++;
			stack[top] = data;
		}
	}
	
	
} // end of class
