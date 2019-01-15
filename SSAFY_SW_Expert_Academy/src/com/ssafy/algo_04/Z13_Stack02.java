package com.ssafy.algo_04;

public class Z13_Stack02 {
	static char[] stack = new char[50];
	static int top = 1;
	
	public static void main(String[] args) {
		String input1 =")(";
		char tmp;
		
		for (int i = 1; i <= input1.length()-1; i++) {
			tmp = input1.charAt(i-1);
			
			if(tmp == '(') {
				stack[top++] = tmp; 
			}
			if(tmp == ')') {
				if(stack[top-1] == '(') {
					top--;	
				}
			}
		}
		
		if(top == 0) {
			System.out.println("맞았습니다.");
			
		}else {
			System.out.println("틀렸습니다.");
		}
		
	}
}

