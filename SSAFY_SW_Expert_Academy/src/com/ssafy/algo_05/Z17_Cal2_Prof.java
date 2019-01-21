package com.ssafy.algo_05;

import java.util.Scanner;
/**
 * ���� : ����ǥ���� => ����ǥ�������� ��ȯ�ؼ� ���
 * icp : in-coming priority
 * isp : in-stack priority
 * ���ڰ� Ŭ���� �켱������ ����
 * ��ū isp icp ��
 * )			( ���� ������ ����
 * *  /   2	  2
 * +  -   1   1
 * (      0   3	   ���ÿ� �ֱ�
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
		char[] stack = new char[13]; // �����ڸ� ����, �˳��ϰ�
		int top = -1;
		
		String[] str = sc.nextLine().split(" ");
		
		for (int i = 0; i < str.length; i++) {
			char c = str[i].charAt(0);

			switch (c) {
			case '(': // �켱���� 3, ������ ���ÿ� �ֱ�
				stack[++top] = c;
				break;

			case '*': // �켱���� 2
				// ���ÿ� ������ ���� ���� �������� ������ ������ ���
				while (top > -1 && (stack[top] == '*' || stack[top] == '/')) {
					System.out.print(stack[top] + " ");
					top--;
				}
				stack[++top] = c;
				break;

			case '/': // �켱���� 2
				// ���ÿ� ������ ���� ���� �������� ������ ������ ���
				while (top > -1 && (stack[top] == '*' || stack[top] == '/')) {
					System.out.print(stack[top] + " ");
					top--;
				}
				stack[++top] = c;
				break;

			case '+':
				// ���ÿ� ������ ���� ���� �������� ������ ������ ���
				while (top > -1 && (stack[top] == '*' || stack[top] == '/' || stack[top] == '+' || stack[top] == '-')) {
					System.out.print(stack[top] + " ");
					top--;
				}
				stack[++top] = c;
				break;

			case '-':
				// ���ÿ� ������ ���� ���� �������� ������ ������ ���
				while (top > -1 && (stack[top] == '*' || stack[top] == '/' || stack[top] == '+' || stack[top] == '-')) {
					System.out.print(stack[top] + " ");
					top--;
				}
				stack[++top] = c;
				break;

			case ')':
				// '(' ���� ������ ���ÿ��� ������ ���
				while (top > -1 && stack[top] != '(') {
					System.out.print(stack[top] + " ");
					top--;
				}

				if (stack[top] == '(') {
					top--;
				}

				break;
			default: // �����ڰ� �ƴ� ��� = ����(�ǿ�����)�� ���
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
