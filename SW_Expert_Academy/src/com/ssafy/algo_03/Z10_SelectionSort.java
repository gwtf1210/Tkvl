package com.ssafy.algo_03;

import java.util.Arrays;

/**
 * ��������
 */
public class Z10_SelectionSort {
	public static void main(String[] args) {
		int[] a = {5,2,8,1,9,3,6,7};
		for (int i = 0; i < a.length; i++) { // ������ ���� index ���� for
			int minIndex = i; // �ּҰ��� ����� ��ġ
			for (int j = i; j < a.length; j++) {
				if(a[minIndex] > a[j]) {
					minIndex = j;
				}
			}
//			minindex <-> i ��ȯ
			int temp = a[minIndex];
			a[minIndex] = a[i];
			a[i] = temp;
			System.out.println(Arrays.toString(a));
		}
		System.out.println(Arrays.toString(a));
	}
}
