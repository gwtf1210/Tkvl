package com.basic;

public class OperatorTest {
	public static void main(String[] args) {
		boolean a = true, b = false, c = true;
		int x = 10, y = 3;
		
		System.out.println("result = " + (x + y));
		
		int result = x / y;
		System.out.println(result);
		result = x % y;
		System.out.println(result);
		
		if(a && b) // &, | 하나면 두 개 다 검사함
			System.out.println("a && b");
		if(a || c)
			System.out.println("a || b");
		
		int max = (x > y)? x:y;
		System.out.println(max);
	}
}
