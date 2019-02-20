package com.ssafy.algo_12;

public class Z37_RunLength {

	static String RLEncoding(String input) {
		String output = "";

		for (int i = 0; i < input.length(); i++) {
			int count = 1;
			char cur = input.charAt(i);
			char next = '\0';
			output += cur;
			for (int j = i + 1; j < input.length(); j++) {
				next = input.charAt(j);
				if (cur == next) {
					count++;
				} else {
					break;
				}
			}
			output += count;
			i += (count - 1);
		}
		return output;
	}

	static String RLDecoding(String input) {
		String output = "";

		for (int i = 0; i < input.length(); i++) {
			char letter = '\0';
			char cur = input.charAt(i);

			if (Character.isLetter(cur)) {
				letter = cur;
				int index = i + 1;
				String digit = "";

				while (!Character.isLetter(input.charAt(index))) {
					digit += input.charAt(index);
					index++;
					if (index >= input.length() - 1) {
						break;
					}
				}

				int cnt = Integer.parseInt(digit);

				for (int j = 0; j < cnt; j++) {
					output += letter;
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String origin = "ABBBBBBBBBBBBBBBBBBBDDDDDDDDDDDEEEEEEEECC";
		System.out.println("origin : "+ origin);
		
		String encode = RLEncoding(origin);
		System.out.println("encode : " +encode);
		
		String decode = RLDecoding(encode);
		System.out.println("decode : " + decode);
	}
}
