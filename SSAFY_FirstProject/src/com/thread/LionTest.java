package com.thread;

// Runnable을 구현하는 방법
class Lion implements Runnable{
	
	@Override
	public void run() {
		System.out.println("thread is running... " + Thread.currentThread().getName());
	}
	
}

public class LionTest {
	public static void main(String[] args) {
		Lion l1 = new Lion(); // thread는 아님. Runnable 객체. thread가 수행해야 하는 작업 메소드 run()은 가지고 있음
		Thread t1 = new Thread(l1); // l1의 run()을 실행하러 감
		t1.start();
		
		
		new Thread(new Lion()).start(); 
		new Thread(new Lion()).start(); 
		
	}
}
