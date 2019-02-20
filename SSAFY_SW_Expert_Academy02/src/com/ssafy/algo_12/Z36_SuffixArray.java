package com.ssafy.algo_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.omg.CORBA.DynAnyPackage.Invalid;

class Pair {
	int index;
	String str;

	Pair(int index, String str) {
		this.index = index;
		this.str = str;
	}

}

public class Z36_SuffixArray {

	public static void main(String[] args) {
		String input = "banana$";
		List<Pair> S = new ArrayList<>();
		int[] LCP = new int[input.length()];
		int[] invalid = new int[input.length()];

		for (int i = 0; i < input.length(); i++) {
			String temp = "";
			for (int j = i; j < input.length(); j++) {
				temp += input.charAt(j);
			}
			S.add(new Pair(i + 1, temp));
			System.out.println(S.get(i).index + " " + S.get(i).str);
		}

		System.out.println("----------------------");

		Collections.sort(S, new Comparator<Pair>() {
			@Override
			public int compare(Pair o1, Pair o2) {
				return o1.str.compareTo(o2.str);
			}
		});

		for (int i = 0; i < S.size(); i++) {
			System.out.println(S.get(i).index + " " + S.get(i).str);
		}

		System.out.println("----------------------");

		for (int i = 1; i < S.size(); i++) { // List 접근 for문
			int cnt = 0;
			for (int j = 0; j < S.get(i - 1).str.length(); j++) { // List의 str을 하나하나 접근
				if (S.get(i).str.charAt(0) != S.get(i - 1).str.charAt(0)) {
					cnt = 0;
					break;
				}

				if (S.get(i).str.charAt(j) == S.get(i - 1).str.charAt(j)) {
					cnt++;
				}
			}
			LCP[i] = cnt;
		}
		System.out.println("LCP : " + Arrays.toString(LCP));

		System.out.println("----------------------");
//		for (int i = 1; i < S.size(); i++) { // List 접근 for문
//			int cnt = 0;
//			for (int j = 0; j < S.get(i - 1).str.length(); j++) { // List의 str을 하나하나 접근
//				if (S.get(i).str.charAt(0) != S.get(i - 1).str.charAt(0)) {
//					cnt = 0;
//					break;
//				}
//
//				if (S.get(i).str.charAt(j) == S.get(i - 1).str.charAt(j)) {
//					cnt++;
//				}
//			}
//			cnt = S.get(i).str.length() - cnt - 1;
//			invalid[i] = cnt;
//		}

		for (int i = 0; i < invalid.length; i++) {
			invalid[i] = (S.get(i).str.length()-1)- LCP[i];
		}
		System.out.println("Invalid : " + Arrays.toString(invalid));
	}
}
