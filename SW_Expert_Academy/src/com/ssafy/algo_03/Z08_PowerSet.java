package com.ssafy.algo_03;

import java.util.Arrays;

/**
 * PowerSet : 모든 부분집합을 원소로 하는 집합
 */

public class Z08_PowerSet {
	public static void main(String[] args) {
//		바이너리 카운팅 -> 속도가 빠르다. 나중에 가지치기가 안된다. 되더라도 성능 개선 여지가 없다.
//		4자리의 원소의 부분집합
		int N = 4;
		
		int[] bit = new int[N]; // 각 원소를 (사용할지 1/사용안함 0)을 결정할 값을 저장할 배열
		for (int i = 0; i < (1 << N); i++) {
//			각 자리수 추출해보기
			for (int j = 0; j < N; j++) {
				if((i & 1 <<j) == 1<<j) {
					bit[j] = 1;
				}else {
					bit[j] = 0;
				}
			}
			print(bit);
		}
			
//			System.out.println( i & 1<<0); // 1의자리
//			System.out.println( i & 1<<0); // 2^1 자리
//			System.out.println( i & 1<<3); // 2^2 자리
//			System.out.println( i & 1<<2); // 2^3 자리
			
//			String a = Integesr.toBinaryString(i);
//			System.out.println(a);
		}

		
		
		
////		0 1 2 3
//		int[] bit = new int[4]; // 각 원소를 (사용할지 1/사용안함 0)을 결정할 값을 저장할 배열
//		for (int i = 0; i < 2; i++) {
//			bit[0] = i;
//			for (int j = 0; j < 2; j++) {
//				bit[1] = j;
//				for (int k = 0; k < 2; k++) {
//					bit[2] = k;
//					for (int n = 0; n < 2; n++) {
//						bit[3] = n;
//						print(bit);
//					}
//				}
//			}
//		}
//	}
//	
//	public static void print(int[] bit) {
//		int[] arr = {8,4,7,2};
//		for (int i = 0; i < bit.length; i++) {
//			if(bit[i] == 1) {
//				System.out.print(arr[i] + ",");
//			}
//		}
//		System.out.println();
//	}
		
	public static void print(int[] bit) {
		int[] arr = {8,4,7,2};
		for (int i = 0; i < bit.length; i++) {
			if(bit[i] == 1) {
				System.out.print(arr[i] + ",");
			}
		}
		System.out.println();
	}
}
