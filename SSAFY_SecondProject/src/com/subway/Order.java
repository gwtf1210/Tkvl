package com.subway;

public class Order {
	public static void main(String[] args) {
		// ���׸��� �ֹ�
		Sandwich sw1 = new EggMayo(1, "���׸���","","360kcal","16000��","Large","JMT �Դϴ�.", "50kg"); 
		Sandwich sw2 = new BLT(2, "BLT","","600kcal","10300��","Large","���� �� �����ϴ�..", "150kg"); 
		Sandwich sw3 = new Meatball(3, "��Ʈ��","","500kcal","14000��","Small","�Է���������! ��� ���̽��ϴ�.", "350kg"); 
		
		
		sw1.make();
		sw2.make();
		sw3.make();
	}
}
