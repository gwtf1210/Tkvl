package com.thread;

// Thread Ŭ���� ��� �޴� ���
class Tiger extends Thread{
	// callback method : ����ڿ� ���� ���� ȣ������� ������ Ư�������� �Ǹ� �ڵ� ����Ǵ� �޼ҵ�
	// Thread�� �����ؾ��� �۾� ������ ���� �޼ҵ�
	public void run(){
		System.out.println("thread is running..." + getName());
	}
}

public class TigerTest {
	public static void main(String[] args) {
		Tiger t1 = new Tiger(); // t1�� Thread
		t1.start(); // Thread���� �۾� ������ �˸��� �޼ҵ� (run�� ã�ư�)
//		t1.run();
		
		Tiger t2 = new Tiger();
		Tiger t3 = new Tiger();
		
		t2.start();
		t3.start();
		
		
		
	}
}
