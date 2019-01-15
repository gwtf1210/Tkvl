package com.array;

import java.util.Random;

public class MyLotto {
	static int[] num = new int[6];
	
	// �ߺ����� ���� �� ã�Ƽ� ��ȯ
	public static int uniqueNumber(int index) {
		int imsi;
		boolean eq;

		Random ran = new Random();
		do {
			imsi = ran.nextInt(45)+1; // ������ �� ����
			eq = false;
			for(int j=0; j<index; j++) {
				if(imsi == num[j]) {
					eq=true;
					break;
				}
			}
		}while(eq);
		
		return imsi;
	}
	
	// ���
	public static void print(){
		System.out.println("������ ����� ���� !!!");
		for(int number : num) {
			System.out.print(number+"  ");
		}
	}

	public static void selectLotto() {
		for(int i=0; i<=5; i++) {
			num[i] = uniqueNumber(i);
		}
	}
	
	public static void main(String[] args) {
		selectLotto();
		print();
	}
}
