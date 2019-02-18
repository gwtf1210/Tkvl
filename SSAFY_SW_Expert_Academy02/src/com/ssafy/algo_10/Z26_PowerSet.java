package com.ssafy.algo_10;

/**
 * powerset 구하기
 */
public class Z26_PowerSet {
	static int[] arr = { 3, 5, 8 }; // arr 배열의 모든 부분집합(powerset)을 구해보자

	public static void main(String[] args) {
		boolean[] a = new boolean[arr.length]; // 원소를 사용할지 여부를 체크할 배열
		backtrack(a, 0, a.length); //
	} // end of main

	/** a[] 원소의 사용여부를 체크할 배열, k : 현재의 단계, input : 단계의 끝 범위(변경되지 않음) */
	public static void backtrack(boolean[] a, int k, int input) {
		boolean[] c = new boolean[a.length];

		if (k == input) { // 종료 파트
			// powerset
			process_solution(a, k); // powerset을 출력하기
		} else { // 재귀파트
			int ncands = make_candidates(a, k, input, c); // 후보군 만들기
			for (int i = 0; i < ncands; i++) {
				a[k] = c[i]; // 현재 단계에 후보군 하나를 넣음
				backtrack(a, k + 1, input); // 다음 단계를 진행하도록 k+1 단계를 재귀호출
			}
		}
	} // end of backtrack()

	/** a[] 원소의 사용여부를 체크할 배열, k : 현재의 단계, input : 단계의 끝 범위(변경되지 않음), c : 후보군을 저장할 배열, return ncands */
	public static int make_candidates(boolean[] a, int k, int input, boolean[] c) {
		c[0] = false;
		c[1] = true;
		return 2;
	}

	/** 완성된 a[] 배열을 보고, 원소를 출력할지 확인해서 powerset을 출력 */
	public static void process_solution(boolean[] a, int k) {
		for (int i = 0; i < a.length; i++) {
			if (a[i]) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
} // end of class
