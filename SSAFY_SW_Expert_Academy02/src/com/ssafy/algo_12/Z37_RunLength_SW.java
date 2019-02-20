package com.ssafy.algo_12;

import java.util.Arrays;

public class Z37_RunLength_SW {

	public static void main(String[] args) {
		char[] ch = { 'A', 'B', 'B', 'B', 'B', 'B', 'C', 'C' };
		char[] output = RLEncoding(ch);
		System.out.println(Arrays.toString(output));
		char[] rld = RLDecoding(output);
		System.out.println(Arrays.toString(rld));
	}

	public static char[] RLEncoding(char[] input) {
		int count = 1;
		char prev = '\0';
		int idx = 0;
		char[] output = new char[input.length];
		Arrays.fill(output, '\0');
		int MaxCount = input.length;
		char cur = 0;
		for (char c : input) {
			cur = c;
			if (prev == cur && count < MaxCount)
				count++;
			else if (prev != '\0') {
				output[idx++] = prev;
				output[idx++] = (char) ('0' + count);
				count = 1;
			}
			prev = cur;
		}

		output[idx++] = cur;
		output[idx++] = (char) ('0' + count);
		return output;
	} // end of encoding

	public static char[] RLDecoding(char[] input) {
		char[] output = new char[input.length];
		char cur = 0;
		int count = 0;
		int idx = 0;
		for (int i = 0; i < output.length; i += 2) {
			cur = input[i];
			count = input[i + 1] - '0';

			while (count > 0) {
				output[idx++] = cur;
				count--;
			}
		}
		return output;
	}
}
