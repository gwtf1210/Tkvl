package com.ssafy.algo_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Z39_Practice2 {
	static int[] memo = new int[100];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine().trim());
		
		
		memo[0] = 1;
		memo[1] = 2;
		memo[2] = 5;
		
		for (int i = 3; i <= N; i++) {
			memo[i] = 2*memo[i-1] + memo[i-2];
		}
		System.out.println(Arrays.toString(memo));
		System.out.println(memo[N]);
		
		
	}
}
