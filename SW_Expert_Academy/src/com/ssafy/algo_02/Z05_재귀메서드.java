package com.ssafy.algo_02;

import java.util.Arrays;

public class Z05_재귀메서드 {
	static int[] s = {2,3,5,7,7,7};
	
	public static void main(String[] args) {
		int n = 5;
//		팩토리얼 n! = 1*2*3*4 .. * n-1 * n
//			     = (n-1)! * n
//				 = (n-2)! * (n-1) * n		
//		f(n) = f(n-1) * n
		
//		2진수 3자리를 구성할 수 있는 모든 경우의 수를 재귀함수로 출력
//		000
//		001
//		010
//		011
//		100
//		101
//		111
		binary(0, 3, new int[3]);
		
		// 순열 만들기
		// 반복문
		
		/*for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int j2 = 0; j2 < 2; j2++) {
					for (int k = 0; k < 2; k++) {
						for (int k2 = 0; k2 < 2; k2++) {
							for (int l = 0; l < 2; l++) {
								if(i==1) System.out.print(s[0] + " ");
								if(j==1) System.out.print(s[1] + " ");
								if(j2==1) System.out.print(s[2] + " ");
								if(k==1) System.out.print(s[3] + " ");
								if(k2==1) System.out.print(s[4] + " ");
								if(l==1) System.out.print(s[5] + " ");		
								System.out.println();
							}
						}
					}
				}
			}
		}*/
		
		binary2(0,s.length,new int[s.length]);
		
	}
	
	// 팩토리얼 만들기
	public static int f(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return f(n-1) * n;
		}
	}
	
	// 2진수 찍기
	// 						 현재차수 , 몇자리인지, 3자리를 저장할 배열
	public static void binary(int i, int end, int[] arr) {
		if(i == end) { // 종료 조건
			System.out.println(Arrays.toString((arr)));
		}
		else {
			arr[i] = 0;
			binary(i+1,end,arr);
			arr[i] = 1;
			binary(i+1, end, arr);
		}
	}
	
	public static void binary2(int i, int end, int[] arr) {
		if(i == end) { // 종료 조건
			for (int j = 0; j < arr.length; j++) {
				if(arr[j] == 1) System.out.print(s[j] + " ");
			}
			System.out.println();
		}
		else {
			arr[i] = 0;
			binary2(i+1,end,arr);
			arr[i] = 1;
			binary2(i+1, end, arr);
		}
	}
}
