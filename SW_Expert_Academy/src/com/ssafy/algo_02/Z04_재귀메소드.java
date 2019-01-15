package com.ssafy.algo_02;

import java.util.Scanner;

// static 멤버는 non-static 멤버를 참조할 수 없다.
// static 멤버가 먼저 사용할 수 있고, : 클래스의 정보가 처음 로딩될때부터~ 프로그램 종료시까지
// non-static 멤버는 나중에 사용할 수 있다. : 객처 생성시점~ 참조변수가 없어질때까지

public class Z04_재귀메소드 {
// 반복문 : cpu의 연산만 사용, 메모리의 사용은 적다.
	
// 재귀함수 : 나 자신의 함수를 다시 호출하는 함수
// 반복문과 역할이 비슷하다 (반복)
// 속도가 느리다, CallStack 영역의 메모리를 많이 사용한다
// 꼭 재귀함수를 사용해야하는 경우만 쓰자
// 매개 변수를 최대한 아끼자.
	
	public static void a(int start, int end, int step) {
		if(start > end) { // 종료 파트
			System.out.println();
		}
		else { // 반복파트
			System.out.println(start);
			a(start + step, end, step); // 나의 함수를 다시 호출
		}
	}
	
	public static void b(int start, int end) {
		if(start > end) {
			System.out.println();
		}
		else {
			System.out.println(start);
			b(start +=2, end);
		}
	}
	
	public static void d(int start, int end, int step) {
		if(start > end) {
			System.out.println();
		}
		else {
			System.out.print(start + " ");
			d(start + step, end, step);
		}
	}
	
	static int sum = 0;
	public static void e(int start, int end) {
		if(start > end) {
			System.out.println("sum : " + sum);
		}
		else {
			sum += start;
			e(start+1, end);
		}
	}
	public static int f(int start, int end) {
		if(start == end) {
			return end;
		}else {
			return f(start+1,end) + start;
		}
	}
	
	public static void main(String[] args) {
		/*for (int i = 0; i < 4; i++) {
			System.out.println(i);
		}
		System.out.println();
		*/
		a(0, 4, 1);
		b(2, 8); // 2 4 6 8
		
		Scanner sc = new Scanner(System.in);
		d(sc.nextInt(),sc.nextInt(), sc.nextInt()); // 1. 사용자의 입력 start, end, step을 숫자로 받아서 반복문처럼 한줄에 출력하는 재귀함수 d 작성
		e(1, 3); // 2. 사용자의 입력 start, end 을 숫자로 받아서 start~end 까지의 합을 출력 재귀함수 e 작성
		System.out.println(f(1,100));
		
	} // end of main
} // end of class
