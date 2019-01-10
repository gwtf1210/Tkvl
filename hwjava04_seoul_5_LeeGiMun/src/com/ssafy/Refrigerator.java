package com.ssafy;

public class Refrigerator {
	private int num;
	private String model;
	private int price;
	private int cnt;
	private String L;
	
	public Refrigerator(int num, String model, int price, int cnt, String l) {
		super();
		this.num = num;
		this.model = model;
		this.price = price;
		this.cnt = cnt;
		L = l;
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

	public String getL() {
		return L;
	}

	public void setL(String l) {
		L = l;
	}

	@Override
	public String toString() {
		return "Refrigerator [num=" + num + ", model=" + model + ", price=" + price + ", cnt=" + cnt + ", L=" + L + "]";
	}
}
