package com.ssafy.algo;

import java.util.Scanner;

public class Main533 {
	static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		char sex = sc.next().charAt(0);
		int age = sc.nextInt();
		String category ="";
		
		if(sex == 'M') {
			if(age >= 18) {
				category = "MAN";
			}else {
				category = "BOY";
			}
		}else if(sex == 'F') {
			if(age >= 18) {
				category = "WOMAN";
			}else {
				category = "GIRL";
			}
		}
		System.out.println(category);
	}
}
