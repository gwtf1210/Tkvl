package com.ssafy.algo_02;

import java.util.Arrays;

/*
 * Babygin 탐욕기법으로 풀기, 모듈 단위로 기억해라
 */

public class Z06_Babygin {
	public static void main(String[] args) {
		int[] c = {0, 1 , 4, 4, 4, 4, 4, 9};
		// 정렬한다고 쉬워지지 않음
		int[] cnt = new int[12]; // 각 숫자가 사용된 회수를 카운팅
		
		// 숫자카드의 사용회수를 카운팅 하기
		for (int i = 0; i < c.length; i++) {
			cnt[c[i]]++;
		}
		System.out.println(Arrays.toString(cnt));
		
		cnt[10] = cnt[0];
		cnt[11] = cnt[1];
		
		int check = 0;
		// 연속된 3개의 숫자 or 3번이상 사용된 숫자를 찾기
		for (int i = 0; i < 10; i++) {
			if(i+2  < cnt.length && cnt[i] >= 1 && cnt[i+1] >= 1 && cnt[i+2] >= 1) {
				System.out.println("Run"); check++;
				cnt[i]--; cnt[i+1]--; cnt[i+2]--;
				i--; // 두번 나왔을 경우 해결
			}
			// triplet
			if(cnt[i] >= 3) {
				System.out.println("triplet"); check++;
				cnt[i]-=3;
				i--; // 두번 나왔을 경우 해결
			}
		}
		if(check==2) System.out.println("Babygin");
		else System.out.println("Badygin 아님");
	}
}
