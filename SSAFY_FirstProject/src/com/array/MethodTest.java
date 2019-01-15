package com.array;

public class MethodTest {
	// hello() : 화면에 hello world 출력
	public static void hello() {
		System.out.println("Hello World");
		
	} 
	
	// increase() : int 값 하나를 입력 받아 1 증가한 값을 돌려줌
	public static int increase(int num){
		num++;
		return num;
	}
	
	// max() : int 값 두 개를 입력 받아 그 중 큰 값을 돌려줌
	public static int max(int num1, int num2) {
		return (num1>num2)?num1:num2;
	}
	
	
	public static void main(String[] args) {
		hello();
		System.out.println(increase(6));
		
		System.out.println( max(10,50));
	}

}
