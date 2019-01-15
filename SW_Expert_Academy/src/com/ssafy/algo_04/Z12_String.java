package com.ssafy.algo_04;

public class Z12_String {
	public static void main(String[] args) {
		String s1 = "서민규";
		String s2 = "서민규";
		String s3 = new String("서민규");
		String s4 = new String("서민규");
		
		// 변수 : 기본형, 참조형
		
		System.out.println(s1 == s2); // true 주소의 비교
		System.out.println(s3 == s4); // false
		// 내용물 비교
		System.out.println(s1.equals(s2)); // 내용물이 같은지 비교하는 메소드
		
	}

}
