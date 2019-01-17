package com.inter;

public class IShapeTest {
	ICircleMaker maker;
	
	IShapeTest(){
		maker = new ICircleMaker();
	}
	
	public static void main(String[] args) {
		IShapeTest is = new IShapeTest();
		is.test();
	}
	
	private void test() {
		IShape c = maker.makeIcircle(); // 다른 객체에서 생성해서 옮겨옴
		System.out.println(c.getArea());
		System.out.println(c.getCircum());
		
	}
}
