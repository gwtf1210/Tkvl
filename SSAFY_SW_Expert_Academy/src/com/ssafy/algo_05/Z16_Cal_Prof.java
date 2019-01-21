package com.ssafy.algo_05;

import java.util.Scanner;

/** 
 * + * ����
 */
public class Z16_Cal_Prof {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] stack = new int[9]; // ����(�ǿ�����)�� ����
		int top = -1;
		
		stack[++top] = sc.nextInt(); // ������ ���� �ϳ��� ����
		for (int i = 0; i < 4; i++) {
			char op = sc.next().charAt(0); // ������
			int num = sc.nextInt(); // ����(�ǿ�����)
			
			if(op == '+') { // �켱������ ���� �� �����ϱ� ���߿� ����, ���ÿ� ����
				stack[++top] = num;
			}else { // *, �켱������ ���� �����ϱ� �ٷ� ����, ���ÿ��� ���� ������ * ���� ���� �� ���ÿ� ����
				int pre = stack[top]; // �б�
				stack[top] = num * pre; // ���ؼ� �ֱ�
			}
		}
		// ���ÿ��� ������ �� ���ڵ鸸 ����Ǿ� ����
		int sum = 0;
		for (int i = 0; i <= top; i++) {
			sum += stack[i];
		}
		System.out.println(sum);
		
	} // end of main
} // end of class
