package com.ssafy.algo_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * [S/W 문제해결 응용] 2일차 - 최대 상금 / Greedy
 */
public class Z28_MaxMoney {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= TC; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String s = st.nextToken(); // 숫자판
			Integer[] num = new Integer[s.length()]; // 숫자를 저장할 배열
			for (int i = 0; i < num.length; i++) {
				num[i] = s.charAt(i) - '0';
			}
			int N = Integer.parseInt(st.nextToken()); // 교환 횟수

			int[][] check = new int[10][7]; // 동일한 숫자를 교환 했는지 체크할 배열
			for (int i = 0; i < num.length && N > 0; i++) { // 선택 정렬
//				2-1. 교환 횟수가 바닥났을 경우, 전체 정렬이 안되어도 종료하기

				int maxIndex = i; // 가장 큰 숫자의 index

				for (int j = i; j < num.length; j++) {
					if (num[maxIndex] <= num[j]) {
						maxIndex = j; // 값 자체를 바꾸지 않고, index로 바꿔준다.
					}
				}
				if (i != maxIndex) { // 최대 숫자의 위치가 MSB 위치이면 교환이 아님
//					num[i] <-> num[maxIndex]
					int temp = num[maxIndex]; // 1. 가장 큰 숫자 위치와 MSB위치와 swap
					num[maxIndex] = num[i];
					num[i] = temp;

					N--; // 교환 횟수 감소

					// 동일한 숫자를 교환했는지 기록, 교환 횟수의 감소 없이 내림차순으로 정렬줌
					// temp=num[maxIndex] 교환한 최대 숫자, maxIndex 최대 숫자가 있었던 자리
					check[temp][0]++;
					check[temp][check[temp][0]] = maxIndex; // 32888

					if (check[temp][0] > 1) { // 동일한 숫자가 2개 이상일 경우, 교환 횟수 감소 없이 내림차순 정렬을 해준다
						Integer[] tempIndex = new Integer[check[temp][0]]; // 임시 배열, 3,4 큰 숫자가 있었던 index를 저장할 배열
						Integer[] tempNum = new Integer[check[temp][0]]; // 임시 배열, 3,4번자리에 새로운 값을 저장할 배열
						for (int j = 0; j < tempNum.length; j++) {
							tempIndex[j] = check[temp][j + 1];
						}
						Arrays.sort(tempIndex); // 오름차순 정렬

						for (int j = 0; j < tempNum.length; j++) {
							tempNum[j] = num[tempIndex[j]];
						}
						Arrays.sort(tempNum, new Comparator<Integer>() { // 내림차순 정렬
							@Override
							public int compare(Integer o1, Integer o2) {
								return o2 - o1;
							}
						});
						for (int j = 0; j < tempNum.length; j++) { // 내림차순으로 정렬한 데이터를 tempIndex에 순서대로 저장
							num[tempIndex[j]] = tempNum[j];
						}
					}
				}
			} // end of for 선택 정렬

			// 동일한 숫자가 존재하면, 교환 횟수가 남아도, 값의 변동없이 교환 횟수를 감소시킬 수 있다.
			HashSet<Integer> hs = new HashSet<Integer>(Arrays.asList(num));// 배열을 Collection 클래스로 변경
			// 교환 횟수가 남으면, 남은 회수만큼 교환해준다.
			// 교환 횟수가 짝수이면 무시, 값의 변화없이 교환이 가능
			if (N % 2 == 1 && hs.size() == num.length) { // 홀수만큼 남은 경우, LSB 뒤쪽부터 2개 숫자를 교환
				int temp = num[num.length - 1];
				num[num.length - 1] = num[num.length - 2];
				num[num.length - 2] = temp;
			}
			System.out.println("#" + tc + " ");
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i]);
			}
			System.out.println();

		} // end of testcase
	} // end of main
} // end of class
