package com.thread;

class Matrix extends Thread{
	int num; // 자신이 출력해야하는 단 정보

	Matrix(int num){
		this.num = num;
	}
	
	// 자신이 맡은 단 출력
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
