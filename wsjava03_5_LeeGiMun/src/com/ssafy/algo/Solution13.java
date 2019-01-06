package com.ssafy.algo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution13 {
	
	public static boolean inRange(int nx, int ny, int N) {
		if(nx >= 0&& nx < N && ny >= 0 && ny < N) {
			return true;
		}else {
			return false;
		}
	}
	
	private static void func(int tc,char[][] map){
		//               상      하    좌     우    상좌     상우     하좌     하우 
		int[] check_x = {-1,  1,  0,  0,  -1,   -1,   1,    1};
		int[] check_y = { 0,  0, -1,  1,  -1,    1,  -1,    1};
		int tmp_x, tmp_y;
		int[] tmp_array = new int[10];
		int tmp = 0;
		
		for(int x = 0; x < map.length; x++) {
			for(int y = 0; y < map.length; y++) {
				int check = 0;
				if(map[x][y] == 'G') continue; // 공원 단지면 continue
				
				for(int i = 0 ; i <check_x.length; i++) {
					int nx = x + check_x[i];
					int ny = y + check_y[i];
					
					 if(inRange(nx,ny,map.length)) {
						 if(map[nx][ny] == 'G') check++;
					 }
				}
				 
				if(check==0) { // G가 하나도 없는 경우, BastCase
					tmp_array[tmp++]=countFloor(tc,x,y, map); // 층수 저장
				} 
			}
		}
		int best_floor = 0;
		
		for(int i=0;i<tmp_array.length;i++) 
			best_floor = (tmp_array[i]>best_floor) ? tmp_array[i] : best_floor;	
				
		System.out.printf("#%d %d \n",tc+1,best_floor);
	}
	
	private static int countFloor(int tc, int x, int y, char[][] map) {
		int floor_sum = 0;
		for(int i = 0; i < map.length; i++) {
			if(map[i][y] == 'B') floor_sum ++;
			if(map[x][i] == 'B') floor_sum ++;
		}
		return floor_sum-1;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src\\com\\data\\Solution13.txt"));
		final Scanner sc = new Scanner(System.in);	
		
		int tc = sc.nextInt(); // TestCase 수

		for(int i = 0; i < tc; i++) {
			int N = sc.nextInt(); // 배열의 크기
			char[][] map = new char[N][N];
			
			for(int x = 0; x < N; x++) {
				for(int y = 0; y < N; y++) {
					map[x][y] = sc.next().charAt(0);
				}
			}
			func(i,map);
		}
	}

}
