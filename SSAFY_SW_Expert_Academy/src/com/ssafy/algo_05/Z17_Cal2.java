package com.ssafy.algo_05;

import java.io.IOException;
import java.util.Scanner;

public class Z17_Cal2 {
	public static void main(String[] args) throws IOException {
		String tmp = "2 + 3 * 4 / 5";
		String[] input = tmp.split(" ");
		
		String[] stack = new String[20];
		int top = 0;
		String[] array = new String[20]; 
		int index = 0;
		
		for (int i = 0; i < input.length; i++) { 
			if(input[i].equals("*") || input[i].equals("/")) { // *, /
				if(stack[top] == null || stack[top].equals("+") || stack[top].equals("-")) {
					stack[top++] = input[i];	
				}
				else {
					 for (int j = top; j > -1; j--) { // 낮은 연산자 나올 때까지 pop()
						if(stack[j].equals("+") || stack[j].equals("-")) {
							top = j+1;
							stack[j+1] = input[i];
							break;
						}else {
							array[index++] = stack[j];
							top--;
							break;
						}
					} 
				}
			}else if(input[i].equals("+") || input[i].equals("-")){ // +. -
				stack[top++] = input[i];
			}else { // 피연산자
				array[index++] = input[i];
			}
		}
		
		for (int i = top-1; i > -1 ; i--) {
			array[index++] = stack[i];
		}
		
		for (int i = 0; i < index; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
