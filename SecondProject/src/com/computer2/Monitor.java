package com.computer2;

public class Monitor extends Parts {
	private double size;
	
	Monitor(String maker, double size, int price){
		super(maker,price);
		this.size = size;
	}
	
	public void powerOn() {
		System.out.println("Call powerOn()");
	}
	
	public void powerOff() {
		System.out.println("Call powerOff()");
	}
	
	public void info() {
		super.info();
		System.out.println("size : " + size);
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
}
