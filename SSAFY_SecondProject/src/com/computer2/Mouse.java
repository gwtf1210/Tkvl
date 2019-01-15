package com.computer2;

public class Mouse extends Parts {
	private boolean wireless;
	
	Mouse(String maker, int price, boolean wireless){
		super(maker,price);
		this.wireless = wireless;
		
	}
	
	public void click() {
		System.out.println("Call click()");
	}
	
	public void scroll() {
		System.out.println("Call scroll()");
	}
	
	public void info() {
		super.info();
		System.out.println("wireless : " + wireless);
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
