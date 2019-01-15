package com.fillcell;
import java.util.Scanner;
/**
 * 배열 크기와 좌표를 입력 받아 해당 좌표의 상하좌우에 1을 표시한후 전체 배열을 화면에 출력
 * (경계 검사)
 * 
 * 입력 : 배열의 크기,   row좌표, column좌표
 *  ex) 3 0 0 
 *  5 4 4
 *  6 0 4
 */
public class FillCell03 {
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
		
		 
		 map = new int[N][N];
		 
		 //          상      하    좌     우
		 int[] xs = {-1,  1,  0,  0};
		 int[] ys = { 0,  0, -1,  1};
		 
		 for(int i = 0 ; i < xs.length; i++) { // 상하좌우 4번
			 int nx = x + xs[i];
			 int ny = y + ys[i];
			 if(inRange(nx,ny)) {
				 map[nx][ny] = 1;
			 }
		 }
		 
/*		 int up = 1, down = 1, left = 1, right = 1;
		 if(x == 0) up = 0; 
		 if(x == N-1) down = 0;
		 if(y == 0) left = 0;
		 if(y == N-1) right = 0;
			
		 map[x-up][y] = up; // 상 
		 map[x+down][y] = down; // 하
		 map[x][y-left] = left; // 좌
		 map[x][y+right] = right; // 우
*/
		 
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
}

