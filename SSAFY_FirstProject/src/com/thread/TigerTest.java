package com.thread;

// Thread 클래스 상속 받는 방법
class Tiger extends Thread{
	// callback method : 사용자에 의해 직접 호출되지는 않지만 특정조건이 되면 자동 실행되는 메소드
	// Thread가 수행해야할 작업 내용을 갖는 메소드
	public void run(){
		System.out.println("thread is running..." + getName());
	}
}

public class TigerTest {
	public static void main(String[] args) {
		Tiger t1 = new Tiger(); // t1은 Thread
		t1.start(); // Thread에게 작업 시작을 알리는 메소드 (run을 찾아감)
//		t1.run();
		
		Tiger t2 = new Tiger();
		Tiger t3 = new Tiger();
		
		t2.start();
		t3.start();
		
		
		
	}
}
