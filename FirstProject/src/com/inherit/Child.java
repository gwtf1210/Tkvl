package com.inherit;
// 부모 클래스, super class, base class, parent class

class GrandParent extends Object{
	String name = "Gimmy";
	
	public void printName() {
		System.out.println("name : " + name);
	}
}

class Parent extends GrandParent{
	String name = "Tom";
	String address = "Seoul";
	
	Parent(){
//		System.out.println("Parent 생성자입니다.");
	}
	
	public void printName() {
		System.out.println(name);
	}
	
	public void printAddress() 
	{
		System.out.println(address);
	}
}

// 자식 클래스, sub class, derived class, child class 
public class Child extends Parent {
	
	int age = 25;
	
	Child(){
//		System.out.println("Child 생성자입니다.");
	}
	
	public void callSuper() {
		super.printName();
	}
	
	// Method overriding : 부모한테서 물려 받은 메소드를 자식 클래스에 맞게 수정하는 일
	// --> 계속 Overriding된 메소드가 실행됨
	// Method 이름, 리턴타입, 파라미터 타입 모두 동일해야함
	// 접근지정자는 부모의 지정자와 같거나 큰 것만 가능함
	// @annotation : 프로그램에 대한 설명이나 설정 사항 등을 나타냄
	@Override
	public void printName() {
		System.out.println("Tomson");
	}
	
	public static void main(String[] args) {
		// 상속 관계가 존재하는 자식 객체를 생성하면 메모리에 부모 객체가 먼저 만들어짐
//		Child c = new Child();
//		Parent c = new Child(); // 다형성(생성된 객체를 가리키는 레퍼런스(변수)의 타입이 여러가지인 경우)
		GrandParent c = new Child();
		
		c.printName(); // 재정의 된 자식 메소드 호출
//		c.printAddress();
		// c.callSuper(); // 자식거라서 호출 불가
		// super.printName(); // super, this --> Static 메소드 안에서는 사용안됨
		
//		c.address = "la";
//		c.printAddress();
	}
}
