package com.exception;

// runtime exception : ArrayIndexOutOfBoundsException
public class ArrayTest {
	public static void main(String[] args) {
		int[] score = {90, 45, 60, 80, 100};
		
		for (int i = 0; i <= score.length; i++) {
			try {
				System.out.println(score[i]);
			}catch (ArrayIndexOutOfBoundsException a){
				System.out.println("oops,,, sorry!!!");
				a.printStackTrace();
			}
			
		}
		System.out.println("done...");
	}
}


