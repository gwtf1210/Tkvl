package com.inherit;

public class ChildTest {
	public static void main(String[] args) {
		Child c1 = new Child();
		Parent c2;
		GrandParent c3;
		
		c2 = c1;
		c3 = c1; // 레퍼런스 타입은 GrandParent, 실제 저장된 객체는 Child
		Child x= (Child)c3; // 실제 저장되어 있는 객체가 작은 타입이므로 작은 타입으로 형변환 가능
		x.printName();
		
		GrandParent y = new GrandParent();
		Child x2 = (Child)y;
		x2.printName();
		
		
	}
}
