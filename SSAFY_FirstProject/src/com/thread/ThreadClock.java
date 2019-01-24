package com.thread;

import java.util.Date;

public class ThreadClock implements Runnable{
	
	ThreadClock(){
		// Thread ����, start
		Thread t = new Thread(this, "name");
		t.start();
	}
	
	public static void main(String[] args) {
		new ThreadClock();
	}
	
	// 1�� �������� ȭ�鿡 �ð��� ǥ������
	@Override
	public void run() {
		while(true) {
			Date d = new Date(); // Date ��ü�� �����Ǵ� ���� �ý��ۿ��� �ð������� �޾ƿ�
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
