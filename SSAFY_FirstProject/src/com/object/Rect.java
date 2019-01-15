package com.object;

public class Rect {
	double width;
	double height;
	
	Rect(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width*height;
	}
	
	public double getCircum() {
		return 2*(width+height);
	}
	
}
