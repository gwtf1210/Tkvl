package com.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JumperTest {
	
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src\\com\\data\\Solution42.txt"));
		final Scanner sc = new Scanner(System.in);	
		int tc = sc.nextInt(); // test case
		
		for(int i = 0; i < tc; i++) {
			int N = sc.nextInt(); // 배열 크기
			N+=1;
			int[][] array = new int[N][N];
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			int jumper_cnt = sc.nextInt();
			boolean isStart = true;
			
			// init jumper
			for(int jumper = 0; jumper < jumper_cnt; jumper++) {
				int tmp_x=sc.nextInt();
				int tmp_y=sc.nextInt();
				array[tmp_x][tmp_y] = 99;
			}
			
			int move_cnt = sc.nextInt();
			
			// 1:상 2:우 3:하 4:좌 
			for(int move=0; move<move_cnt; move++) {
				int direction = sc.nextInt();
				int m = sc.nextInt();
				
				if(isStart == false) {
					break;
				}
				
				switch(direction){
				case 1: // 상
					if(x-m > 0){
						if(array[x-=m][y] == 99) {
							x=0; y=0;
							isStart = false;
						}
					}else {
						x=0; y=0;
						isStart = false;
					}
					break;
					
				case 3: // 하
					if(x+m <= N) {
						if(array[x+=m][y] == 99) {
							x=0; y=0;
							isStart = false;
						}
					}else {
						x=0; y=0;
						isStart = false;
					}
					break;
					
				case 2: // 좌
					if(y-m > 0) {
						if(array[x][y-=m] == 99) {
							x=0; y=0;
							isStart = false;
						}
					}else {
						x=0; y=0;
						isStart = false;
					}
					break;
					
				case 4: // 우
					if(y+m <= N) {
						if(array[x][y+=m] == 99) {
							x=0; y=0;
							isStart = false;
						}
					}else {
						x=0; y=0;
						isStart = false;
					}
					break;
				}
			}
			System.out.println("#"+(i+1)+" "+x+" "+y);
		}
	}
}
