package com.abst;

public class Circle extends Shape{
	int r;
	
	
	
	public Circle(int r) {
		this.r = r;
	}
	
	@Override
	public double getArea() {
		return Math.PI * r * r;
	}

	@Override
	public double getCircum() {
		// TODO Auto-generated method stub
		return 2 * Math.PI *r;
	}
}
