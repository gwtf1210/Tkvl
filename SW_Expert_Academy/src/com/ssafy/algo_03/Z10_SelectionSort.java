package com.ssafy.algo_03;

import java.util.Arrays;

/**
 * 선택정렬
 */
public class Z10_SelectionSort {
	public static void main(String[] args) {
		int[] a = {5,2,8,1,9,3,6,7};
		for (int i = 0; i < a.length; i++) { // 영역의 시작 index 만들 for
			int minIndex = i; // 최소값이 저장된 위치
			for (int j = i; j < a.length; j++) {
				if(a[minIndex] > a[j]) {
					minIndex = j;
				}
			}
//			minindex <-> i 교환
			int temp = a[minIndex];
			a[minIndex] = a[i];
			a[i] = temp;
			System.out.println(Arrays.toString(a));
		}
		System.out.println(Arrays.toString(a));
	}
}
