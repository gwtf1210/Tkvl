package com.ssafy.algo_03;

import java.util.Arrays;

/** 
 * 선형자료구조의 검색 방법
 * 1. 순차검색 O[N]
 * 2. 이진검색 O[log N] - 정렬된 자료에서만 가능
 * 3. 해싱기법 O[1]
 */

public class Z09_BianrySearch {
	public static void main(String[] args) {
		int a[] = {0,1,2,3,4,5,6,7,8,9,10};
		int key = 11; // 찾으려는 데이터
		binarySearch(a, 0, a.length-1, key);
		
//		if(Arrays.binarySearch(a, key) >= 0) {
//			System.out.println("찾음");
//		}else {
//			System.out.println("못 찾음");
//		}
		
//		int l = 0;
//		int r = a.length-1;
//		while(l <= r) { // 반복문
//			int mid = (l+r)/2;
//			if(key == a[mid]) {
//				System.out.println("찾음");
//				break;
//			}
//			else if(key < a[mid]) { // 작은쪽으로 범위 재설정
//				r = mid - 1;
//			}else { // 큰 쪽으로 범위 재설정
//				l = mid +1;
//			}
//		}
//		if(l > r) { // While의 거짓 조건
//			System.out.println(a[l]);
//			System.out.println("없음");
//		}
	} // end of main
	
	/** l:검색영역의 시작 index, r: 검색 영역의 마지막 index */ 
	public static void binarySearch(int[] a, int l, int r, int key) {
		if(l > r) { // 종료파트
			System.out.println("검색 실패");
			return;
		}else {
			int mid = (l + r)/2; // 중간 인덱스
			if(key == a[mid]) {
				System.out.println("찾음");
				return;
			}else if(key < a[mid]){ // 작은쪽으로 범위 재설정
				binarySearch(a, l, mid-1, key);
			}else { // if(key > a[mid]) // 큰 쪽으로 범위 재설정
				binarySearch(a, mid+1, r, key);				
			}
		}
	}
} // end of class
