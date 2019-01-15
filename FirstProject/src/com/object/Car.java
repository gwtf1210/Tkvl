package com.object;

public class Car {
	// field : data
	int num; 
	String model;
	String owner;
	
	//constructor:��ü�� ������ �� �ڵ� ȣ��Ǵ� �޼ҵ�
	// 1. Ŭ���� �̸��� �޼ҵ� �̸��� �����ؾ���
	// 2. ���� Ÿ���� ��������
	Car(){
		//System.out.println("Car ������");
		this(0); // this():�����ھȿ��� ���Ǹ鼭 �ٸ� ������ ȣ����, 0�̱� ������ �Ķ���� �ϳ��� �޴� Car(int num)���� ��
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
