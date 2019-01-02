package com.ssafy.algo;

import java.util.Scanner;

public class Main546 {
	static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		  int num, i, score;
		     float avg = 0;
		     num = sc.nextInt();
		     for(i=0;i<num;i++) {
		         score = sc.nextInt();
		         avg += score;
		     }
		     avg /= (float)i;
		     System.out.printf("avg : %.1f\n", avg);
		     if(avg >= 80) System.out.println("pass");
		     else System.out.println("fail");
		 }
}