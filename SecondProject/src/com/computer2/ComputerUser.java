package com.computer2;

public class ComputerUser {

	public static void main(String[] args) {
		MyComputer computer = new MyComputer();
		computer.init();
		computer.info();
		
		computer.powerOn();
		computer.powerOff();
		computer.doJob();
		
		
	}

}
