package com.ssafy.algo_01;

public class Z03_Bubble_Sort {
	private static int[] bouble_Sort(int[] A, int n) {
		for (int i = n-1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if(A[j]>A[j+1]) {
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
			}
		}
		return A;
	}
	
	public static void main(String[] args) {
		int[] A = {5,4,1,2,8,9,10};
		int[] bA = new int[A.length];

		bA = bouble_Sort(A,A.length);
		
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}
}
