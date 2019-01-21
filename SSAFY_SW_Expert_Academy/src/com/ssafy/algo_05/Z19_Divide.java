package com.ssafy.algo_05;
/**
 * 분할 정복
 */
public class Z19_Divide {
	// base : 밑수, ex : 지수, 반복문으로 구해보기
	public static int power(int base, int exp) {
		int result = 1;
		for (int i = 0; i < exp; i++) {
			result *= base;
		}
		return result;
	}
	public static int power2(int base, int exp) {
		if( exp == 0) {
			return 1;
		}else if(exp == 1) {
			return base;
		}else { // 재귀파트
			// 2^10 = 2^5 * 2^5
			// 2^9 = 2^4 * 2^4 * 2
			int n = power(base,exp/2);
			if(exp % 2  == 0) { // 짝수이면
				return n*n;
			}else { // 홀수이면
				return n*n*base;
			}
		}
	}
	
	public static void main(String[] args) {
		// 2의 10슬 값을 구하기
		System.out.println(power(2,10));
		System.out.println(power(2,9));
		
	} // end of main
} // end of class
