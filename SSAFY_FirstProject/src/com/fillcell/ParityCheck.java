package com.fillcell;

import java.util.Scanner;

public class ParityCheck {

	static int N;//배열 크기
	static int[][] map;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			
		
		 N = sc.nextInt();
		 map = new int[N][N];
		 boolean pc = false;
		 int cnt = 0;
		 
		 for(int x = 0; x < N; x++) {
			 for(int y = 0; y < N; y++) {
				 map[x][y] = sc.nextInt();				 
			 }
		 }
		 
		 int[] x_sum = new int[N];
		 int[] y_sum = new int[N];
		 int x_pc = 0, y_pc = 0;
				 
		 for(int x = 0; x < N; x++) {
			 for(int y = 0; y < N; y++) {
				 x_sum[x] += map[x][y];
				 y_sum[y] += map[x][y];
			 }
		 }
		 
		 for(int i =0; i<N; i++) {
			 if(x_sum[i] %2 == 1) {
				x_pc = i;
				cnt ++;
				pc = false;
			 }
			 if(y_sum[i] %2 == 1) {
				 y_pc= i;	
				 cnt ++;
				 pc = false;
			 }
			 else pc = true;
		 }
		 
		 System.out.println();
		 if(cnt >= 2) System.out.println("Corrupt");
		 else if(x_pc > 0 || y_pc > 0 ) System.out.printf("Change bit (%d,%d)",x_pc+1,y_pc+1);
		 else if(pc) System.out.println("OK");
	}
}
