package com.ssafy.algo_01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class D3_5215 {
	static final Scanner sc = new Scanner(System.in);
	
		public static void main(String[] args) {
		int tc = sc.nextInt(); // test case

		for(int i = 1; i <= tc; i++) {
			int N = sc.nextInt(); // 재료의 개수
			int L = sc.nextInt(); // 제한 칼로리			
			int[][] array = new int[N][2]; // 점수, 칼로리

			for(int j=0; j<N; j++) {
				array[j][0] = sc.nextInt(); // 점수
				array[j][1] = sc.nextInt(); // 칼로리
			}
			
			Arrays.sort(array, new Comparator<int[]>() {
			    @Override
			    public int compare(int[] o1, int[] o2) {
			        return Integer.compare(o2[1], o1[1]);
			    }
			});
			
			int max_score = 0, tmp = 0;
			int sum_cal = 0;
			
			for(int j=N-1; j>=0; j--) {
				sum_cal += array[j][1];
				if(sum_cal > L) break;
				
				tmp += array[j][0];
				max_score = (max_score<tmp) ? tmp : max_score;
			}
			
			System.out.printf("#%d %d\n",i, max_score);
		}
	}
}