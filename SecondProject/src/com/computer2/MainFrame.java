package com.computer2;

public class MainFrame extends Parts {
	int cpu;
	
	MainFrame(String maker, int price,int cpu){
		super(maker,price);
		this.cpu = cpu;
	}
	
	public void powerOn() {
		System.out.println("Call powerOn()");
	}
	
	public void powerOff() {
		System.out.println("Call powerOff()");
	}
	
	public String getMaker() {
		return maker;
	}

	public void info() {
		super.info();
		System.out.println("cpu : " + cpu);
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getCpu() {
		return cpu;
	}

	public void setCpu(int cpu) {
		this.cpu = cpu;
	}
}

