package com.ssafy.algo10;

import java.util.Arrays;

public class Z26_Practice02 {

	static int[] arr = {1,2,3,4,5,6,7,8,9,10};
	static String[] answer = new String[(int) Math.pow(2, arr.length)];
	static int index = 0;

	public static void main(String[] args) {
		boolean[] a = new boolean[arr.length]; // ���Ҹ� ������� ���θ� üũ�� �迭
		backtrack(a, 0, arr.length); // 3P4

		for (int i = 0; i < index; i++) {
			if(answer[i] != null) {
				System.out.println(answer[i]);
			}
		}
		System.out.println("\n�κ������� ���� 10�� �κ������� ���� : " + index);
	} // end of main

	/** a[] ������ ��뿩�θ� üũ�� �迭, k : ������ �ܰ�, input : �ܰ��� �� ����(������� ����) */
	public static void backtrack(boolean[] a, int k, int input) {
		boolean[] c = new boolean[a.length];

		if (k == input) { // ���� ��Ʈ
			if (process_solution(a, k) != 10) {
				return;
			}
		} else { // �����Ʈ
			int ncands = make_candidates(a, k, input, c); // �ĺ��� �����
			for (int i = 0; i < ncands; i++) {
				a[k] = c[i]; // ���� �ܰ迡 �ĺ��� �ϳ��� ����
				backtrack(a, k + 1, input); // ���� �ܰ踦 �����ϵ��� k+1 �ܰ踦 ���ȣ��
			}
		}
	} // end of backtrack()

	/**
	 * a[] ������ ��뿩�θ� üũ�� �迭, k : ������ �ܰ�, input : �ܰ��� �� ����(������� ����), c : �ĺ����� ������ �迭,
	 * return ncands
	 */
	public static int make_candidates(boolean[] a, int k, int input, boolean[] c) {
		c[0] = false;
		c[1] = true;
		return 2;
	}

	/** �ϼ��� a[] �迭�� ����, ���Ҹ� ������� Ȯ���ؼ� powerset�� ��� */
	public static int process_solution(boolean[] a, int k) {
		String tmp = "";
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i]) {
				sum += arr[i];
				tmp += arr[i] + " ";
			}
		}
		if (sum != 10) {} 
		else {
			answer[index++] = tmp;
		}
		return sum;
	}
}
