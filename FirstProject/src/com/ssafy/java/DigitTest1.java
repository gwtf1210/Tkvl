package com.ssafy.java;

public class DigitTest1 {
	public static void main(String[] args) {
		int k = 0;
		
		for(int i = 1; i <= 5; i++) {
			for(int j=1; j<=5; j++) {
				if(i>j) 
					System.out.print("   ");	
				else { 
					System.out.print((++k));
					if(k<10) 
						System.out.print("  ");
					else 
						
						System.out.print(" ");
				}
			}
			System.out.println("");
			System.out.println("");
		}
	}
}
