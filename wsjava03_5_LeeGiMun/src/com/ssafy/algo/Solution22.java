package com.ssafy.algo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution22 {
	static long Answer;
	static int N, S;
	
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src\\com\\data\\Solution22.txt"));
		final Scanner sc = new Scanner(System.in);	
		int T=sc.nextInt();//테스트 케이스 수

		for(int test_case=1; test_case<=T; test_case++){
			N=sc.nextInt(); //배열의 크기 NxN
			int[][] lake=new int[N][N];

			S=sc.nextInt();//소금쟁이(Strider)수
			int[][] strider=new int[S][3];
			for(int k=0; k < S; k++){
				strider[k][0]=sc.nextInt();//행위치
				strider[k][1]=sc.nextInt();//열위치
				strider[k][2]=sc.nextInt();//방향 (상:1, 하:2, 좌:3, 우:4)
			}
			
			Answer=0;//spider number survived
			int i,j,dir;
			for(int s= 0;s < S; s++){
				i=strider[s][0];//x좌표
				j=strider[s][1];//y좌표
				dir=strider[s][2];//방향

				if(lake[i][j] == 0){//안뛴자리면
					if(dir==1){//상
						int nx = i - 3;//x값만 줄어듦
						if(inRange(nx, j) && lake[nx][j] == 0) {//범위안에 있고 아직 안뛴 자리면
							nx = nx - 2;
							if(inRange(nx, j) && lake[nx][j] == 0) {//범위안에 있고 아직 안뛴 자리면
								nx = nx - 1;
								if(inRange(nx, j) && lake[nx][j] == 0) {//세번째 자리일때 마킹
									lake[nx][j] = 1;
									Answer++;//살아 있는 소금쟁이 수
								}
							}
						}					
					}else if(dir==2){//하
						int nx = i + 3;//x값만 늘어남
						if(inRange(nx, j) && lake[nx][j] == 0) {
							nx = nx + 2;
							if(inRange(nx, j) && lake[nx][j] == 0) {
								nx = nx + 1;
								if(inRange(nx, j) && lake[nx][j] == 0) {
									lake[nx][j] = 1;
									Answer++;
								}
							}
						}
					}else if(dir==3){//좌
						int ny = j - 3;//y값만 줄어듦
						if(inRange(i, ny) && lake[i][ny] == 0) {
							ny = ny - 2;
							if(inRange(i, ny) && lake[i][ny] == 0) {
								ny = ny - 1;
								if(inRange(i, ny) && lake[i][ny] == 0) {
									lake[i][ny] = 1;
									Answer++;
								}
							}
						}
					}else if(dir==4){//우
						int ny = j + 3;//y값만 늘어남
						if(inRange(i, ny) && lake[i][ny] == 0) {
							ny = ny + 2;
							if(inRange(i, ny) && lake[i][ny] == 0) {
								ny = ny + 1;
								if(inRange(i, ny) && lake[i][ny] == 0) {
									lake[i][ny] = 1;
									Answer++;
								}
							}
						}						
					}
				}
			}
			System.out.println("#"+test_case+" "+Answer);
		}
	}

	private static boolean inRange(int x, int y) {
		if(x >= 0 && x < N && y >= 0 && y < N)
			return true;
		else
			return false;
	}
}