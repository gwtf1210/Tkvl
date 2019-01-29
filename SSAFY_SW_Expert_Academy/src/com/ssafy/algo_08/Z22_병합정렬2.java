package com.ssafy.algo_08;

import java.util.Arrays;
/** 
 * �������� �迭���� 
 */
public class Z22_��������2 {
	private static void merge(int[] arr, int left, int mid, int right) { // ���ļ� �ϳ��� ���ĵ� ����� �����
		int[] temp = new int[right - left]; // �� ������ �ϳ��� ��ĥ ū �迭
		int l = left; // ���� �迭�� index
		int r = mid; // ������ �迭�� index
		int index = 0; // ������ �迭�� index
		
		while(l < mid && r < right) { // ���� ������ ��� �������� ���
			if(arr[l] < arr[r]) {
				temp[index++] = arr[l++];
			}
			else {
				temp[index++] = arr[r++];
			}
		}
		System.arraycopy(arr, l, temp, index, mid-l); // ���ʸ� ���� ���		
		System.arraycopy(arr, r, temp, index, right-r); // �����ʸ� ���� ���
		System.arraycopy(temp, 0, arr, left, temp.length); // ������ temp�� arr�� �����
//		�ϳ��� �����ϹǷ� ��ȿ������
//		while(l < mid) { // ���ʸ� ���� ���
//			temp[index++] = arr[l++]; // �ϳ��� ����
//		}
//		while(r < right) { // �����ʸ� ���� ���
//			temp[index++] = arr[r++];
//		}
	}
	
	// �ɰ���
	private static void mergeSort(int[] arr, int left, int right) {
		if(right - left <= 1) { // ���� ��Ʈ
			return;
		}else { // ��� ��Ʈ
			int mid = (left + right) / 2; // �߰� index
			mergeSort(arr,left,mid);
			mergeSort(arr,mid, right);
			merge(arr, left, mid, right); // mid�� �߽����� ������ �� ����
			return;
		}
	}

	public static void main(String[] args) {
		int[] arr = {6,4,8,5,7,2,9,3,0,1}; // 10��, 0~9
		mergeSort(arr,0,arr.length); // ���� �迭�� ���� ����
		System.out.println(Arrays.toString(arr));
	}
}
