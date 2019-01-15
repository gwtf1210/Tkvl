package com.ssafy.algo_01;

public class Z01_2_Gravity {

	public static void main(String[] args) {
		int[] m = {7,4,2,0,0,6,0,7,0}; // 나보다 작은 놈이 몇 개 있느냐로 푼다.

		int maxCnt = 0;
		
		for (int i = 0; i < m.length; i++) {
			int cnt = 0 ;
 			
			for (int j = i+1; j < m.length; j++) { // 내 위치 오른쪽에 내 값보다 작은 값의 개수 카운팅
				if(m[i] > m[j]) cnt++;
			}
			if(maxCnt<cnt) maxCnt = cnt;
		}
		System.out.println("최대 낙차 : " + maxCnt);
	}
}
