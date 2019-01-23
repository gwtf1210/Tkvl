package com.io;

import java.io.Serializable;

public class Car implements Serializable {
	int num;
	String color;
	int year;
	
	@Override
	public String toString() {
		return "Car [num=" + num + ", color=" + color + ", year=" + year + "]";
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
