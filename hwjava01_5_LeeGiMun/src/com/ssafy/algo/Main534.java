package com.ssafy.algo;

import java.util.Scanner;

public class Main534 {
	static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		char c = sc.next().charAt(0);
		String grade = "";
		
		switch(c) {
		case 'A':
			grade = "Excellent";
			break;
		case 'B':
			grade = "Good";
			break;
		case 'C':
			grade = "Usually";
			break;
		case 'D':
			grade = "Effort";
			break;
		case 'F':
			grade = "Failure";
			break;
		default:
			grade = "error";
		}
		System.out.println(grade);
	}
}
