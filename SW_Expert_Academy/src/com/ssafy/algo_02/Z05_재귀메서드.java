package com.ssafy.algo_02;

import java.util.Arrays;

public class Z05_��͸޼��� {
	static int[] s = {2,3,5,7,7,7};
	
	public static void main(String[] args) {
		int n = 5;
//		���丮�� n! = 1*2*3*4 .. * n-1 * n
//			     = (n-1)! * n
//				 = (n-2)! * (n-1) * n		
//		f(n) = f(n-1) * n
		
//		2���� 3�ڸ��� ������ �� �ִ� ��� ����� ���� ����Լ��� ���
//		000
//		001
//		010
//		011
//		100
//		101
//		111
		binary(0, 3, new int[3]);
		
		// ���� �����
		// �ݺ���
		
		/*for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int j2 = 0; j2 < 2; j2++) {
					for (int k = 0; k < 2; k++) {
						for (int k2 = 0; k2 < 2; k2++) {
							for (int l = 0; l < 2; l++) {
								if(i==1) System.out.print(s[0] + " ");
								if(j==1) System.out.print(s[1] + " ");
								if(j2==1) System.out.print(s[2] + " ");
								if(k==1) System.out.print(s[3] + " ");
								if(k2==1) System.out.print(s[4] + " ");
								if(l==1) System.out.print(s[5] + " ");		
								System.out.println();
							}
						}
					}
				}
			}
		}*/
		
		binary2(0,s.length,new int[s.length]);
		
	}
	
	// ���丮�� �����
	public static int f(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return f(n-1) * n;
		}
	}
	
	// 2���� ���
	// 						 �������� , ���ڸ�����, 3�ڸ��� ������ �迭
	public static void binary(int i, int end, int[] arr) {
		if(i == end) { // ���� ����
			System.out.println(Arrays.toString((arr)));
		}
		else {
			arr[i] = 0;
			binary(i+1,end,arr);
			arr[i] = 1;
			binary(i+1, end, arr);
		}
	}
	
	public static void binary2(int i, int end, int[] arr) {
		if(i == end) { // ���� ����
			for (int j = 0; j < arr.length; j++) {
				if(arr[j] == 1) System.out.print(s[j] + " ");
			}
			System.out.println();
		}
		else {
			arr[i] = 0;
			binary2(i+1,end,arr);
			arr[i] = 1;
			binary2(i+1, end, arr);
		}
	}
}
