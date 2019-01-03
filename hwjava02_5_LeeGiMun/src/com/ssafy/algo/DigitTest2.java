package com.ssafy.algo;

import java.util.Arrays;
import java.util.Scanner;

public class DigitTest2 {
	static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num = sc.nextInt();
		
		int[] array = new int[101];
		
		array[0] = 100;
		array[1] = num;
		
		System.out.print(array[0] + "  " + array[1] + " ");
		
		for(int i=2; i<array.length ; i++) {
			array[i] = array[i-2] - array[i-1];
			if(array[i] >= 0) {
				System.out.print(array[i]+ " ");
			}else {
				System.out.print(array[i]+ " ");
				break;
			}
		}
	}

}
