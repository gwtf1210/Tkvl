package com.abst;

public class ShapeUser {
	public static void main(String[] args) {
		Shape[] s = new Shape[5];
		s[0] = new Circle(5);
		s[1] = new Circle(5);
		s[2] = new Rect(5,7);
		s[3] = new Rect(11,5);
		s[4] = new Triangle(5,5,4,4);
		
		for (Shape x : s) {
			
			System.out.println(x.getClass().getName());
			System.out.println("면적: " + x.getArea());
			System.out.println("둘레: " + x.getCircum());
			System.out.println();
			
		}
	} // end of main
} // end of class
