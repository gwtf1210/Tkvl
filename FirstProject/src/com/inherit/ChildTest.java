package com.inherit;

public class ChildTest {
	public static void main(String[] args) {
		Child c1 = new Child();
		Parent c2;
		GrandParent c3;
		
		c2 = c1;
		c3 = c1; // ���۷��� Ÿ���� GrandParent, ���� ����� ��ü�� Child
		Child x= (Child)c3; // ���� ����Ǿ� �ִ� ��ü�� ���� Ÿ���̹Ƿ� ���� Ÿ������ ����ȯ ����
		x.printName();
		
		GrandParent y = new GrandParent();
		Child x2 = (Child)y;
		x2.printName();
		
		
	}
}
