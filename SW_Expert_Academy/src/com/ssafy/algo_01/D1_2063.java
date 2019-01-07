package com.ssafy.algo_01;

import java.util.Arrays;
import java.util.Scanner;

public class D1_2063 {
	final static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[N/2]);
		
		
	}

}
