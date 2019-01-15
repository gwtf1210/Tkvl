package com.ssafy.algo_01;

public class Z03_CountingSort {
	private static int[] counting_Sort(int[] A, int[] B, int K) {
		
		int[] C = new int[K];
		
		for (int i = 0; i < C.length; i++)
			C[i] = 0;
		
		for (int i = 0; i < A.length; i++)
			C[A[i]] +=1 ;
		
		for (int i = 2; i < C.length; i++) 
			C[i] = C[i] + C[i-1];
		
		for (int j = A.length-1; j >= 0; j--) {
			B[C[A[j]]] = A[j];
			C[A[j]] -= 1;
		}
		
		return B;
	}
	
	public static void main(String[] args) {
		int[] A = {5,4,1,2,8,9,10};
		int[] B = new int[10];
		
		B = counting_Sort(A,B,11);
		
		for (int i = 0; i < B.length; i++) {
			if(B[i]==0) continue;
			System.out.print(B[i] + " ");
		}
		
	
	}
}
