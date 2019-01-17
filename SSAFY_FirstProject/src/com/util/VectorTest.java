package com.util;

import java.util.Vector;

import com.object.Circle;

public class VectorTest {
	public static void main(String[] args) {
		
		// GENERIC PROGRAMMiNG ������� ����
		Vector<String> v2 = new Vector<>(); 
		v2.add("spring");
		v2.add("summer");
		v2.add("winter");
		v2.add("spring");
		v2.add("fail");
		v2.add("winter");
//		v2.add(111); // error
		
		v2.remove(2);
		v2.add(1, "what");
		v2.clear(); // ��� ������ ����		
		
		
		for(String season : v2) {
			System.out.println(season);
		}
		System.out.println();
		
		Vector<Circle> v3 = new Vector<>();
		v3.add(new Circle(8));
		v3.add(new Circle(6));
		v3.add(new Circle(7));
		
		Vector<Integer> v4 = new Vector<>();
		
		v4.add(19);
		v4.add(23);
		v4.add(4);
		v4.add(25);
		
		for(int i : v4) {
			System.out.println(i);
		}
		
		for(Circle c : v3) {
			System.out.println("���� : " + c.getArea());
			System.out.println("�ѷ� : " + c.getCircum());
			System.out.println();
		}
		
//		Vector v1 = new Vector(2); // ù ���� default 10 -> �ʰ��� -> 2�辿 ����� �̻��Ŵ
//		System.out.println(v1.capacity());
//		
//		v1.add(12345);
//		v1.add(3);
//		v1.add("hello");
//		v1.add(true);
//		v1.add('x');
//		v1.add("hello");
//		
//
//		for (int i = 0; i < v1.size(); i++) { // size(), Vector�ȿ� �����ϴ� �������� size�� ��ȯ��
//			System.out.println(v1.get(i));
//		}
		
		
		
		
		
	}
}
