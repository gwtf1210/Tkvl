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
		IShape c = maker.makeIcircle(); // �ٸ� ��ü���� �����ؼ� �Űܿ�
		System.out.println(c.getArea());
		System.out.println(c.getCircum());
		
	}
}
