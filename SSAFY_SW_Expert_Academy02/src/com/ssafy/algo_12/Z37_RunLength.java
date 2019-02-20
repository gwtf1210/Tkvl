package com.ssafy.algo_12;

public class Z37_RunLength {

	private static String getRandomRedundantString() {
		int len = (int) (Math.random() * 40 + 20);
		int kindNum = (int) (Math.random() * 5 + 5);
		StringBuilder sb = new StringBuilder(len);

		sb.append((char) ((Math.random() * kindNum) + 'A'));
		for (int i = 1; i < len; i++) {
			if (Math.random() > 0.7)
				sb.append((char) ((Math.random() * kindNum) + 'A'));
			else 
				sb.append(sb.charAt(i-1));
		}
		
		return sb.toString();
	}
	
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
		String origin = getRandomRedundantString();
		
		System.out.println("origin : "+ origin);
		
		String encode = RLEncoding(origin);
		System.out.println("encode : " +encode);
		
		String decode = RLDecoding(encode);
		System.out.println("decode : " + decode);
	}
}
