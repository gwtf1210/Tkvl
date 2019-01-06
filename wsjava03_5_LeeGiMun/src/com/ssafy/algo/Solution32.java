package com.ssafy.algo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution32 {
	static int Answer;
	static int Y, X, N, P;
	
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src\\com\\data\\Solution32.txt"));
		final Scanner sc = new Scanner(System.in);	
		int T = sc.nextInt(); // Test case

		for (int test_case = 1; test_case <= T; test_case++) {
			Y = sc.nextInt(); // position row
			X = sc.nextInt(); // position col
			N = sc.nextInt(); // 참가자 수

			int[][] room = new int[Y + 1][X + 1];
			for (int i = 1; i <= Y; i++) {   
				for (int j = 1; j <= X; j++) {
					room[i][j] = sc.nextInt();
				}
			}

			int[][] player = new int[N][3];
			for (int i = 0; i < N; i++) {	
				player[i][0] = sc.nextInt(); 
				player[i][1] = sc.nextInt(); 
				player[i][2] = sc.nextInt(); 
			}

			P =sc.nextInt();
			int[][] trap=new int[P][2];
			for(int i = 0; i < P; i++){
				trap[i][0] = sc.nextInt();
				trap[i][1] = sc.nextInt();
			}

			Answer=0;
			for(int k = 0; k < P; k++){
				int ti=trap[k][0];
				int tj=trap[k][1];
				room[ti][tj]=0;
			}
	
			for(int i=0; i<N; i++) {		
				int x = player[i][0];		
				int y = player[i][1];        
				int Move = player[i][2];		
				int reward =- 1000;
				boolean isout = false;

				for(int m=0; m<Move; m++){		
					int dir = room[x][y]/10;	
					int cnt = room[x][y]%10;	
					
					if(dir==4){//
						if(x - cnt >= 1 && room[x-cnt][y] != 0){
							x=x-cnt;

						}else{		
							isout=true;
							break;
						}
					}
					
					else if(dir==1){
						if(y + cnt <= X && room[x][y+cnt] != 0){
							y = y + cnt;
						}else{
							isout = true;
							break;
						}
					}
					
					else if(dir==2){
						if(x + cnt <= Y && room[x + cnt][y] != 0){
							x  =x + cnt;
						}else{
							isout = true;
							break;
						}
					}
					
					else if(dir==3){
						if(y-cnt>=1 && room[x][y-cnt] != 0){
							y=y-cnt;
						}else{
							isout=true;
							break;
						}
					}

				}

				if(isout==false)
					reward = reward + room[x][y] * 100;

				Answer= Answer + reward;
			}
			System.out.println("#" + test_case + " " + Answer);
		}
	}
}
