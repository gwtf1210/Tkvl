package com.thread;

// Runnable�� �����ϴ� ���
class Lion implements Runnable{
	
	@Override
	public void run() {
		System.out.println("thread is running... " + Thread.currentThread().getName());
	}
	
}

public class LionTest {
	public static void main(String[] args) {
		Lion l1 = new Lion(); // thread�� �ƴ�. Runnable ��ü. thread�� �����ؾ� �ϴ� �۾� �޼ҵ� run()�� ������ ����
		Thread t1 = new Thread(l1); // l1�� run()�� �����Ϸ� ��
		t1.start();
		
		
		new Thread(new Lion()).start(); 
		new Thread(new Lion()).start(); 
		
	}
}
