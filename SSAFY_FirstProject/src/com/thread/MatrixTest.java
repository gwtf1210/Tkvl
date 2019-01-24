package com.thread;

class Matrix extends Thread{
	int num; // �ڽ��� ����ؾ��ϴ� �� ����

	Matrix(int num){
		this.num = num;
	}
	
	// �ڽ��� ���� �� ���
	public void run() {
		for (int i = 1; i <= 9; i++) {
			System.out.print(num + " * " + i + " = " + num*i + "\t");	
		}
		System.out.println();
	}
}

public class MatrixTest {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			Thread tmp = new Matrix(i);
			tmp.start();
			try {
				tmp.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
