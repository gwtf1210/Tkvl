package com.ssafy.algo_07;

import java.util.Arrays;
/** 
 * ���� ����
 */
public class Z21_InsertionSort {
	public static void main(String[] args) {
		int [] arr = {6,4,8,5,7,2,9}; // 2 4 5 6 7 8 9
//		���ĵ� ���� : 0
//		���ľȵ� ���� : 1 ~ arr.length -1
		// ���� �ȵ� �����Ϳ��� �ϳ��� ������
		
		for (int i = 1; i < arr.length; i++) { // ������ ����
			// ������ ��ġ�� ã�� �ֱ�
			for (int j = i-1; j >= 0; j--) { // ���ʿ��� ������
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}else { 
					break; // ������ ���� �� �ִ�.
				}
				System.out.println(Arrays.toString(arr));
			}
		}

	} // end of main
} // end of class
