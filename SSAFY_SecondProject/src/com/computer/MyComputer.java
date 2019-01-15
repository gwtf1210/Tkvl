package com.computer;

public class MyComputer {
	Keyboard keyboard;
	Monitor monitor;
	MainFrame mainframe;
	Mouse mouse;
	
	public void init(){
		keyboard = new Keyboard("해피해킹 프로2 type-s","꺄");
		
		monitor = new Monitor("BenQ",28);
		mainframe = new MainFrame("LG", 8888);
		mouse = new Mouse("LG");		
	}
	
	public void powerOn() {
		mainframe.powerOn();
		monitor.powerOn();
	}
	
	public void doJob() {
		keyboard.keyType();
		mouse.click();
		mouse.scroll();
	}
	
	public void powerOff() {
		mainframe.powerOff();
		monitor.powerOff();
	}

	public void info() {
			keyboard.info();
			monitor.info();
			mainframe.info();
			mouse.info();
	}
}
