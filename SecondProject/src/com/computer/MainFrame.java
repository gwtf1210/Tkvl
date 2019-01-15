package com.computer;

public class MainFrame {
	private String maker;
	int cpu;
	
	MainFrame(String maker, int cpu){
		this.maker = maker;
		this.cpu = cpu;
	}
	
	public void powerOn() {
		System.out.println("Call powerOn()");
	}
	
	public void powerOff() {
		System.out.println("Call powerOff()");
	}
	
	public void info() {
		System.out.println("[MainFrame] maker : " + maker + " / cpu : " + cpu);
	}

	public String getMaker() {
		return maker;
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

