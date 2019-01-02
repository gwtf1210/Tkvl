package com.ssafy.algo;
import java.util.Scanner;

public class Main529 {
	static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int height = sc.nextInt();
		int weight = sc.nextInt();
		
		int bmi = weight + 100 - height;
		
		System.out.println(bmi);
		if(bmi>0) {
			System.out.println("Obesity");
		}
		
		
	}
}