package com.ssafy.algo_03;

import java.util.Arrays;

/**
 * PowerSet : ��� �κ������� ���ҷ� �ϴ� ����
 */

public class Z08_PowerSet {
	public static void main(String[] args) {
//		���̳ʸ� ī���� -> �ӵ��� ������. ���߿� ����ġ�Ⱑ �ȵȴ�. �Ǵ��� ���� ���� ������ ����.
//		4�ڸ��� ������ �κ�����
		int N = 4;
		
		int[] bit = new int[N]; // �� ���Ҹ� (������� 1/������ 0)�� ������ ���� ������ �迭
		for (int i = 0; i < (1 << N); i++) {
//			�� �ڸ��� �����غ���
			for (int j = 0; j < N; j++) {
				if((i & 1 <<j) == 1<<j) {
					bit[j] = 1;
				}else {
					bit[j] = 0;
				}
			}
			print(bit);
		}
			
//			System.out.println( i & 1<<0); // 1���ڸ�
//			System.out.println( i & 1<<0); // 2^1 �ڸ�
//			System.out.println( i & 1<<3); // 2^2 �ڸ�
//			System.out.println( i & 1<<2); // 2^3 �ڸ�
			
//			String a = Integesr.toBinaryString(i);
//			System.out.println(a);
		}

		
		
		
////		0 1 2 3
//		int[] bit = new int[4]; // �� ���Ҹ� (������� 1/������ 0)�� ������ ���� ������ �迭
//		for (int i = 0; i < 2; i++) {
//			bit[0] = i;
//			for (int j = 0; j < 2; j++) {
//				bit[1] = j;
//				for (int k = 0; k < 2; k++) {
//					bit[2] = k;
//					for (int n = 0; n < 2; n++) {
//						bit[3] = n;
//						print(bit);
//					}
//				}
//			}
//		}
//	}
//	
//	public static void print(int[] bit) {
//		int[] arr = {8,4,7,2};
//		for (int i = 0; i < bit.length; i++) {
//			if(bit[i] == 1) {
//				System.out.print(arr[i] + ",");
//			}
//		}
//		System.out.println();
//	}
		
	public static void print(int[] bit) {
		int[] arr = {8,4,7,2};
		for (int i = 0; i < bit.length; i++) {
			if(bit[i] == 1) {
				System.out.print(arr[i] + ",");
			}
		}
		System.out.println();
	}
}
