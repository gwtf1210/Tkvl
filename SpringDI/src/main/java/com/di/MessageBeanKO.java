package com.di;

public class MessageBeanKO implements MessageBean {
	Truck truck;

	String num;
	String name;

	public MessageBeanKO() {
		System.out.println("MessageBeanKO 생성자");
	}
	
	@Override
	public void sayHello() {
		System.out.println("안녕하세요?" + num);
		System.out.println("안녕하세요?" + name);
		truck.run();
	}

	// setter 주입
	public void setNum(String num) {
		this.num = num;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTruck(Truck truck) {
		this.truck = truck;
	}
}
