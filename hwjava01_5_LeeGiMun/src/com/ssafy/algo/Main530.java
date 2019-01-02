package com.ssafy.algo;

import java.util.Scanner;

public class Main530 {
	static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int age = sc.nextInt();
		
		if(age > 20) {
			System.out.println("adult");
		}else {
			System.out.println((20-age) + " years later");
		}
	}
}
