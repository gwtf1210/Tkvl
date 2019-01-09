package com.ssafy;

public class Refrigerator {
	int num;
	String model;
	int price;
	int cnt;
	String L;
	
	public Refrigerator(int num, String model, int price, int cnt, String l) {
		super();
		this.num = num;
		this.model = model;
		this.price = price;
		this.cnt = cnt;
		L = l;
	}
	
	@Override
	public String toString() {
		return "Refrigerator [num=" + num + ", model=" + model + ", price=" + price + ", cnt=" + cnt + ", L=" + L + "]";
	}
}
