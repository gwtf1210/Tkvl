package com.ssafy.algo10;
/**
 * 백트래킹으로 순열 구하기
 *
 */
public class Z27_Permutation {
	static int[] arr = { 1, 3, 5, 7 }; // 순열을 구할 배열

	public static void main(String[] args) {
		int[] a = new int[arr.length]; // 순열의 index를 저장할 배열

		backtrack(a, 0, a.length);
	}

	private static void backtrack(int[] a, int now, int limit) {
		int[] c = new int[a.length]; // 순열에서 사용할 수 있는 후보군을 저장할 배열

		if (now == limit) { // 종료 파트
			process_solution(a, now);
		} else { // 재귀파트
			int ncands = make_candidates(a, now, limit, c); // 후보군의 개수를 리턴 받음
			for (int i = 0; i < ncands; i++) {
				a[now] = c[i];
				backtrack(a, now + 1, limit); // 다음 단계를 재귀 호출함
			}
		}
	} // end of backtrack

	/** 후보군을 구하는 함수, a는 순열의 index를 저장한 배열, c는 후보군을 저장할 배열, return ncands는 후보군의 개수 */
	private static int make_candidates(int[] a, int now, int limit, int[] c) {
		boolean[] in_perm = new boolean[a.length]; // 이미 전 단계에서 사용된 숫자를 체크할 플래그 변수
		for (int i = 0; i < now; i++) { // 현재 단계 이전까지 사용한 숫자만 체크
			in_perm[a[i]] = true; // 사용한 숫자 true
		}

		int ncands = 0; // 후보군의 개수
		for (int i = 0; i < in_perm.length; i++) { // 사용하지 않은 숫자만 후보군 배열에 저장
			if (!in_perm[i]) {
				c[ncands] = i;
				ncands++;
			}
		}
		return ncands;
	}

	/** 완성된 배열을 보고, 순열을 출력하는 메서드, a는 순열의 index를 저장한 배열 */
	private static void process_solution(int[] a, int now) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(arr[a[i]] + " ");
		}
		System.out.println();
	} // end of process_solution
} // end of class
