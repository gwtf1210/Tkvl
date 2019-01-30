package com.inner;

public class Outer { // top-level class, outer class
	static int num = 90;
	
	static class Inner{// inner class, static class
		public void go() {
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) { 
		Inner i = new Inner();
		i.go();
		System.out.println(i.getClass().getName());
		
	}
}
