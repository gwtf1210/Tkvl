package com.basic;

public class HelloWorld {

	public static void main(String[] args) { 
		// comment : 설명
		/*
		 * 여러줄 주석
		 * Ctrl + Alt + 방향키 아래 -> 줄 복사
		 * sysout + Ctrl + Space -> System.out.println();
		 * 커서 + Alt + 방향키 위,아래 -> 줄 이동
		 * 커서 + Ctrl + D -> 줄 삭제
		 */
		
		/* data type>>
		 * 1) primitive type 기본형
		 *     1. 논리형 : boolean(참, 거짓)
		 *     2. 숫자형 
		 *         a. 정수형 (byte(1), short(2), int(4)***, long(8), char(2))
		 *         b. 실수형 (float(4), double(8)***)
		 *         
		 * 2) reference type 참조형
		 *     - class(String), interface, array, enum... 
		 */
		String name = "Ricky";
		System.out.println("Hello, " + name);
		System.out.println("i'll ace this exam");
		System.out.println("What did you do last night?");
				
	}
}