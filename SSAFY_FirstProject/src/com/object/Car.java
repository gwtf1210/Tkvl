package com.object;

public class Car {
	// field : data
	int num; 
	String model;
	String owner;
	
	//constructor:객체가 생성될 때 자동 호출되는 메소드
	// 1. 클래스 이름과 메소드 이름이 동일해야함
	// 2. 리턴 타입은 적지않음
	Car(){
		//System.out.println("Car 생성자");
		this(0); // this():생성자안에서 사용되면서 다른 생성자 호출함, 0이기 때문에 파라미터 하나만 받는 Car(int num)으로 감
	}

	Car(int num){
		// this.num = num;
		this(num, "xyx");
	}
	
	Car(int num, String model){
		//this.num = num;
		//this.model = model;
		this(num, model, "anonymous");
		
	}

	Car(int num, String model, String owner){
		this.num = num;
		this.model = model;
		this.owner = owner;
	}
	
	
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
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(18);
		Car c3 = new Car(2, "gg");
		Car c4 = new Car(3, "zz", "ll");
		
		c1.info();
		c2.info();
		c3.info();	
		c4.info();
	}
	
	
}
