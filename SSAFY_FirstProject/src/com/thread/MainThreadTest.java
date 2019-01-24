package com.thread;

public class MainThreadTest implements Runnable{
	
	MainThreadTest(){
		// thread 생성하고 start
		Thread t = new Thread(this);
		t.start();
		
		try{
			t.join(); // t를 기다려줌. main이 기다림
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) { // main이 우선순위가 높기떄문에 출력이 반대로 나온다.
		MainThreadTest m = new MainThreadTest();
		m.go();
	}
	
	private void go() {
		System.out.println("gogogo~~~");
	}
	
	@Override
	public void run() {
		System.out.println("run by thread...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
