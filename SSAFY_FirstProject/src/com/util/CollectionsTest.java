package com.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
	public static void main(String[] args) {
		List fruits = new ArrayList();
//		fruits.add("apple");
//		fruits.add("orange");
//		fruits.add("banana");
		
		// 1. addAll
		Collections.addAll(fruits, "apple", "oranege", "banana");
		
		// 2. sort
		Collections.sort(fruits);
		System.out.println(fruits.toString());
		
		// 3. search
		Collections.sort(fruits);
		System.out.println(Collections.binarySearch(fruits, "banana"));
		System.out.println(Collections.binarySearch(fruits, "grape"));

		// 4. copy
		List list = new ArrayList();
		Collections.addAll(list,"one", "two", "three","four");
		Collections.copy(list,fruits);
		System.out.println(list.toString());
		
		// 5. fill
		Collections.fill(list, "filed with dummies");
		System.out.println(list.toString());
		
	}
}
