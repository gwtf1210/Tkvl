package com.ssafy.algo_01;

public class Z01_2_Gravity {

	public static void main(String[] args) {
		int[] m = {7,4,2,0,0,6,0,7,0}; // ������ ���� ���� �� �� �ִ��ķ� Ǭ��.

		int maxCnt = 0;
		
		for (int i = 0; i < m.length; i++) {
			int cnt = 0 ;
 			
			for (int j = i+1; j < m.length; j++) { // �� ��ġ �����ʿ� �� ������ ���� ���� ���� ī����
				if(m[i] > m[j]) cnt++;
			}
			if(maxCnt<cnt) maxCnt = cnt;
		}
		System.out.println("�ִ� ���� : " + maxCnt);
	}
}
