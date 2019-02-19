package com.ssafy.algo_12;

import java.util.Arrays;

/**
 * String 
 */
public class Z35_Solution_1213_Prof {
	public static void main(String[] args) {
		String s = "XaaaaaXXaaaXaaX"+"$";
		String[] arr = s.split("X"); // 맨뒤에 패턴 "X"가 나오면 마지막은 "" 빈 문자열이 안 생긴다. 
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length-1);
		
	}
}
