package com.ssafy.algo_12;

public class Z34_Practice3 {

	public static boolean isPalindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "CBBCBAAB";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			for (int j = s.length() - 1; j > i; j--) {
				if (c == s.charAt(j)) {
					String tmp = s.substring(i, j + 1);
					if (isPalindrome(tmp))
						System.out.println(tmp);
				}
			}
		}
	}

}
