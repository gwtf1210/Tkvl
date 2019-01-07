package com.ssafy.algo;

class FindWord{ 
	static char[][] board = {
			{' ', 'h',' ', ' ', ' ', 'a'},
	
			{' ', ' ','e', 'a', 'r', 'r'},
		
			{'b', 'm','a', 'l', ' ', 'e'},
	
	        {' ', ' ',' ', ' ', 'l', 'p'},
	
			{' ', ' ',' ', ' ', ' ', 'o'},
	};
	
	private static boolean findWord(int x, int y, String word) {
		
		return false;
	}
	
	public static void main(String[] args) {	
      	System.out.println(findWord(0,1,"hello")); //true
		System.out.println(findWord(2,3,"lamb")); //true
		System.out.println(findWord(2,1,"male")); //true
		System.out.println(findWord(2,5,"eraa")); //true
	}
}