package com.ssafy.algo_02;

import java.util.Arrays;

/*
 * Babygin Ž�������� Ǯ��, ��� ������ ����ض�
 */

public class Z06_Babygin {
	public static void main(String[] args) {
		int[] c = {0, 1 , 4, 4, 4, 4, 4, 9};
		// �����Ѵٰ� �������� ����
		int[] cnt = new int[12]; // �� ���ڰ� ���� ȸ���� ī����
		
		// ����ī���� ���ȸ���� ī���� �ϱ�
		for (int i = 0; i < c.length; i++) {
			cnt[c[i]]++;
		}
		System.out.println(Arrays.toString(cnt));
		
		cnt[10] = cnt[0];
		cnt[11] = cnt[1];
		
		int check = 0;
		// ���ӵ� 3���� ���� or 3���̻� ���� ���ڸ� ã��
		for (int i = 0; i < 10; i++) {
			if(i+2  < cnt.length && cnt[i] >= 1 && cnt[i+1] >= 1 && cnt[i+2] >= 1) {
				System.out.println("Run"); check++;
				cnt[i]--; cnt[i+1]--; cnt[i+2]--;
				i--; // �ι� ������ ��� �ذ�
			}
			// triplet
			if(cnt[i] >= 3) {
				System.out.println("triplet"); check++;
				cnt[i]-=3;
				i--; // �ι� ������ ��� �ذ�
			}
		}
		if(check==2) System.out.println("Babygin");
		else System.out.println("Badygin �ƴ�");
	}
}
