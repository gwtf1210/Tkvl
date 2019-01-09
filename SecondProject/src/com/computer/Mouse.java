package com.computer;

public class Mouse {
	private String maker;
	private boolean wireless;
	
	Mouse(String maker){
		this.maker = maker;
	}
	
	public void click() {
		System.out.println("Call click()");
	}
	
	public void scroll() {
		System.out.println("Call scroll()");
	}
	
	public void info() {
		System.out.println("[Mouse] maker : " + maker + " / wireless : " + wireless);
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
}
