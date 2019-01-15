package com.computer;

public class Monitor {
	private String maker;
	private double size;
	
	Monitor(String maker, double size){
		this.maker = maker;
		this.size = size; 
	}
	
	public void powerOn() {
		System.out.println("Call powerOn()");
	}
	
	public void powerOff() {
		System.out.println("Call powerOff()");
	}
	
	public void info() {
		System.out.println("[Monitor] maker : " + maker + " / size : " + size);
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
