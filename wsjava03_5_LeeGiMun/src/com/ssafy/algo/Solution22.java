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
		int T=sc.nextInt();//�׽�Ʈ ���̽� ��

		for(int test_case=1; test_case<=T; test_case++){
			N=sc.nextInt(); //�迭�� ũ�� NxN
			int[][] lake=new int[N][N];

			S=sc.nextInt();//�ұ�����(Strider)��
			int[][] strider=new int[S][3];
			for(int k=0; k < S; k++){
				strider[k][0]=sc.nextInt();//����ġ
				strider[k][1]=sc.nextInt();//����ġ
				strider[k][2]=sc.nextInt();//���� (��:1, ��:2, ��:3, ��:4)
			}
			
			Answer=0;//spider number survived
			int i,j,dir;
			for(int s= 0;s < S; s++){
				i=strider[s][0];//x��ǥ
				j=strider[s][1];//y��ǥ
				dir=strider[s][2];//����

				if(lake[i][j] == 0){//�ȶ��ڸ���
					if(dir==1){//��
						int nx = i - 3;//x���� �پ��
						if(inRange(nx, j) && lake[nx][j] == 0) {//�����ȿ� �ְ� ���� �ȶ� �ڸ���
							nx = nx - 2;
							if(inRange(nx, j) && lake[nx][j] == 0) {//�����ȿ� �ְ� ���� �ȶ� �ڸ���
								nx = nx - 1;
								if(inRange(nx, j) && lake[nx][j] == 0) {//����° �ڸ��϶� ��ŷ
									lake[nx][j] = 1;
									Answer++;//��� �ִ� �ұ����� ��
								}
							}
						}					
					}else if(dir==2){//��
						int nx = i + 3;//x���� �þ
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
					}else if(dir==3){//��
						int ny = j - 3;//y���� �پ��
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
					}else if(dir==4){//��
						int ny = j + 3;//y���� �þ
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