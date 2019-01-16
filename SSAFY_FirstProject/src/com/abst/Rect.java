package com.abst;

public class Rect extends Shape{

	int bottom, height;
	
	public Rect(int bottom, int height) {
		this.bottom = bottom;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return bottom * height;
	}

	@Override
	public double getCircum() {
		// TODO Auto-generated method stub
		return bottom * height * 2;
	}
	
}
