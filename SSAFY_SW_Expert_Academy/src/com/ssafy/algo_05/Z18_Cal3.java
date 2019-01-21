package com.ssafy.algo_05;

import java.util.Scanner;

/** 
 * 후위 표기식을 계산해서 출력하기 
 *
 * input
 * 6 5 2 8 - * 2 / +
 * 
 * output
 * -9
 */

public class Z18_Cal3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		
		int[] stack = new int[str.length];
		int top = -1;
		for (int i = 0; i < str.length; i++) {
			char c  = str[i].charAt(0);
			int num1, num2;
			switch(c) {
			case '+':
				num2 = stack[top--];
				num1 = stack[top--];
				stack[++top] = num1 + num2;
				break;
				
			case '-':
				num2 = stack[top--];
				num1 = stack[top--];
				stack[++top] = num1 - num2;
				break;
				
			case '*':
				num2 = stack[top--];
				num1 = stack[top--];
				stack[++top] = num1 * num2;
				break;
				
			case '/':
				num2 = stack[top--];
				num1 = stack[top--];
				stack[++top] = num1 / num2;
				break;
				
			default:
				stack[++top] = Integer.parseInt(str[i]);
				break;
			}
		}
			
			System.out.print(stack[top--] + " "); 
	} // end of main
} // end of class




















