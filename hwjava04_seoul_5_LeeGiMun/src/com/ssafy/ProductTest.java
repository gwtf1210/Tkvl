package com.ssafy;

public class ProductTest {
	public static void main(String[] args) {
		Refrigerator refrigerator = new Refrigerator(11, "LG ≥√¿Â∞Ì", 400, 4, "120L");
		TV tv = new TV(15, "Samsung TV", 100, 51, 100, "QLED");
		
		System.out.println(refrigerator.toString());
		System.out.println(tv.toString());
	}
	
}
