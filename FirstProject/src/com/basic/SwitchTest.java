package com.basic;

public class SwitchTest {
	public static void main(String[] args) {
		int score = 90;
		
		switch(score) {
		case 100 :
			System.out.println("level1");
			break;
		case 90 :
			System.out.println("level2");
			break;
		case 80 :
			System.out.println("level3");
			break;
		case 70 :
			System.out.println("level4");
			break;
			
		default :
			System.out.println("no level");
			break;
		
		}
		
	}
}
