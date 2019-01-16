package com.computer2;

public abstract class Parts {
	String maker;
	int price;
	
	public Parts(String maker, int price) {
		this.maker = maker;
		this.price = price;
	}
	
	public void info() {
		System.out.println("maker : " + maker);
		System.out.println("price : " + price);
	}
}
