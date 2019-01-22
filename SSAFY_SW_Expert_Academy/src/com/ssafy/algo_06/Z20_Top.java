package com.ssafy.algo_06;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 정올 탑 1809
 * 정석 -> 시간초과
 */
public class Z20_Top {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N+1]; // 0번은 안씀
		
		
		for (int i = 1; i <= N; i++) {  // 입력값 받기
			arr[i] = sc.nextInt();
		}
		
		// 우측 끝 탑부터 (좌측으로 레이저를 쏴서) 수신할수 있는 탑을 찾아서 arr에 저장
		for (int i = N; i > 0; i--) { // 우측 끝 탑부터
			int receive = 0;
			for (int j = i-1; j > 0; j--) { // 나의 좌측에 수신할 수 있는 탑 찾기
				if(arr[i] <= arr[j]) {
					receive = j; // 수신한 탑의 번호를 저장
					break;
				}
			}
			arr[i] = receive;
 		}
		System.out.println(Arrays.toString(arr));
		
		
	} // end of main
} // end of class
