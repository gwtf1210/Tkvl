package com.ssafy.algo_14;

import java.util.Arrays;
/**
 * LIS(Longest Increasing Subsequence) 최장 증가수열
 */
public class Z43_LIS1_Prof {
	public static void main(String[] args) {
		int[] a = { 8, 2, 4, 3, 6, 11, 7, 10, 14, 5 };
		int[] LIS = new int[a.length]; // 0~i 번째까지 숫자를 사용한 최장증가수열의 길이

		int[] path = new int[a.length]; // 최장증가수열을 추적할 경로

		for (int i = 0; i < a.length; i++) {
			LIS[i] = 1; // 초기값 1(나 자신 하나의 숫자로 만들수 있는 수열)
			path[i] = -1;
			for (int j = 0; j < i; j++) { // 나의 앞쪽 범위에서
				// 나보다 작은 숫자이고, 최장증가수열에 내 숫자를 덧붙인 경우를 고려해서 LIS 갱신
				if (a[j] < a[i] && LIS[i] < LIS[j] + 1) {
					LIS[i] = LIS[j] + 1;
					path[i] = j; // 경로를 저장
				}
			}
		}
		System.out.println(Arrays.toString(LIS)); // 최장 증가수열 배열

		int maxLISIndex = 0; // LIS에서 최대값의 index를 찾기

		for (int i = 0; i < LIS.length; i++) {
			if (LIS[maxLISIndex] < LIS[i]) {
				maxLISIndex = i;
			}
		}
		System.out.println("최장증가수열의 길이 : " + LIS[maxLISIndex] + "개");

		System.out.println(Arrays.toString(path));

		System.out.print("최장증가 수열 : ");
		String result = "";
		for (int i = maxLISIndex; i != -1; i = path[i]) {
			result = a[i] + " " + result;
		}
		System.out.println(result);
	} // end of main
} // end of class