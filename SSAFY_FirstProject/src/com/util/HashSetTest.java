package com.util;

import java.util.Iterator;
import java.util.TreeSet;

public class HashSetTest {
	public static void main(String[] args) {
//		HashSet<String> set = new HashSet<>();
		TreeSet<String> set = new TreeSet<>();
		
		set.add("red");
		set.add("yellow");
		set.add("blue");
		set.add("red");
		set.add("white");
		
		for(String color : set) {
			System.out.println(color);
		}
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String color = it.next();
			System.out.println(color);
		}
		
		
	}
}
