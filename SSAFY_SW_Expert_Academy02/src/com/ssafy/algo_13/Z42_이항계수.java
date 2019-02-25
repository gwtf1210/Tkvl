package com.ssafy.algo_13;

import java.util.Arrays;

public class Z42_���װ�� {
	public static void main(String[] args) {
		System.out.println(f(4 + 1, 1 + 1)); // (x+y)^n�� ��, 2��° ��
	}

	public static int f(int n, int k) {
		int[][] memo = new int[n + 1][n + 1];

		for (int i = 0; i < memo.length; i++) {
			for (int j = 0; j < Math.min(i, k + 1); j++) {
				if (i == j || j == 0) {
					memo[i][j] = 1;
				} else {
					memo[i][j] = memo[i - 1][j - 1] + memo[i - 1][j];
				}
			}
		}

		for (int i = 0; i < memo.length; i++) {
			System.out.println(Arrays.toString(memo[i]));
		}

		return memo[n][k];
	}
}
