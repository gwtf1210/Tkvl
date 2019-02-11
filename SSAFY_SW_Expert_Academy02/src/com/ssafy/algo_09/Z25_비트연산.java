package com.ssafy.algo_09;

public class Z25_��Ʈ���� {
	public static void main(String[] args) {
//		int n = 123; // 10����
//		int n = 0x12f; // 16����	0X, 0x
//		int n = 0123; // 8����	0
//		int n = 0b101; // 2����	0b, 0B
		int n = 0b100110111; // 2^32���� int��

//		��Ʈ ����ŷ���� ������ �ڸ� ����ϱ�
//		System.out.println((n & 0b1) == 1<<0 ? 1 : 0);
//		System.out.println((n & 0b10) == 1<<1 ? 1 : 0);
//		System.out.println((n & 0b100) == 1<<2 ? 1 : 0);

//		System.out.println((n & 0b1) == 0 ? 0 : 1);
//		System.out.println((n & 0b10) == 0 ? 0 : 1);
//		System.out.println((n & 0b100) == 0 ? 0 : 1);
//		System.out.println((n & 0b1000) == 0 ? 0 : 1);
//		System.out.println((n & 0b10000) == 0 ? 0 : 1);
//		System.out.println((n & 0b100000) == 0 ? 0 : 1);
//		System.out.println((n & 0b1000000) == 0 ? 0 : 1);
//		System.out.println((n & 0b10000000) == 0 ? 0 : 1);
//		System.out.println((n & 0b100000000) == 0 ? 0 : 1);

		for (int i = 0; i < 9; i++) {
			System.out.println((n & 1 << i) == 0 ? 0 : 1);
		}
		System.out.println();
//		9�ڸ��� ���� �˾Ƴ��� (�ڸ���)
		int �ڸ��� = (int) (Math.log(n) / Math.log(2)) + 1;
		System.out.println(�ڸ��� + "�ڸ���");

		System.out.println(n + " 10������ ������ ��");
//		2���� ���� 10������ �����ϱ�1
		int result = 0; // n�� 10������ ������ ���� ������ ����
		for (int i = 0; i < 9; i++) {
			if ((n & (1 << i)) != 0) { // ��Ʈ�� 1�� �ڸ�
				result += (n & (1 << i)); 
			}
		}
		System.out.println(result+" 10������ ����� ��1");
		
//		2���� ���� 10������ �����ϱ�2
		result = 0; // n�� 10������ ������ ���� ������ ����
		for (int i = 8; i >= 0; i--) { // ���ڸ����� ��������
			result <<= 1; // �ڸ����� �ø�
			if ((n & (1 << i)) != 0) { // ��Ʈ�� 1�� �ڸ�
				result += 1; 
			}
		}
		System.out.println(result + " 10������ ����� ��2");
		
		
		

	} // end of main
} // end of class
