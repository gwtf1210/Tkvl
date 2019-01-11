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
				System.out.println("중복된 데이터가 있습니다.");
				return;
			}
		}
		cars[index++] = c;
		System.out.println("Car 정보를 추가했습니다.");
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
				System.out.println("업데이트 됐습니다.");
				return;
			}
		}
		System.out.println("찾으시면 번호가 없습니다.");
	}
	
	public void delete(String num) {
		int tmp_n = 0;
		
		for (int i = 0; i < index; i++) {
			if(cars[i].getNum().equals(num)) {
				cars[i] = null;
				System.out.println("삭제 됐습니다.");
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
		else System.out.println("찾으시는 번호가 없습니다.");
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
