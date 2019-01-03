package com.ssafy.algo;

import java.util.Arrays;
import java.util.Scanner;

public class DigitTest1 {
	static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String[] input_tmp = sc.nextLine().split(" ");
		int[] input = new int[input_tmp.length-1];
		int[] cnt = new int[10];
		int index;
		
		for(int i = 0 ; i<input.length; i++) {
			input[i] = Integer.parseInt(input_tmp[i]);
		}
		Arrays.sort(input);
		
		for(int number : input) {
			if(number < 10) {
				index = number/10;
				cnt[index] += 1;
			}
			else {
				index = number/10;
				cnt[index] += 1;
			}
		}
		
		for(int i=0;i<cnt.length;i++) {
			if(cnt[i]==0) continue;
			System.out.println(i + " : " + cnt[i]+"°³");
		}
	}
}
