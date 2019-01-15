package com.array;

public class ArrayTest4 {

	public static void main(String[] args) {
		int[][] k = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{21,22,32,24,25},
				{16,12,53,44,35}};
		
		for(int i=0;i<k.length;i++) {
			for(int j=0;j<k[i].length;j++) {
				System.out.print(k[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0;i<k.length;i++) {
			for(int j=0;j<k[i].length;j++) {
				System.out.print(k[j][i] + " ");
			}
			System.out.println();
		}
	}
}
