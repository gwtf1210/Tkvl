package com.ssafy.algo_04;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Z12_String {
	public static void main(String[] args) throws IOException {
		String s1 = "서민규";
		String s2 = "서민규";
		String s3 = new String("서민규");
		String s4 = new String("서민규");
		
		// 변수 : 기본형, 참조형
		
		System.out.println(s1 == s2); // true 주소의 비교
		System.out.println(s3 == s4); // false
		// 내용물 비교
		System.out.println(s1.equals(s2)); // 내용물이 같은지 비교하는 메소드
		System.out.println(s3.equals(s4)); // 내용물이 같은지 비교하는 메소드
		
		System.out.println(s1.substring(1)); // 문자열 추출 1~ 끝
		System.out.println(s1.substring(1,3)); // 문자열 추출 1 <= <3
		
		String s = "사과 귤 수박 오이 참외";
		String[] srr = s.split(" ");
		
		System.out.println(Arrays.toString(srr));
		
		StringBuilder sb = new StringBuilder("서민규"); // 글자수 + 16
//		문자열 저장할대 String => StringBuilder, StringBuffer
//		문자열 쪼갤때 String split() => StringTokenizer
//		입출력시 Scanner => BufferedReader
		Scanner sc = new Scanner(System.in);
		String sss1 = sc.nextLine(); // 엔터를 입력할 때까지의 한줄을 받아옴, 엔터는 소비시켜 버림, 앞의 한불만 문자열로 가져감
		
//		가져갈 타입의 데이터가 오기 전(앞쪽)의 화이스트스페이스를 제거
//		String sss2 = sc.next();
//		int aa = sc.nextInt();
//		double dd = sc.nextDouble();
//		boolean bb = sc.nextBoolean();
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		// try-catch가 더 빠르다. 하지만 throw를 써라.
//		br.readLine();
	
		
		String x = "1 2 3 1 2 3 1";
		StringTokenizer st = new StringTokenizer(x," ");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
