package com.ssafy.algo;

import java.util.Scanner;

public class Main544 {
	static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num = sc.nextInt();
		int sum = 0;
		
		if(num <=100) {
			for(int i = num; i<=100; i++) {
				sum += i;
			}
			System.out.println(sum);
		}
	}
}
