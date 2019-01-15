package com.ssafy.algo_04;

import java.util.Stack;

/**
 * stack : LIFO 후입선출 구조
 * 		top : 꼭대기에 놓인 마지막 데이터의 위치 
 */
public class Z13_Stack {
	static int[] stack = new int[5];
	static int top = -1; // 마지막 데이터의 위치
	public static void main(String[] args) {
//		Stack s = new Stack<>(); // Class도 있다.
		push(1); // stack에 삽입
		push(2); // stack에 삽입
		push(3); // stack에 삽입
		stack[++top] = 4; // 데이터를 넉넉하게 만들고 이렇게 써라
		
		System.out.println(pop()); // stack에서 꺼내고 삭제
		System.out.println(pop()); // stack에서 꺼내고 삭제
		System.out.println(pop()); // stack에서 꺼내고 삭제
		System.out.println(stack[--top]); // stack에서 꺼내고 삭제
		
	} // end of main
	
	/** 스택에 데이터가 없는가? */
	public static boolean isEmpty() {
		return top == -1;
	}
	
	/** 스택의 마지막 원소를 삭제 후 리턴 */
	public static int pop() {
		if(isEmpty()) { // 스택에 데이터가 비어있는가?
			System.out.println("stack underflow");
			return -1;
		}else {
			return stack[top--];	
		}
	}
	
	/** 스택에 데이터가 꽉 찼는가? */
	public static boolean isFull() {
		return stack.length -1 == top;
	}
	
	/** 스택에 원소 추가 */
	public static void push(int data) {
		// 스택이 꽉 차지 않았는지 확인
		if(isFull()) {
			System.out.println("stack overflow");
		}else {
			top++;
			stack[top] = data;
		}
	}
	
	
} // end of class
