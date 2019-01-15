package com.ssafy.algo_03;

import java.util.Arrays;

public class Z11_Practice03 {
	public static void main(String[] args) {
		int[][] a = {
				{9,20,2,18,11},
				{19,1,25,3,21},
				{8,24,10,17,7},
				{15,4,16,5,6},
				{12,13,22,23,14}
		};
		
		int[] b = new int[a.length*a.length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				b[i*5+j] = a[i][j]; // 2���� �迭�� ��ó�� 1���� �迭�� ����
			}
		}
		Arrays.sort(b); // 1���� �迭 �������� ����
		
		int[][] x = new int[a.length][a.length];
		int r = 0; 
		int c = -1; // ��谪�� �Ѿ�� �ʰ� �ϱ� ����
		int size = a.length; // �������� �̵��� ��
		int index = 0;
		
		while(size > 0) {
			for (int i = 0; i < size; i++) { // ����
				x[r][++c] = b[index++];
			}
			size--;
			for (int i = 0; i < size; i++) { // �Ʒ�
				x[++r][c] = b[index++];
			}
			for (int i = 0; i < size; i++) { // ����
				x[r][--c] = b[index++];
			}
			size--;
			for (int i = 0; i < size; i++) { // ����
				x[--r][c] = b[index++];
			}
		}
		
		// ���
		for (int i = 0; i < x.length; i++) {
			System.out.println(Arrays.toString(x[i]));
		}
		System.out.println(r + ", " +c);
	}
}

