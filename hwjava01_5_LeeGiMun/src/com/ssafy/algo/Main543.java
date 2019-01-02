package com.ssafy.algo;

import java.util.Scanner;

public class Main543 {
	static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
}
