package com.ssafy.algo;

import java.util.Scanner;

public class Main531 {
	static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Double weight = sc.nextDouble();
		String weight_class ="";
		
		if(weight <= 50.80) {
			weight_class = "Flyweight";
		}else if(weight <= 61.23) {
			weight_class = "Lightweight";
		}else if(weight <= 72.57) {
			weight_class = "Middleweight";
		}else if(weight <= 88.45) {
			weight_class = "Cruiserweight";
		}else if(weight > 88.45) {
			weight_class = "Heavyweight";
		}
		
		System.out.println(weight_class);

	}
}
