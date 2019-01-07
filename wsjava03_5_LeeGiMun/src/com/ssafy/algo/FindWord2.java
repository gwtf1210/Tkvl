package com.ssafy.algo;

import java.util.Arrays;
import java.util.Scanner;

public class FindWord2 {
	static char[][] board = {
			{'e', '*', 'l', '*', 'e', 'e', '*', '*'}, 
			{'*', 'h', '*', '*', 't', 'r', 'u', 'm'},
			{'l', '*', 'o', '*', '*', '*', 't', '*'},
			{'*', '*', '*', 'a', '*', '*', 'p', '*'},
			{'a', 's', '*', '*', 'e', '*', 't', 'a'},
			{'t', 'k', '*', 'r', '*', 'o', 'g', 'g'}
	};
	//                     ¿øÁ¡    »ó       ÇÏ      ÁÂ      ¿ì       »óÁÂ       »ó¿ì     ÇÏÁÂ      ÇÏ¿ì 
	static int[] check_x = {0, -1,  1,  0,  0,  -1,   -1,   1,   1};
	static int[] check_y = {0 , 0,  0, -1,  1,  -1,    1,  -1,   1};
	
	private static boolean inRange(int x, int y) {
		if(x < board.length && x >= 0 && y < board[0].length && y >= 0) 
			return true;
		else 
			return false;
	}
	
	private static boolean findWord(int x, int y, String word) {
		char[][] tmp = new char[board.length][board[0].length];
		int cnt = 0;
		
		for(int i=0; i < board.length; i++)
			for(int j=0; j < board[i].length; j++)
				tmp[i][j] = board[i][j];
		
		for(int c = 0; c < word.length(); c++) {
			for(int k=0; k < check_x.length; k++) {
				int nx = x + check_x[k];
				int ny = y + check_y[k];
			
				if(inRange(nx, ny)) {
					if(tmp[nx][ny] == '*') continue;
					if(tmp[nx][ny] == word.charAt(c)) {
						tmp[nx][ny] = '*';
						cnt++;
						break;
					}
				}
			}
		}
		
		if(cnt >= word.length()) return true;
		
		return false;
	}
	
	public static void main(String[] args) {	
      	System.out.println(findWord(1,1,"hello"));//true
		System.out.println(findWord(1,4,"tree"));//true
		System.out.println(findWord(5,0,"task"));//true
		System.out.println(findWord(4,4,"ear"));//true
		System.out.println(findWord(2,6,"trump"));//true
		System.out.println(findWord(5,6,"goat"));//true
	}
}
