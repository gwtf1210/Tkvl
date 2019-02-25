package com.ssafy.algo_13;

import java.util.Arrays;

public class Z41_Money2 {
	public static void main(String[] args) {
		System.out.println(f(20));
	}

	public static int f(int n) {
		int[] memo = new int[n + 1];

		// 1원의 경우
		for (int i = 1; i < memo.length; i++) {
			memo[i] = i;
		}

		// 1, 5원의 경우
		for (int i = 5; i < memo.length; i++) {
			memo[i] = Math.min(memo[i - 5] + 1, memo[i]);
		}

		// 1, 5, 10원의 경우
		for (int i = 10; i < memo.length; i++) {
			memo[i] = Math.min(memo[i - 10] + 1, memo[i]);
		}

		// 1, 5, 10, 16원의 경우
		for (int i = 16; i < memo.length; i++) {
			memo[i] = Math.min(memo[i - 16] + 1, memo[i]);
		}

		for (int i = 0; i < memo.length; i++) {
			System.out.print(i + ", ");
		}
		System.out.println(Arrays.toString(memo));

		return memo[n];
	}
}
