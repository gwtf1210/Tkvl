package com.inherit;
// �θ� Ŭ����, super class, base class, parent class

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
//		System.out.println("Parent �������Դϴ�.");
	}
	
	public void printName() {
		System.out.println(name);
	}
	
	public void printAddress() 
	{
		System.out.println(address);
	}
}

// �ڽ� Ŭ����, sub class, derived class, child class 
public class Child extends Parent {
	
	int age = 25;
	
	Child(){
//		System.out.println("Child �������Դϴ�.");
	}
	
	public void callSuper() {
		super.printName();
	}
	
	// Method overriding : �θ����׼� ���� ���� �޼ҵ带 �ڽ� Ŭ������ �°� �����ϴ� ��
	// --> ��� Overriding�� �޼ҵ尡 �����
	// Method �̸�, ����Ÿ��, �Ķ���� Ÿ�� ��� �����ؾ���
	// ���������ڴ� �θ��� �����ڿ� ���ų� ū �͸� ������
	// @annotation : ���α׷��� ���� �����̳� ���� ���� ���� ��Ÿ��
	@Override
	public void printName() {
		System.out.println("Tomson");
	}
	
	public static void main(String[] args) {
		// ��� ���谡 �����ϴ� �ڽ� ��ü�� �����ϸ� �޸𸮿� �θ� ��ü�� ���� �������
//		Child c = new Child();
//		Parent c = new Child(); // ������(������ ��ü�� ����Ű�� ���۷���(����)�� Ÿ���� ���������� ���)
		GrandParent c = new Child();
		
		c.printName(); // ������ �� �ڽ� �޼ҵ� ȣ��
//		c.printAddress();
		// c.callSuper(); // �ڽİŶ� ȣ�� �Ұ�
		// super.printName(); // super, this --> Static �޼ҵ� �ȿ����� ���ȵ�
		
//		c.address = "la";
//		c.printAddress();
	}
}
