package com.ssafy.algo_10;
/**
 * ��Ʈ��ŷ���� ���� ���ϱ�
 *
 */
public class Z27_Permutation {
	static int[] arr = { 1, 3, 5, 7 }; // ������ ���� �迭

	public static void main(String[] args) {
		int[] a = new int[arr.length]; // ������ index�� ������ �迭

		backtrack(a, 0, a.length);
	}

	private static void backtrack(int[] a, int now, int limit) {
		int[] c = new int[a.length]; // �������� ����� �� �ִ� �ĺ����� ������ �迭

		if (now == limit) { // ���� ��Ʈ
			process_solution(a, now);
		} else { // �����Ʈ
			int ncands = make_candidates(a, now, limit, c); // �ĺ����� ������ ���� ����
			for (int i = 0; i < ncands; i++) {
				a[now] = c[i];
				backtrack(a, now + 1, limit); // ���� �ܰ踦 ��� ȣ����
			}
		}
	} // end of backtrack

	/** �ĺ����� ���ϴ� �Լ�, a�� ������ index�� ������ �迭, c�� �ĺ����� ������ �迭, return ncands�� �ĺ����� ���� */
	private static int make_candidates(int[] a, int now, int limit, int[] c) {
		boolean[] in_perm = new boolean[a.length]; // �̹� �� �ܰ迡�� ���� ���ڸ� üũ�� �÷��� ����
		for (int i = 0; i < now; i++) { // ���� �ܰ� �������� ����� ���ڸ� üũ
			in_perm[a[i]] = true; // ����� ���� true
		}

		int ncands = 0; // �ĺ����� ����
		for (int i = 0; i < in_perm.length; i++) { // ������� ���� ���ڸ� �ĺ��� �迭�� ����
			if (!in_perm[i]) {
				c[ncands] = i;
				ncands++;
			}
		}
		return ncands;
	}

	/** �ϼ��� �迭�� ����, ������ ����ϴ� �޼���, a�� ������ index�� ������ �迭 */
	private static void process_solution(int[] a, int now) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(arr[a[i]] + " ");
		}
		System.out.println();
	} // end of process_solution
} // end of class
