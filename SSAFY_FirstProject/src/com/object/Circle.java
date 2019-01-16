package com.object;

public class Circle {
	double r;
//	final double PI = 3.14;
	
	Circle(double r){
		this.r = r;
	}
	
	public double getArea() {
		return Math.PI*r*r;
	}
	
	public double getCircum() {
		return 2*r*Math.PI;
	}
}
