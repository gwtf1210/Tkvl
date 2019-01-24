package com.thread;

public class MainThreadTest implements Runnable{
	
	MainThreadTest(){
		// thread �����ϰ� start
		Thread t = new Thread(this);
		t.start();
		
		try{
			t.join(); // t�� ��ٷ���. main�� ��ٸ�
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) { // main�� �켱������ ���⋚���� ����� �ݴ�� ���´�.
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
