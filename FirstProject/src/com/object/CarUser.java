package com.object;

public class CarUser {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.num = 1234;
		c1.model = "avante";
		c1.owner = "jane";
		
		c1.run();
		c1.stop();
		c1.info();
	}
}
