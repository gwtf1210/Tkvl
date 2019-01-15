package com.basic;

public class SwitchTest2 {
	public static void main(String[] args) {
		char c = 'a';
		
		switch(c) {
		case 'A' :
		case 'a' :
			System.out.println("level1");
			break;
		case 'B' :
		case 'b' :
			System.out.println("level2");
			break;
		case 'C' :
		case 'c' :
			System.out.println("level3");
			break;
			
		default :
			System.out.println("no level");
			break;
		
		}
		
	}
}
