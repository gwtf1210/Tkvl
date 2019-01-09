package com.object;

public class Rect {
	double width;
	double height;
	
	public double getArea() {
		return width*height;
	}
	
	public double getCircum() {
		return 2*(width+height);
	}
	
}
