package com.ssafy.algo_12;

import java.util.Arrays;

/**
 * String 
 */
public class Z35_Solution_1213_Prof {
	public static void main(String[] args) {
		String s = "XaaaaaXXaaaXaaX"+"$";
		String[] arr = s.split("X"); // �ǵڿ� ���� "X"�� ������ �������� "" �� ���ڿ��� �� �����. 
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length-1);
		
	}
}
