package com.basic;

public class PassTest2 {
	public static void main(String[] args) {

		int a = 88, b = 90;
		
		if(a > b)
			System.out.println("level1");
		else if(a < b)
			System.out.println("level2");
		else
			System.out.println("level3");
					
		System.out.println((a == b) ? "level3" : (a > b) ? "level1" : "level2");
		
		System.out.println((a>b)? "OK":"CANCEL");
		
	}
}
