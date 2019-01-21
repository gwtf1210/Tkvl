package com.ssafy.algo_05;

/**
 * °è»ê±â 
 * 
 * input
 * 31 + 4 * 2 + 7 * 2
 */
public class Z16_Cal {
	public static void main(String[] args) {
		String inputLine = "3 + 4 + 5 * 6 + 7";
		String[] stack = new String[20];
		int top = -1;
		
		String[] input = inputLine.split(" ");
		
		for (int i = 0; i < input.length; i++) {
			stack[++top] = input[i];
			if(stack[top].equals("*")) {
				int A = Integer.parseInt(stack[--top]);
				int B = Integer.parseInt(input[i+1]);
				stack[top] = (A*B) + "";
				i++;
			}
		}
		for (int i = top; i > -1; i--) {
			if(stack[i].equals("+")) {
				int A = Integer.parseInt(stack[i+1]);
				int B = Integer.parseInt(stack[i-1]);
				top-=2;
				stack[top] = (A+B) +"";
			}
		}
		System.out.println(stack[0]);	
	} // end of main
} // end of class
