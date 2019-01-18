package com.compare;

import java.util.ArrayList;
import java.util.Collections;

public class WriterTest {
	public static void main(String[] args) {
		ArrayList<Writer> list = new ArrayList<>();
		
		list.add(new Writer(50,"anne", "aolly", "aell, java"));
		list.add(new Writer(30,"bnne", "bolly", "felo, java"));
		list.add(new Writer(68,"cnne", "colly", "clo, java"));
		list.add(new Writer(20,"dnne", "dolly", "zllo, java"));
		list.add(new Writer(10,"enne", "bolly", "eel, java"));
		list.add(new Writer(40,"qnne", "nolly", "deo, java"));
		
		Collections.sort(list); // Comparable 객체만 sort() 사용 가능
		
		for(Writer w : list) {
			System.out.println(w);
		}
		
		System.out.println();
		Collections.sort(list, new WriterFirstNameComparator());
		for(Writer w : list) {
			System.out.println(w);
		}
		
		System.out.println();
		Collections.sort(list, new WriterBookTitleComparator());
		for(Writer w : list) {
			System.out.println(w);
		}
		
		String x = "a", y = "b";
		int result = y.compareTo(x);
		System.out.println(result);
	}
}
