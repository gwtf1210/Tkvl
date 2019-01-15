package com.computer2;

public class Keyboard extends Parts {
	private String type;
	
	Keyboard(String maker, int price, String type){
		super(maker,price);
		this.type = type;
	}
	
	public void keyType() {
		System.out.println("Call keyType()");
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public void info() {
		super.info();
		System.out.println("type : " + type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
