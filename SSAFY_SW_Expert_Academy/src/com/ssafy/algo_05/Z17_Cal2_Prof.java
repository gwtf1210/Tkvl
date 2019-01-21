package com.ssafy.algo_05;

import java.util.Scanner;
/**
 * 계산기 : 중위표현식 => 후위표현식으로 변환해서 출력
 * icp : in-coming priority
 * isp : in-stack priority
 * 숫자가 클수록 우선순위가 높다
 * 토큰 isp icp 비교
 * )			( 나올 때까지 꺼냄
 * *  /   2	  2
 * +  -   1   1
 * (      0   3	   스택에 넣기
 * 
 * input
 *  ( 6 + 5 * ( 2 - 8 ) / 2 )
 *  
 *  
 * output
 * 6 5 2 8 - * + 2 / +
 */

public class Z17_Cal2_Prof {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] stack = new char[13]; // 연산자만 저장, 넉넉하게
		int top = -1;
		
		String[] str = sc.nextLine().split(" ");
		
		for (int i = 0; i < str.length; i++) {
			char c = str[i].charAt(0);

			switch (c) {
			case '(': // 우선순위 3, 무조건 스택에 넣기
				stack[++top] = c;
				break;

			case '*': // 우선순위 2
				// 스택에 나보다 작은 것이 남아있을 때까지 꺼내서 출력
				while (top > -1 && (stack[top] == '*' || stack[top] == '/')) {
					System.out.print(stack[top] + " ");
					top--;
				}
				stack[++top] = c;
				break;

			case '/': // 우선순위 2
				// 스택에 나보다 작은 것이 남아있을 때까지 꺼내서 출력
				while (top > -1 && (stack[top] == '*' || stack[top] == '/')) {
					System.out.print(stack[top] + " ");
					top--;
				}
				stack[++top] = c;
				break;

			case '+':
				// 스택에 나보다 작은 것이 남아있을 때까지 꺼내서 출력
				while (top > -1 && (stack[top] == '*' || stack[top] == '/' || stack[top] == '+' || stack[top] == '-')) {
					System.out.print(stack[top] + " ");
					top--;
				}
				stack[++top] = c;
				break;

			case '-':
				// 스택에 나보다 작은 것이 남아있을 때까지 꺼내서 출력
				while (top > -1 && (stack[top] == '*' || stack[top] == '/' || stack[top] == '+' || stack[top] == '-')) {
					System.out.print(stack[top] + " ");
					top--;
				}
				stack[++top] = c;
				break;

			case ')':
				// '(' 나올 때까지 스택에서 꺼내서 출력
				while (top > -1 && stack[top] != '(') {
					System.out.print(stack[top] + " ");
					top--;
				}

				if (stack[top] == '(') {
					top--;
				}

				break;
			default: // 연산자가 아닌 경우 = 숫자(피연산자)인 경우
				System.out.print(str[i] + " ");
				break;
			}
		}
		
		while(top > -1) {
			System.out.print(stack[top--] + " ");
		}
		
		System.out.println();
	}
}
