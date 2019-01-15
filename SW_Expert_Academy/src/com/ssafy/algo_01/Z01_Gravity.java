package com.ssafy.algo_01;

import java.util.Arrays;

// 1. 굳이 회전을 안해도 됨
// 2. 2차원 배열 안해도 됨
public class Z01_Gravity {
	public static void main(String[] args) {
		int[] m = {7,4,2,0,0,6,0,7,0};

		int[][] room = new int[8][9]; // 8행 9열의 공간
		
		// 1차원 배열값 읽어서 박스 채우기 
		for (int i = 0; i < 9; i++) { // 열 0~8
			for (int j = 7; m[i]>0; j--, m[i]--) { // 행 7~0
				room[j][i] = 1;
			}
		}
		
		for (int i = 0; i < room.length; i++) { // 8행
			for (int j = 0; j < room[i].length; j++) { // 9열
				System.out.print(room[i][j] + " ");
			}
			System.out.println();
		}
			
		// 90도 오른쪽으로 회전시키기
		int[][] nRoom  = new int[9][8];
		for (int i = 0; i < room.length; i++) { // 8행
			for (int j = 0; j < room[i].length; j++) { // 9열
				nRoom[j][7-i] = room[i][j];	
			}
		}
		/*// 반복문 모를때 노가다 해봐라
		nRoom[0][7] = room[0][0];
		nRoom[1][7] = room[0][1];
		nRoom[2][7] = room[0][2];
		nRoom[3][7] = room[0][3];*/
		
		// 떨어뜨리기
		int maxGap = 0;
		for (int i = 7; i >= 0; i--) { // 8행은 안 떨어지므로 7~0 
			for (int j = 0; j < nRoom[i].length; j++) {
				int gap = 0; // 낙차 카운팅
				if(nRoom[i][j] == 1) { // 박스이면 아래로 떨어뜨려라
					for (int k = 0; k < 9; k++) {
						if(i+k+1 >= 9 || nRoom[i+k+1][j] == 1) break; // 아래 칸이 박스가 아니어야 떨어뜨릴 수 있음
						nRoom[i+k][j] = 0; // 박스를 아래로 내리기
						nRoom[i+k+1][j] = 1;
						gap++;
					}
					if(maxGap < gap) maxGap = gap;
				}
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < nRoom.length; i++) { // 8행
			for (int j = 0; j < nRoom[i].length; j++) { // 9열
				System.out.print(nRoom[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("최대 낙차 : " + maxGap);
		
	} // end of main
} // end of class
