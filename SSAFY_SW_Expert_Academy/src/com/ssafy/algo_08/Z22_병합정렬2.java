package com.ssafy.algo_08;

import java.util.Arrays;
/** 
 * 병합정렬 배열쓰기 
 */
public class Z22_병합정렬2 {
	private static void merge(int[] arr, int left, int mid, int right) { // 합쳐서 하나의 정렬된 덩어리로 만들기
		int[] temp = new int[right - left]; // 두 영역을 하나로 합칠 큰 배열
		int l = left; // 왼쪽 배열의 index
		int r = mid; // 오른쪽 배열의 index
		int index = 0; // 병합할 배열의 index
		
		while(l < mid && r < right) { // 왼쪽 오른쪽 모두 남아있을 경우
			if(arr[l] < arr[r]) {
				temp[index++] = arr[l++];
			}
			else {
				temp[index++] = arr[r++];
			}
		}
		System.arraycopy(arr, l, temp, index, mid-l); // 왼쪽만 남은 경우		
		System.arraycopy(arr, r, temp, index, right-r); // 오른쪽만 남은 경우
		System.arraycopy(temp, 0, arr, left, temp.length); // 합쳐진 temp를 arr에 덮어쓰기
//		하나씩 복사하므로 비효율적임
//		while(l < mid) { // 왼쪽만 남은 경우
//			temp[index++] = arr[l++]; // 하나씩 복사
//		}
//		while(r < right) { // 오른쪽만 남은 경우
//			temp[index++] = arr[r++];
//		}
	}
	
	// 쪼개기
	private static void mergeSort(int[] arr, int left, int right) {
		if(right - left <= 1) { // 종료 파트
			return;
		}else { // 재귀 파트
			int mid = (left + right) / 2; // 중간 index
			mergeSort(arr,left,mid);
			mergeSort(arr,mid, right);
			merge(arr, left, mid, right); // mid를 중심으로 영역을 반 나눔
			return;
		}
	}

	public static void main(String[] args) {
		int[] arr = {6,4,8,5,7,2,9,3,0,1}; // 10개, 0~9
		mergeSort(arr,0,arr.length); // 원본 배열을 직접 변경
		System.out.println(Arrays.toString(arr));
	}
}
