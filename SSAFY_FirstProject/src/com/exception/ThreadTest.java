package com.exception;


// check Exception : InterruptedException. try~catch로 반드시 예외처리 해놔야됨
public class ThreadTest {

	public static void main(String[] args) {
		
		try {
			Thread t = new Thread();
			t.sleep(3000);	
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("hello world!");
	}
}
