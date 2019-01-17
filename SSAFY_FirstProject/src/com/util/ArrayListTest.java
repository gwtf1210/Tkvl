package com.util;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListTest {
	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		
		ArrayList<Integer> scores = new ArrayList<>();
		
		scores.add(100);
		scores.add(90);
		scores.add(45);
		scores.add(64);
		scores.add(170);
		
		for (Integer i : scores) {
			System.out.println(i);
		}
	}
}
 	