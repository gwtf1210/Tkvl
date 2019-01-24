package com.thread;

import java.awt.Window;

public class WaitNotifyTest implements Runnable{
	int bread; // 빵 갯수, 공유 대
	Thread producer, consumer;
	
	public WaitNotifyTest() {
		producer = new Thread(this,"producer");
		consumer = new Thread(this,"consumer");
		
		producer.start();
		consumer.start();
	}
	
	public static void main(String[] args) {
		
		new WaitNotifyTest();
	}

	// Thread가 일하는 내용을 가진 메소드
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			long time = (long)(Math.random() * 3000 + 10);
			try {
				Thread.sleep(time);
			}catch(InterruptedException e ) {
				e.printStackTrace();
			}
			doJob();
		}
	}

	private synchronized void doJob() {
		String name = Thread.currentThread().getName();
		if(name.equals("producer")) { // 빵 만드는 thread
			if(bread >= 3) { // 꽉 차있는 상태
				notify(); // 빵 먹으라고 신호 보냄
				try {
					System.out.println(name + " 빵이 꽉 차서 쉬러감. 현재 빵 개수 : " + bread);
					wait(); // 자신은 쉬러감
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				bread++;
				System.out.println(name + " 빵 만듬. 현재 빵 갯수 : " + bread);
			}
		}else { // 빵 먹는 Thread
			if(bread <=0) {
				notify(); // 빵 만들라고 신호 보냄
				try {
					System.out.println(name + " 빵이 없어서 쉬러감. 현재 빵 개수 : " + bread);
					wait();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				bread--;
				System.out.println(name + " 빵 먹음.");
			}			
		}
	}
}
