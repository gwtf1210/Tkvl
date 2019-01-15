package com.object;

public class ShapeUser {

	public static void main(String[] args) {
		Circle c1 = new Circle(5.5);
		Circle c2 = new Circle(1010.2);
		
		Rect r1 = new Rect(1233,3213123);
		Rect r2 = new Rect(12412512,12515125);
		
		System.out.printf("c1 면적 : %3.3f \nc1 둘레 : %3.3f \n",c1.getArea(),c1.getCircum());
		System.out.printf("c2 면적 : %3.3f \nc2 둘레 : %3.3f \n",c2.getArea(),c2.getCircum());
		
		
	}

}
