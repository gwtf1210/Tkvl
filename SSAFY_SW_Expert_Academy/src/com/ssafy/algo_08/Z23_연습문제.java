package com.ssafy.algo_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/** 
 * ��������
 * �׷����� ���� �� ������ȸ�� ���
 */
public class Z23_�������� {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int V = Integer.parseInt(br.readLine().trim());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[32]; // ���� 4 : 2^(4+1) = 32
		arr[1] = 1; // ��Ʈ ���� ��ȣ�� ����
		while(st.hasMoreTokens()) {
			int start = Integer.parseInt(st.nextToken()); // ������ ���� ����
			int end = Integer.parseInt(st.nextToken()); // ������ �� ����
			
			for (int i = 1; i < arr.length; i++) { // 0�� ������ �Ⱦ�, start�� ����� �迭�� ��ġ ã��
				if(start == arr[i]) {
					// �ڽ� ������ ����, ���� �ڽ��� ������ ���ʿ� ����, ������ �����ʿ� ����
					if(arr[i*2] == 0) { // �����ڽ��� ����
						arr[i*2] = end; // �����ڽĿ� ����
					}else {
						arr[i*2 + 1] = end; // �������ڽĿ� ����
					}
					break;
				}
			}
		}
		// Ʈ�������� �̻ڰ� ����ϱ�
		for (int i = 0; i < arr.length; i++) {
			if(i== 1 || i == 2 || i== 4 || i==8 || i== 16) {
				System.out.println();
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
		// ���� ��ȸ ����ϱ�
		System.out.print("���� ��ȸ : ");
		preorder_traverse(arr, 1);
		System.out.println();
		
		System.out.print("���� ��ȸ : ");
		inorder_traverse(arr, 1);
		System.out.println();
		
		System.out.print("���� ��ȸ : ");
		postorder_traverse(arr, 1);
		System.out.println();
	}

	private static void preorder_traverse(int[] arr, int index) {
		if(index < 32 && arr[index] != 0) {
			System.out.print(arr[index] + " ");
			preorder_traverse(arr, index*2);
			preorder_traverse(arr, index*2+1);
		}
	}
	
	private static void inorder_traverse(int[] arr, int index) {
		if(index < 32 && arr[index] != 0) {
			inorder_traverse(arr, index*2);
			System.out.print(arr[index] + " ");
			inorder_traverse(arr, index*2+1);
		}		
	}
	
	private static void postorder_traverse(int[] arr, int index) {
		if(index < 32 && arr[index] != 0) {
			postorder_traverse(arr, index*2);
			postorder_traverse(arr, index*2+1);
			System.out.print(arr[index] + " ");
		}		
	}
}










