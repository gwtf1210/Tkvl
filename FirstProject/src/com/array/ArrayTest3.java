package com.array;

import java.util.Random;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[][] some = new int[3][];
		some[0] = new int[3];
		some[1] = new int[5];
		some[2] = new int[1];

		for(int i=0;i<some.length;i++) {
			for(int j=0; j< some[i].length;j++) {
				System.out.print(some[i][j]+ " ");
			}
			System.out.println();
		}
		
		int[][] multi = new int[3][2];
		multi[0][1] = 123;
		multi[1][1] = 144;
		multi[2][0] = 103;
		multi[2][1] = 103;
		
		for(int i=0; i< multi.length; i++) {
			for(int j=0; j<multi[i].length ; j++) {
				System.out.print(multi[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
