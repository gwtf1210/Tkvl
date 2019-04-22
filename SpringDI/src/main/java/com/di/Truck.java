package com.di;

public class Truck {
	int num;
	String color;

	public Truck(int num) {
		this.num = num;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void run() {
		System.out.println(color + "truck is running...." + num);
	}
}
