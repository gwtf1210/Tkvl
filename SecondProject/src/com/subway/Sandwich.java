package com.subway;

public class Sandwich {
	private int snum;
	private String name, sauce, calory, price, size, exp, weight;
	
	public Sandwich(int snum, String name, String sauce, String calory, String price, String size,
			String exp, String weight) {
		super();
		this.snum = snum;
		this.name = name;
		this.sauce = sauce;
		this.calory = calory;
		this.price = price;
		this.size = size;
		this.exp = exp;
		this.weight = weight;
	}

	
	public void make() {
		System.out.println("\n샌드위치 만드는 중");
	}
	
	@Override
	public String toString() {
		return snum + " | " + name + " | " +  sauce + " | " + calory + " | " + price + " | " + size + " | " + exp + " | " + weight;  
	}

	public int getSnum() {
		return snum;
	}

	public void setSnum(int snum) {
		this.snum = snum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public String getCalory() {
		return calory;
	}

	public void setCalory(String calory) {
		this.calory = calory;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

}
