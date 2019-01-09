package com.ssafy;

public class TV {
	int num;
	String model;
	int price;
	int cnt;
	int size;
	String type;
	
	public TV(int num, String model, int price, int cnt, int size, String type) {
		super();
		this.num = num;
		this.model = model;
		this.price = price;
		this.cnt = cnt;
		this.size = size;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "TV [num=" + num + ", model=" + model + ", price=" + price + ", cnt=" + cnt + ", size=" + size
				+ ", type=" + type + "]";
	}
	
	
}
