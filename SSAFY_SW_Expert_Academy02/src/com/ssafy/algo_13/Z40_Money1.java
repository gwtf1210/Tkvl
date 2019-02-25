package com.ssafy.algo_13;

import java.util.Arrays;

/**
 * DP - 동전 거스름돈
 */
public class Z40_Money1 {
	public static void main(String[] args) {
		System.out.println(f(8)); // 8원의 동전 거스름돈 최소 개수
	} // end of main

	public static int f(int n) { // 구하고자하는 거스름돈 금액 : n원
		int[] memo = new int[n + 1]; // index 거스름돈을 거스를 수 있는 최소 동전의 개수

		// 1원 동전 고려
		for (int i = 1; i < memo.length; i++) { // 1원 이상의 거스름돈에 대해 저장
			memo[i] = i;
		}

		// 1, 4원 동전 고려
		for (int i = 4; i < memo.length; i++) { // 4원 이상 거스름돈에 대해 저장
			// 기존에 1원짜리만 반영했을때의 최소값
			// memo[i-4] +1 와 최소값을 업데이트
			if (memo[i] > memo[i - 4] + 1) {
				memo[i] = memo[i - 4] + 1;
			}
		}

		// 1,4,6원 동전 고려
		for (int i = 6; i < memo.length; i++) { // 6원 이상의 거스름돈에 대해 저장
			if (memo[i] > memo[i - 6] + 1) {
				memo[i] = memo[i - 6] + 1;
			}
		}

		System.out.println(Arrays.toString(memo));

		return memo[n];

	}

} // end of class
