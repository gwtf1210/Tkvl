package com.object;

public class ShapeUser {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		Rect r1 = new Rect();
		Rect r2 = new Rect();
		
		c1.r = 5.4;
		c2.r = 10.2;
		
		System.out.printf("c1 면적 : %3.3f \nc1 둘레 : %3.3f \n",c1.getArea(),c1.getCircum());
		System.out.printf("c2 면적 : %3.3f \nc2 둘레 : %3.3f \n",c2.getArea(),c2.getCircum());
		
		
	}

}
