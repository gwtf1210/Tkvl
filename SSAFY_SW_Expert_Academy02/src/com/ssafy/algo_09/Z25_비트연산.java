package com.ssafy.algo_09;

public class Z25_비트연산 {
	public static void main(String[] args) {
//		int n = 123; // 10진수
//		int n = 0x12f; // 16진수	0X, 0x
//		int n = 0123; // 8진수	0
//		int n = 0b101; // 2진수	0b, 0B
		int n = 0b100110111; // 2^32까지 int형

//		비트 마스킹으로 마지막 자리 출력하기
//		System.out.println((n & 0b1) == 1<<0 ? 1 : 0);
//		System.out.println((n & 0b10) == 1<<1 ? 1 : 0);
//		System.out.println((n & 0b100) == 1<<2 ? 1 : 0);

//		System.out.println((n & 0b1) == 0 ? 0 : 1);
//		System.out.println((n & 0b10) == 0 ? 0 : 1);
//		System.out.println((n & 0b100) == 0 ? 0 : 1);
//		System.out.println((n & 0b1000) == 0 ? 0 : 1);
//		System.out.println((n & 0b10000) == 0 ? 0 : 1);
//		System.out.println((n & 0b100000) == 0 ? 0 : 1);
//		System.out.println((n & 0b1000000) == 0 ? 0 : 1);
//		System.out.println((n & 0b10000000) == 0 ? 0 : 1);
//		System.out.println((n & 0b100000000) == 0 ? 0 : 1);

		for (int i = 0; i < 9; i++) {
			System.out.println((n & 1 << i) == 0 ? 0 : 1);
		}
		System.out.println();
//		9자리인 것을 알아내기 (자리수)
		int 자리수 = (int) (Math.log(n) / Math.log(2)) + 1;
		System.out.println(자리수 + "자리수");

		System.out.println(n + " 10진수로 변경한 값");
//		2진수 값을 10진수로 변경하기1
		int result = 0; // n을 10진수로 변겨한 값을 저장할 변수
		for (int i = 0; i < 9; i++) {
			if ((n & (1 << i)) != 0) { // 비트가 1인 자리
				result += (n & (1 << i)); 
			}
		}
		System.out.println(result+" 10진수로 계산한 값1");
		
//		2진수 값을 10진수로 변경하기2
		result = 0; // n을 10진수로 변겨한 값을 저장할 변수
		for (int i = 8; i >= 0; i--) { // 앞자리부터 내려오기
			result <<= 1; // 자리수를 올림
			if ((n & (1 << i)) != 0) { // 비트가 1인 자리
				result += 1; 
			}
		}
		System.out.println(result + " 10진수로 계산한 값2");
		
		
		

	} // end of main
} // end of class
