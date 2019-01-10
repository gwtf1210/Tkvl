package com.ssafy;

public class TV {
	private int num;
	private String model;
	private int price;
	private int cnt;
	private int size;
	private String type;
	
	public TV(int num, String model, int price, int cnt, int size, String type) {
		super();
		this.num = num;
		this.model = model;
		this.price = price;
		this.cnt = cnt;
		this.size = size;
		this.type = type;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "TV [num=" + num + ", model=" + model + ", price=" + price + ", cnt=" + cnt + ", size=" + size
				+ ", type=" + type + "]";
	}
	
	
}
