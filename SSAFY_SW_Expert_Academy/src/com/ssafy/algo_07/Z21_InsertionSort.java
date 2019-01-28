package com.ssafy.algo_07;

import java.util.Arrays;
/** 
 * 삽입 정렬
 */
public class Z21_InsertionSort {
	public static void main(String[] args) {
		int [] arr = {6,4,8,5,7,2,9}; // 2 4 5 6 7 8 9
//		정렬된 묶음 : 0
//		정렬안된 묶음 : 1 ~ arr.length -1
		// 정렬 안된 데이터에서 하나씩 꺼내기
		for (int i = 1; i < arr.length; i++) { // 비정렬 원소
			// 삽입할 위치를 찾아 넣기
			int num = arr[i];
			int j;
			for (j = i-1; j >= 0; j--) { // 뒤쪽에서 앞으로
				if(arr[j] > num) {
//					int temp = arr[j+1];
					arr[j+1] = arr[j];
//					arr[j] = temp;
				}else { 
					break; // 성능을 높일 수 있다.
				}
			}
			arr[j+1] = num;
		}
		System.out.println(Arrays.toString(arr));
	} // end of main
} // end of class
