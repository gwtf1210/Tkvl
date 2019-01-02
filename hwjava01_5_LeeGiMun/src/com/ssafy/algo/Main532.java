package com.ssafy.algo;

import java.util.Scanner;

public class Main532 {
	static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		String grade = "";
		
		if(num1 >= 4.0 && num2 >= 4.0) {
			grade = "A";
		}else if(num1 >= 3.0 && num2 >= 3.0) {
			grade = "B";
		}else {
			grade = "C";
		}
		System.out.println(grade);
	}

}

