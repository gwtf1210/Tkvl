package com.thread;

import java.util.Date;

public class ThreadClock implements Runnable{
	
	ThreadClock(){
		// Thread 생성, start
		Thread t = new Thread(this, "name");
		t.start();
	}
	
	public static void main(String[] args) {
		new ThreadClock();
	}
	
	// 1초 간격으로 화면에 시간을 표시해줌
	@Override
	public void run() {
		while(true) {
			Date d = new Date(); // Date 객체가 생성되는 순간 시스템에서 시간정보를 받아옴
			System.out.println(d.toString());
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
