package com.ssafy;

public class CarMgr {
	private Car[] cars;
	private int index;
	
	CarMgr(){
		cars = new Car[100];
		index = 0;
	}
	
	public void add(Car c) {
		for (int i = 0; i < index; i++) {
			if(cars[i].getNum().equals(c.getNum())) {
				System.out.println("�ߺ��� �����Ͱ� �ֽ��ϴ�.");
				return;
			}
		}
		cars[index++] = c;
		System.out.println("Car ������ �߰��߽��ϴ�.");
	}
	
	public Car[] search() {
		return this.cars;
	}
	
	public Car search(String num) {
		for (int i = 0; i < index; i++) {
			if(cars[i].getNum().equals(num)) return cars[i];	
		}
		return null;
	}
	
	public Car[] search(int price) {
		Car[] tmp = new Car[index];

		for(int i=0; i< index; i++) {
			if(cars[i].getPrice() <= price)
				tmp[i] = cars[i];
		}
		return tmp;
	}
	
	public void update(String num, int price) {
		for (int i = 0; i < cars.length; i++) {
			if(cars[i].getNum().equals(num)) {
				cars[i].setPrice(price);
				System.out.println("������Ʈ �ƽ��ϴ�.");
				return;
			}
		}
		System.out.println("ã���ø� ��ȣ�� �����ϴ�.");
	}
	
	public void delete(String num) {
		int tmp_n = 0;
		
		for (int i = 0; i < index; i++) {
			if(cars[i].getNum().equals(num)) {
				cars[i] = null;
				System.out.println("���� �ƽ��ϴ�.");
				index--;
				tmp_n = i;
				break;
			}
		}
		
		if(tmp_n != 0) {
			for(int i=tmp_n; i<index-1;i++) {
				cars[i] = cars[i+1];
			}
		}
		else System.out.println("ã���ô� ��ȣ�� �����ϴ�.");
	}
	
	public int size() {
		return index;
	}
	
	public int totalPrice() {
		int sum = 0;
		
		for (int i = 0; i < index; i++)
			sum += cars[i].getPrice();

		return sum;
	}
}
