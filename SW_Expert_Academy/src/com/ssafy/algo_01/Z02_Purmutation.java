package com.ssafy.algo_01;

/*
 * 순열 Purmutation
 */

public class Z02_Purmutation {
	public static void main(String[] args) {
		
		// {1,2,3} 의 모든 순열을 출력하시오.
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				// if(i==j) continue; // 들여쓰기 줄이는 Tip
				if(i != j) {
					for (int k = 1; k <= 3; k++) {
						// if(i==k || j ==l) continue; // 들여쓰기 줄이는 Tip
						if(i != k && j != k) {
							System.out.println(i + ", " + j + ", " + k);
						}
					}
				}
			}	
		}
	}
}
