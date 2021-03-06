package com.fillcell;
import java.util.Scanner;
/**
 * 입력좌표에서 지정한 칸수만큼 상하좌우로 1 채우기
 * 입력 : 배열의 크기,   row좌표, column좌표, 칸수
 *  ex) 8  1  1  3
 *  5 2 2 2
 *  10 2 8 5
 */
public class FillCell04 {
	static int N;//배열 크기
	static int[][] map;
	
	public static boolean inRange(int nx, int ny) {
		if(nx >= 0&& nx < N && ny >= 0 && ny < N) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			
	
		/// 처리 코드 작성
		 N = sc.nextInt();
		 int x = sc.nextInt();
		 int y = sc.nextInt();
		 int cnt = sc.nextInt();
		 
		 map = new int[N][N];
		 
		 //          상      하    좌     우
		 int[] xs = {-1,  1,  0,  0};
		 int[] ys = { 0,  0, -1,  1};
		 
		 for(int i = 0 ; i < xs.length; i++) { // 상하좌우 4번
			 for(int j = 1; j <= cnt; j++) {
				 int nx = x + (j*xs[i]);
				 int ny = y + (j*ys[i]);
				 if(inRange(nx,ny)) {
					 map[nx][ny] = 1;
				 }	 
			 }
		 }
		
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
}
