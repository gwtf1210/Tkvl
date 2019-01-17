package com.util;

import java.util.Vector;

import com.object.Circle;

public class VectorTest {
	public static void main(String[] args) {
		
		// GENERIC PROGRAMMiNG 방식으로 생성
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
		v2.clear(); // 모든 데이터 삭제		
		
		
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
			System.out.println("면적 : " + c.getArea());
			System.out.println("둘레 : " + c.getCircum());
			System.out.println();
		}
		
//		Vector v1 = new Vector(2); // 첫 생성 default 10 -> 초과시 -> 2배씩 들려서 이사시킴
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
//		for (int i = 0; i < v1.size(); i++) { // size(), Vector안에 존재하는 데이터의 size를 반환함
//			System.out.println(v1.get(i));
//		}
		
		
		
		
		
	}
}
