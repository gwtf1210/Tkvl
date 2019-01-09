package com.object;

public class Car {
	// field : data
	int num; 
	String model;
	String owner;
	
	public void run() {
		System.out.println("run method");
	}
	
	public void stop() {
		System.out.println("stop method");
	}
	
	public void info() {
		System.out.println("num : " + num);
		System.out.println("model : " + model);
		System.out.println("owner : " + owner);
	}
	
	
}
