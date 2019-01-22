package com.ssafy.algo_06;

import java.util.Arrays;
import java.util.Scanner;
/**
 * ���� ž 1809
 * ���� -> �ð��ʰ�
 */
public class Z20_Top {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N+1]; // 0���� �Ⱦ�
		
		
		for (int i = 1; i <= N; i++) {  // �Է°� �ޱ�
			arr[i] = sc.nextInt();
		}
		
		// ���� �� ž���� (�������� �������� ����) �����Ҽ� �ִ� ž�� ã�Ƽ� arr�� ����
		for (int i = N; i > 0; i--) { // ���� �� ž����
			int receive = 0;
			for (int j = i-1; j > 0; j--) { // ���� ������ ������ �� �ִ� ž ã��
				if(arr[i] <= arr[j]) {
					receive = j; // ������ ž�� ��ȣ�� ����
					break;
				}
			}
			arr[i] = receive;
 		}
		System.out.println(Arrays.toString(arr));
		
		
	} // end of main
} // end of class
