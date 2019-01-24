package com.thread;

import java.awt.Window;

public class WaitNotifyTest implements Runnable{
	int bread; // �� ����, ���� ��
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

	// Thread�� ���ϴ� ������ ���� �޼ҵ�
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
		if(name.equals("producer")) { // �� ����� thread
			if(bread >= 3) { // �� ���ִ� ����
				notify(); // �� ������� ��ȣ ����
				try {
					System.out.println(name + " ���� �� ���� ������. ���� �� ���� : " + bread);
					wait(); // �ڽ��� ������
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				bread++;
				System.out.println(name + " �� ����. ���� �� ���� : " + bread);
			}
		}else { // �� �Դ� Thread
			if(bread <=0) {
				notify(); // �� ������ ��ȣ ����
				try {
					System.out.println(name + " ���� ��� ������. ���� �� ���� : " + bread);
					wait();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				bread--;
				System.out.println(name + " �� ����.");
			}			
		}
	}
}
