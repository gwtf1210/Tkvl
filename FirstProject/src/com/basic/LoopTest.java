package com.basic;

public class LoopTest {
	public static void main(String[] args) {

		here:
		for (int i = 0; i < 5; i++) {
			if(i==3)
				break here;
			System.out.println("hello!");
		}
		System.out.println();
		
		
		for(int i=0; i<4; i++) {
			for(int k=3;k>i;k--) {
				System.out.print(" ");	
			}
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i = 1; i < 5; i++) {
			for(int j=4; j>0; j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		/*
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < 3; j++) {
				System.out.println(i + "-" + j + " ");
			}
			System.out.println();
		}



		int j = 0;
		while (j < 5) {
			System.out.print("welcome, \t");
			j++;
		}

		System.out.println();

		String[] names = { "tommy", "bill", "jane" };
		for (String name : names) {
			System.out.println(name + " ");
		}
		 */
	}
}
