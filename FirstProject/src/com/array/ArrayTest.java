package com.array;

public class ArrayTest {
	public static void main(String[] args) {
		/*
		 * 1. �迭 ����
		 * 2. �迭 ����
		 * 3. �迭 ���
		 */
		int num = 7;
		int[] score;
		int[] a, b;
		int[] x, y[], z[][];
		
		score = new int[3]; // ����
		score[0] = 123; // ���
		score[1] = 300;
		score[2] = 789;
		int len = score.length; // �迭 ũ�� 3
		
		for(int i = 0; i < 3; i++) { 
			System.out.println(score[i]);
		}
		
		for(int s:score) {
			System.out.println(s);
		}
		
		System.out.println();
		int[] codes = new int[1000];
		boolean[] flags = new boolean[20];
		double[] points = new double[300];
		String[] names = new String[500]; 
		
		System.out.println(codes[567]);
		System.out.println(flags[11]);
		System.out.println(points[37]);
		System.out.println(names[57]);
		
	}
}
