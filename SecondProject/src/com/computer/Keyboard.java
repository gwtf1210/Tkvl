package com.computer;

public class Keyboard {
	
	private String maker;
	private String type;
	
	Keyboard(String maker, String type){
		this.maker = maker;
		this.type = type;
	}
	
	public void keyType() {
		System.out.println("Call keyType()");
	}
	
	public void info() {
		System.out.println("[Keyboard] maker : " + maker + " / type : " + type);
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
