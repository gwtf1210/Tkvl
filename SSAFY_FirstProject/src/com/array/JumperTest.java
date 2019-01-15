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
			int N = sc.nextInt(); // �迭 ũ��
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
			
			// 1:�� 2:�� 3:�� 4:�� 
			for(int move=0; move<move_cnt; move++) {
				int direction = sc.nextInt();
				int m = sc.nextInt();
				
				if(isStart == false) {
					break;
				}
				
				switch(direction){
				case 1: // ��
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
					
				case 3: // ��
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
					
				case 2: // ��
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
					
				case 4: // ��
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
