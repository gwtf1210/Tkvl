package com.ssafy.algo_01;

import java.util.Arrays;

// 1. ���� ȸ���� ���ص� ��
// 2. 2���� �迭 ���ص� ��
public class Z01_Gravity {
	public static void main(String[] args) {
		int[] m = {7,4,2,0,0,6,0,7,0};

		int[][] room = new int[8][9]; // 8�� 9���� ����
		
		// 1���� �迭�� �о �ڽ� ä��� 
		for (int i = 0; i < 9; i++) { // �� 0~8
			for (int j = 7; m[i]>0; j--, m[i]--) { // �� 7~0
				room[j][i] = 1;
			}
		}
		
		for (int i = 0; i < room.length; i++) { // 8��
			for (int j = 0; j < room[i].length; j++) { // 9��
				System.out.print(room[i][j] + " ");
			}
			System.out.println();
		}
			
		// 90�� ���������� ȸ����Ű��
		int[][] nRoom  = new int[9][8];
		for (int i = 0; i < room.length; i++) { // 8��
			for (int j = 0; j < room[i].length; j++) { // 9��
				nRoom[j][7-i] = room[i][j];	
			}
		}
		/*// �ݺ��� �𸦶� �밡�� �غ���
		nRoom[0][7] = room[0][0];
		nRoom[1][7] = room[0][1];
		nRoom[2][7] = room[0][2];
		nRoom[3][7] = room[0][3];*/
		
		// ����߸���
		int maxGap = 0;
		for (int i = 7; i >= 0; i--) { // 8���� �� �������Ƿ� 7~0 
			for (int j = 0; j < nRoom[i].length; j++) {
				int gap = 0; // ���� ī����
				if(nRoom[i][j] == 1) { // �ڽ��̸� �Ʒ��� ����߷���
					for (int k = 0; k < 9; k++) {
						if(i+k+1 >= 9 || nRoom[i+k+1][j] == 1) break; // �Ʒ� ĭ�� �ڽ��� �ƴϾ�� ����߸� �� ����
						nRoom[i+k][j] = 0; // �ڽ��� �Ʒ��� ������
						nRoom[i+k+1][j] = 1;
						gap++;
					}
					if(maxGap < gap) maxGap = gap;
				}
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < nRoom.length; i++) { // 8��
			for (int j = 0; j < nRoom[i].length; j++) { // 9��
				System.out.print(nRoom[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("�ִ� ���� : " + maxGap);
		
	} // end of main
} // end of class
