package com.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StriderTest {
	
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src\\com\\data\\Solution21.txt"));
		final Scanner sc = new Scanner(System.in);	
		
		int tc = sc.nextInt(); // test case
		
		for(int i = 0; i < tc; i++) {
			int N = sc.nextInt(); // 배열 크기
			int sault_n = sc.nextInt();
			
			int[][] array = new int[N][N];
			
			boolean nobody = true;
			
			for(int sault_cnt = 0; sault_cnt < sault_n; sault_cnt++) {
				int sx=sc.nextInt();
				int sy=sc.nextInt();
				int direction = sc.nextInt();
				int sault_jump_cnt = 3;
			
				if(array[sx][sy] == 1) {
					System.out.println("#" + (i+1) + " " + (sault_cnt+1));
					nobody = true;
					continue;
				}
				
				array[sx][sy] = 1; 
				
				switch(direction) {
				case 1: // 하
					for(int x=sx+(sault_jump_cnt--); x<N; x+=sault_jump_cnt) {
						if(array[x][sy] == 1) {
							System.out.println("#" + (i+1) + " " + (sault_cnt+1));
							nobody = false;
						}else {
							array[x][sy] += 1;
						}
					}
					break;
					
				case 2: // 우
					for(int y=sy+(sault_jump_cnt--); y<N; y+=sault_jump_cnt) {
						if(array[sx][y] == 1) {
							System.out.println("#" + (i+1) + " " + (sault_cnt+1));
							nobody = false;
						}else {
							array[sx][y] += 1;
						}
					}
					break;
				}
			}
			if(nobody) {
				System.out.println("#" + (i+1) + " 0");
			}
		}
	}
}
