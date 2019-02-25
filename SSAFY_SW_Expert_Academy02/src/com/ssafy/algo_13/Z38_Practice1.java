package com.ssafy.algo_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Z38_Practice1 {
	static int[] memo = new int[100];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine().trim());
		
		memo[0] = 1;
		memo[1] = 2;
		
		// f(n) = f(n-1) + f(n-2); // Á¡È­½Ä
		for (int i = 2; i <= N; i++) {
			memo[i] = memo[i-1] + memo[i-2];
		}
		
		System.out.println(memo[N]);
		
	}
}
