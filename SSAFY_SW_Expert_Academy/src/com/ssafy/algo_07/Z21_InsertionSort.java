package com.ssafy.algo_07;

import java.util.Arrays;
import java.util.LinkedList;
/** 
 * ���� ����
 */
public class Z21_InsertionSort {
	public static void main(String[] args) {
		int [] arr = {6,4,8,5,7,2,9}; // 2 4 5 6 7 8 9
//		���ĵ� ���� : 0
//		���ľȵ� ���� : 1 ~ arr.length -1
//		LinkedList ����ϱ� : ����Ʈ �۾��� ���ϴ� ������ ������ ����
		
		LinkedList<Integer> ll = new LinkedList<>();
		// ���� �ȵ� �����Ϳ��� �ϳ��� ������
		for(int i = 0; i < arr.length; i++) {
			int index;
			for(index = 0; index < ll.size(); index++) { // ���ĵ� �����Ϳ� ������ ��ġ ã��
				if(arr[i] < ll.get(index)) {
					break;
				}
			}
			ll.add(index, arr[i]); // ������� ������ ������.
		}
		System.out.println(ll);
		
//		for (int i = 1; i < arr.length; i++) { // ������ ����
//			// ������ ��ġ�� ã�� �ֱ�
//			int num = arr[i];
//			int j;
//			for (j = i-1; j >= 0; j--) { // ���ʿ��� ������
//				if(arr[j] > num) {
////					int temp = arr[j+1];
//					arr[j+1] = arr[j];
////					arr[j] = temp;
//				}else { 
//					break; // ������ ���� �� �ִ�.
//				}
//			}
//			arr[j+1] = num;
//		}
//		System.out.println(Arrays.toString(arr));
	} // end of main
} // end of class
