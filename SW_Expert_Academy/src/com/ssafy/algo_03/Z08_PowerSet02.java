package com.ssafy.algo_03;

import java.util.Scanner;

public class Z08_PowerSet02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] m = new int[10];
		int N = 10;
		int[] bit = new int[N]; // 각 원소를 (사용할지 1/사용안함 0)을 결정할 값을 저장할 배열
		
		for (int i = 0; i < m.length; i++) {
			m[i] = sc.nextInt();
		}
		
		
		for (int i = 0; i < (1 << N); i++) {
//			각 자리수 추출해보기
			for (int j = 0; j < N; j++) {
				if((i & 1 <<j) == 1<<j) {
					bit[j] = 1;
				}else {
					bit[j] = 0;
				}
			}
			print(bit, m);
		}
	}
	
	public static void print(int[] bit, int[] m) {
		int sum = 0; 
		
		for (int i = 0; i < bit.length; i++) {
			if(bit[i] == 1) {
				sum += m[i];
			}
		}
		
		if(sum==0) {
			System.out.print("부분 집합의 합이 0인 경우 : ");
			for (int i = 0; i < bit.length; i++) {
				if(bit[i] == 1) {
					System.out.print(m[i] + ",");
				}
			}
			System.out.println();
		}
	}
}
