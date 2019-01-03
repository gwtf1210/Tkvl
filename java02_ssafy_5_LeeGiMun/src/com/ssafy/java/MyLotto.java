package com.ssafy.java;

import java.util.Random;

public class MyLotto {
	static int[] num = new int[6];
	
	// 중복되지 않은 값 찾아서 반환
	public static int uniqueNumber(int index) {
		int imsi;
		boolean eq;

		Random ran = new Random();
		do {
			imsi = ran.nextInt(45)+1; // 임의의 값 생성
			eq = false;
			for(int j=0; j<index; j++) {
				if(imsi == num[j]) {
					eq=true;
					break;
				}
			}
		}while(eq);
		
		return imsi;
	}
	
	// 출력
	public static void print(){
		System.out.println("오늘의 행운의 숫자 !!!");
		for(int number : num) {
			System.out.print(number+"  ");
		}
	}

	public static void selectLotto() {
		for(int i=0; i<=5; i++) {
			num[i] = uniqueNumber(i);
		}
	}
	
	public static void main(String[] args) {
		selectLotto();
		print();
	}
}
