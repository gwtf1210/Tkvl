package com.ssafy.algo_14;

import java.util.Arrays;
/**
 * LIS(Longest Increasing Subsequence) ���� ��������
 */
public class Z43_LIS1_Prof {
	public static void main(String[] args) {
		int[] a = { 8, 2, 4, 3, 6, 11, 7, 10, 14, 5 };
		int[] LIS = new int[a.length]; // 0~i ��°���� ���ڸ� ����� �������������� ����

		int[] path = new int[a.length]; // �������������� ������ ���

		for (int i = 0; i < a.length; i++) {
			LIS[i] = 1; // �ʱⰪ 1(�� �ڽ� �ϳ��� ���ڷ� ����� �ִ� ����)
			path[i] = -1;
			for (int j = 0; j < i; j++) { // ���� ���� ��������
				// ������ ���� �����̰�, �������������� �� ���ڸ� ������ ��츦 ����ؼ� LIS ����
				if (a[j] < a[i] && LIS[i] < LIS[j] + 1) {
					LIS[i] = LIS[j] + 1;
					path[i] = j; // ��θ� ����
				}
			}
		}
		System.out.println(Arrays.toString(LIS)); // ���� �������� �迭

		int maxLISIndex = 0; // LIS���� �ִ밪�� index�� ã��

		for (int i = 0; i < LIS.length; i++) {
			if (LIS[maxLISIndex] < LIS[i]) {
				maxLISIndex = i;
			}
		}
		System.out.println("�������������� ���� : " + LIS[maxLISIndex] + "��");

		System.out.println(Arrays.toString(path));

		System.out.print("�������� ���� : ");
		String result = "";
		for (int i = maxLISIndex; i != -1; i = path[i]) {
			result = a[i] + " " + result;
		}
		System.out.println(result);
	} // end of main
} // end of class