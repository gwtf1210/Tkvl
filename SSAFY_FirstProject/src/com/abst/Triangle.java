package com.abst;

public class Triangle extends Shape{
	int a, b, bottom, height;
	
	public Triangle(int a, int b, int bottom, int height) {
		this.a = a;
		this.b = b;
		this.bottom = bottom;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return bottom * height / 2 ;
	}

	@Override
	public double getCircum() {
		// TODO Auto-generated method stub
		return a + b + bottom;
	}

}
