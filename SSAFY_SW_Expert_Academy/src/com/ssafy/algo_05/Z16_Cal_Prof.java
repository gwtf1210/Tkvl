package com.ssafy.algo_05;

import java.util.Scanner;

/** 
 * + * 계산기
 */
public class Z16_Cal_Prof {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] stack = new int[9]; // 숫자(피연산자)만 저장
		int top = -1;
		
		stack[++top] = sc.nextInt(); // 최조의 숫자 하나를 저장
		for (int i = 0; i < 4; i++) {
			char op = sc.next().charAt(0); // 연산자
			int num = sc.nextInt(); // 숫자(피연산자)
			
			if(op == '+') { // 우선순위가 낮을 수 있으니까 나중에 연산, 스택에 저장
				stack[++top] = num;
			}else { // *, 우선순위가 제일 높으니까 바로 연산, 스택에서 값을 꺼내서 * 이항 연산 후 스택에 저장
				int pre = stack[top]; // 읽기
				stack[top] = num * pre; // 곱해서 넣기
			}
		}
		// 스택에는 덧셈을 할 숫자들만 저장되어 있음
		int sum = 0;
		for (int i = 0; i <= top; i++) {
			sum += stack[i];
		}
		System.out.println(sum);
		
	} // end of main
} // end of class
