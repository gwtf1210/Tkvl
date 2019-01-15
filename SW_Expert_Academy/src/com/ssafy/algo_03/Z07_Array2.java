package com.ssafy.algo_03;

import java.util.Arrays;
import java.util.Random;

public class Z07_Array2 {

	public static void main(String[] args) {
//		�������� 1 5x5 �������迭�� ����ĭ���� ��(���밪)�� ��
//		�˰��� ����Ǯ�̿����� �޸𸮸� �����ϰ� �ð��� �����Ѵ�.
		int[][] array = new int[7][7]; // ��,��,��,�� ���پ� ���� ���� ���� (+2��)
//		java.lang ��Ű���� Ŭ������ import ���� ���,
//		double d = Math.random(); // 0.0 <= d < 1.0
		
		Random ran = new Random();
//		int  x =  ran.nextInt(10); // 0 <= x < 10
		
//		ũ�Ⱑ �־��� ��� ������ ���� �ѹ��� �����ϵ��� ����� ���� ���� ����̴�.
		for (int i = 1; i < array.length -1; i++) {
			for (int j = 1; j < array[i].length -1; j++) {
//				double randomValue = Math.random();
				array[i][j] =  ran.nextInt(10);
			}
		}
		
//		�޸� �����ϱ�
		for (int i = 1; i < array.length -1; i++) {
			array[0][i] = array[1][i]; // ��
			array[6][i] = array[5][i]; // �Ʒ�
			array[i][0] = array[i][1]; // ��
			array[1][6] = array[i][5]; // ��
		}

//		������ 2���� �迭 �� ����
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		
		int[] dy = {-1,1,0,0};
		int[] dx = {0,0,-1,-1};
		
		int sum = 0;
		
		for (int i = 1; i < array.length-1; i++) {
			for (int j = 1; j < array[i].length-1; j++) {
//				int temp = array[i-1][j] - array[i][j]; // ����ð� ���̱�, ��
				for (int k = 0; k < dx.length; k++) {
					int temp = array[i + dy[k]][j + dx[k]] - array[i][j];
					sum += temp >= 0 ? temp : -temp;
				}
			}
		}
		System.out.println(sum);
	}
}
