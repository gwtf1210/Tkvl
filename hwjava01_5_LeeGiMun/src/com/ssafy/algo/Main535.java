package com.ssafy.algo;

import java.util.Scanner;

public class Main535 {
	static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		double score = sc.nextDouble();
		String grade = "";
		
		if(score >= 0 && score <= 4.5) {
			switch((int)score) {
			case 4:
				grade = "scholarship";
				break;
			case 3:
				grade = "next semester";
				break;
			case 2:
				grade = "seasonal semester";
				break;
			default:
				grade = "retake";
				break;
			}
			System.out.println(grade);
		}
	}
}
