package com.fillcell;
import java.util.Scanner;
/**
 * 배열 크기와 좌표를 입력 받아 해당 좌표에 1을 표시한후 전체 배열을 화면에 출력
 * 
 * 입력 : 
 *  배열의 크기   row좌표, column좌표
 *  ex) 3 1 1
 * 
 */
public class FillCell01 {
	static int N;//배열 크기
	static int[][] map;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 N = sc.nextInt();
		 int x = sc.nextInt();
		 int y = sc.nextInt();
		 
		 map = new int[N][N];
		 
		 map[x][y] = 1;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
}
