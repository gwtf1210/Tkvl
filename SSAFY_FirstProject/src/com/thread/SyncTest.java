package com.thread;

public class SyncTest implements Runnable{
	
	public SyncTest() {
		// thread 생성, start
		Thread tom = new Thread(this,"tom");
		Thread jerry = new Thread(this,"jerry");
		
		tom.start();
		jerry.start();
	}
	
	public static void main(String[] args) {
		new SyncTest();
	}

	
	
	@Override
	public void run() {
		kichen();
		bedroom();
	}
	
	private synchronized void bedroom() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " 침실에 들어옴");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + " 침실에서 나감");
	}
	
	private synchronized void kichen() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " 부엌에 들어옴");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + " 부엌에서 나감");
	}
	
}
