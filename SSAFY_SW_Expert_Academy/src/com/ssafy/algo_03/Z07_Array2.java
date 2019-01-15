package com.ssafy.algo_03;

import java.util.Arrays;
import java.util.Random;

public class Z07_Array2 {

	public static void main(String[] args) {
//		연습문제 1 5x5 이차원배열의 인접칸과의 차(절대값)의 합
//		알고리즘 문제풀이에서는 메모리를 낭비하고 시간을 절약한다.
		int[][] array = new int[7][7]; // 상,하,좌,우 한줄씩 여유 줄을 생성 (+2씩)
//		java.lang 패키지의 클래스는 import 없이 사용,
//		double d = Math.random(); // 0.0 <= d < 1.0
		
		Random ran = new Random();
//		int  x =  ran.nextInt(10); // 0 <= x < 10
		
//		크기가 주어진 경우 변수의 값을 한번에 참조하도록 만드는 것이 좋은 방법이다.
		for (int i = 1; i < array.length -1; i++) {
			for (int j = 1; j < array[i].length -1; j++) {
//				double randomValue = Math.random();
				array[i][j] =  ran.nextInt(10);
			}
		}
		
//		메모리 낭비하기
		for (int i = 1; i < array.length -1; i++) {
			array[0][i] = array[1][i]; // 위
			array[6][i] = array[5][i]; // 아래
			array[i][0] = array[i][1]; // 좌
			array[1][6] = array[i][5]; // 우
		}

//		빠르게 2차원 배열 값 찍어보기
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		
		int[] dy = {-1,1,0,0};
		int[] dx = {0,0,-1,-1};
		
		int sum = 0;
		
		for (int i = 1; i < array.length-1; i++) {
			for (int j = 1; j < array[i].length-1; j++) {
//				int temp = array[i-1][j] - array[i][j]; // 연산시간 줄이기, 상
				for (int k = 0; k < dx.length; k++) {
					int temp = array[i + dy[k]][j + dx[k]] - array[i][j];
					sum += temp >= 0 ? temp : -temp;
				}
			}
		}
		System.out.println(sum);
	}
}
