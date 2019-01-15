package com.fillcell;

import java.util.Scanner;

public class ParityCheck_other {
	private static int N;
	private static int [][] map;
	
	private static boolean checkParity(int [][] map, int N) {
		for(int i = 1; i <= N; ++i) {
			int rSum = 0;
			int cSum = 0;
			
			for(int j = 1; j <= N; ++j) {
				rSum += map[i][j];
				cSum += map[j][i];
			}
			
			if(rSum % 2 != 0 || cSum % 2 != 0) return false;
		}
		return true;
	}
	
	private static String solve() {
		// 1. �и�Ƽ ���� �ִ� ���
		if(checkParity(map, N)) return "OK";

		// 2. �ϳ��� ��Ʈ���� �����ؼ� �и�Ƽ ������ �������
		for(int i = 1; i <= N; ++i)
			for(int j = 1; j <= N; ++j) {
				int temp = map[i][j];
				// reversion
				if(map[i][j] == 1) map[i][j] = 0;
				else map[i][j] = 1;
				
				//check
				if(checkParity(map, N)) return "Change bit (" + i + "," + j + ")";
				
				// recover
				map[i][j] = temp;
			}
		
		return "Corrupt";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		map = new int[N + 1][N + 1];
		
		for(int i = 1; i <= N; ++i)
			for(int j = 1; j <= N; ++j)
				map[i][j] = sc.nextInt();
		
		System.out.println(solve());
	}

}
