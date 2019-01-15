package com.subway;

public class Order {
	public static void main(String[] args) {
		// 에그마요 주문
		Sandwich sw1 = new EggMayo(1, "에그마요","","360kcal","16000원","Large","JMT 입니다.", "50kg"); 
		Sandwich sw2 = new BLT(2, "BLT","","600kcal","10300원","Large","별로 맛 없습니다..", "150kg"); 
		Sandwich sw3 = new Meatball(3, "미트볼","","500kcal","14000원","Small","규레이이이잇! 들기 무겁습니다.", "350kg"); 
		
		
		sw1.make();
		sw2.make();
		sw3.make();
	}
}
