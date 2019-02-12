package com.ssafy.algo10;

/**
 * powerset ���ϱ�
 */
public class Z26_PowerSet {
	static int[] arr = { 3, 5, 8 }; // arr �迭�� ��� �κ�����(powerset)�� ���غ���

	public static void main(String[] args) {
		boolean[] a = new boolean[arr.length]; // ���Ҹ� ������� ���θ� üũ�� �迭
		backtrack(a, 0, a.length); //
	} // end of main

	/** a[] ������ ��뿩�θ� üũ�� �迭, k : ������ �ܰ�, input : �ܰ��� �� ����(������� ����) */
	public static void backtrack(boolean[] a, int k, int input) {
		boolean[] c = new boolean[a.length];

		if (k == input) { // ���� ��Ʈ
			// powerset
			process_solution(a, k); // powerset�� ����ϱ�
		} else { // �����Ʈ
			int ncands = make_candidates(a, k, input, c); // �ĺ��� �����
			for (int i = 0; i < ncands; i++) {
				a[k] = c[i]; // ���� �ܰ迡 �ĺ��� �ϳ��� ����
				backtrack(a, k + 1, input); // ���� �ܰ踦 �����ϵ��� k+1 �ܰ踦 ���ȣ��
			}
		}
	} // end of backtrack()

	/** a[] ������ ��뿩�θ� üũ�� �迭, k : ������ �ܰ�, input : �ܰ��� �� ����(������� ����), c : �ĺ����� ������ �迭, return ncands */
	public static int make_candidates(boolean[] a, int k, int input, boolean[] c) {
		c[0] = false;
		c[1] = true;
		return 2;
	}

	/** �ϼ��� a[] �迭�� ����, ���Ҹ� ������� Ȯ���ؼ� powerset�� ��� */
	public static void process_solution(boolean[] a, int k) {
		for (int i = 0; i < a.length; i++) {
			if (a[i]) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
} // end of class
