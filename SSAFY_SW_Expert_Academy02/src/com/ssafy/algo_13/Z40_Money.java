package com.ssafy.algo_13;

import java.util.Arrays;

/**
 * DP - ���� �Ž�����
 */
public class Z40_Money {
	public static void main(String[] args) {
		System.out.println(f(8)); // 8���� ���� �Ž����� �ּ� ����
	} // end of main

	public static int f(int n) { // ���ϰ����ϴ� �Ž����� �ݾ� : n��
		int[] memo = new int[n + 1]; // index �Ž������� �Ž��� �� �ִ� �ּ� ������ ����

		// 1�� ���� ���
		for (int i = 1; i < memo.length; i++) { // 1�� �̻��� �Ž������� ���� ����
			memo[i] = i;
		}

		// 1, 4�� ���� ���
		for (int i = 4; i < memo.length; i++) { // 4�� �̻� �Ž������� ���� ����
			// ������ 1��¥���� �ݿ��������� �ּҰ�
			// memo[i-4] +1 �� �ּҰ��� ������Ʈ
			if (memo[i] > memo[i - 4] + 1) {
				memo[i] = memo[i - 4] + 1;
			}
		}

		// 1,4,6�� ���� ���
		for (int i = 6; i < memo.length; i++) { // 6�� �̻��� �Ž������� ���� ����
			if (memo[i] > memo[i - 6] + 1) {
				memo[i] = memo[i - 6] + 1;
			}
		}

		System.out.println(Arrays.toString(memo));

		return memo[n];

	}

} // end of class
