package com.ssafy.algo_04;

/** 
 * 재귀함수
 */
public class Z14_Recursive {
	public static int fact(int n) {
		if(n==1) { // 종료파트
			return 1;
		}else { // 반복파트
			return n*fact(n-1);
		}
	}
	public static int[] memo = new int[20];
	public static int f(int n) {
		if(n >= 2 && memo[n] == 0) {
			memo[n] = f(n-1) + f(n-2);
			return n;
		}
		return memo[n];
	}
	
	public static void main(String[] args) {
		int[] dp = new int[20];
		dp[0] = 0;
		dp[1] = 1;
		int N = 8;
		
		for (int i = 2; i <= N; i++) {
			dp[i] = dp[i-1] + dp[i-2]; // 점화식
		}
		
		System.out.println(dp[8]);
		
		
		
//		memo[0] = 0;
//		memo[1] = 1; // 종료파트의 값을 초기화
//		
//		System.out.println(f(7));
		
//		System.out.println(fact(13)); // int형 범위의 표현가능한 숫자 13!
//		System.out.println(fact(14)); // overflow
	}
}
