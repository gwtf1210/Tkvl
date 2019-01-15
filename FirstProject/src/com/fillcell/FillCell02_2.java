package com.fillcell;
import java.util.Scanner;
/**
 * 배열 크기와 좌표를 입력 받아 해당 좌표의 상하좌우에 1을 표시한후 전체 배열을 화면에 출력
 * 
 * 입력 : 
 *  배열 크기,   row좌표, column좌표
 *  ex) 3 1 1
 *  5 2 2
 *  8 4 5
 * 
 */
public class FillCell02_2 {
	static int N;//배열 크기
	static int[][] map;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/// 처리 코드 작성
		
		 N = sc.nextInt();
		 int x = sc.nextInt();
		 int y = sc.nextInt();
		 
		 map = new int[N][N];
		 //          상      하    좌     우
		 int[] xs = {-1,  1,  0,  0};
		 int[] ys = { 0,  0, -1,  1};
		 
		 for(int i = 0 ; i < xs.length; i++) { // 상하좌우 4번
			 int nx = x + xs[i];
			 int ny = y + ys[i];
			 map[nx][ny] = 1;
		 }
		 
/*		 map[x-1][y] = 1; // 상
		 map[x+1][y] = 1; // 하
		 map[x][y-1] = 1; // 좌
		 map[x][y+1] = 1; // 우
*/		
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
}
