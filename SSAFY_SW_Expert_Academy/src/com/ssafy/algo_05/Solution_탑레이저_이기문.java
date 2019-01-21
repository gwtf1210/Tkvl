package com.ssafy.algo_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_ž������_�̱⹮ {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		for (int n = 1; n <= tc; n++) {
			int cnt = Integer.parseInt(br.readLine());
			
			String[] stack = br.readLine().split(" ");
			int[] Answer = new int[cnt];
			
			for (int i = cnt-1; i >= 1; i--) {
				int num2 = Integer.parseInt(stack[i]); // ���粨
				int num1 = Integer.parseInt(stack[i-1]); // ����
				
				if(num1 > num2) {
					Answer[i] = (i-1)+1;
				}else{
					int top = i-2;
					while(top > -1 && (Integer.parseInt((stack[top])) < num2)) { // ū ���� ���������� pop
						top--;
					}
					Answer[i] = top+1;
					}
				}
			System.out.print("#" + n);
			for (int i = 0; i < Answer.length; i++) {
				System.out.print(" " + Answer[i]);
			}
			System.out.println();
		}
	}
}
