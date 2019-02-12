package com.ssafy.algo10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * [S/W �����ذ� ����] 2���� - �ִ� ��� / Greedy
 */
public class Z28_MaxMoney {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= TC; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String s = st.nextToken(); // ������
			Integer[] num = new Integer[s.length()]; // ���ڸ� ������ �迭
			for (int i = 0; i < num.length; i++) {
				num[i] = s.charAt(i) - '0';
			}
			int N = Integer.parseInt(st.nextToken()); // ��ȯ Ƚ��

			int[][] check = new int[10][7]; // ������ ���ڸ� ��ȯ �ߴ��� üũ�� �迭
			for (int i = 0; i < num.length && N > 0; i++) { // ���� ����
//				2-1. ��ȯ Ƚ���� �ٴڳ��� ���, ��ü ������ �ȵǾ �����ϱ�

				int maxIndex = i; // ���� ū ������ index

				for (int j = i; j < num.length; j++) {
					if (num[maxIndex] <= num[j]) {
						maxIndex = j; // �� ��ü�� �ٲ��� �ʰ�, index�� �ٲ��ش�.
					}
				}
				if (i != maxIndex) { // �ִ� ������ ��ġ�� MSB ��ġ�̸� ��ȯ�� �ƴ�
//					num[i] <-> num[maxIndex]
					int temp = num[maxIndex]; // 1. ���� ū ���� ��ġ�� MSB��ġ�� swap
					num[maxIndex] = num[i];
					num[i] = temp;

					N--; // ��ȯ Ƚ�� ����

					// ������ ���ڸ� ��ȯ�ߴ��� ���, ��ȯ Ƚ���� ���� ���� ������������ ������
					// temp=num[maxIndex] ��ȯ�� �ִ� ����, maxIndex �ִ� ���ڰ� �־��� �ڸ�
					check[temp][0]++;
					check[temp][check[temp][0]] = maxIndex; // 32888

					if (check[temp][0] > 1) { // ������ ���ڰ� 2�� �̻��� ���, ��ȯ Ƚ�� ���� ���� �������� ������ ���ش�
						Integer[] tempIndex = new Integer[check[temp][0]]; // �ӽ� �迭, 3,4 ū ���ڰ� �־��� index�� ������ �迭
						Integer[] tempNum = new Integer[check[temp][0]]; // �ӽ� �迭, 3,4���ڸ��� ���ο� ���� ������ �迭
						for (int j = 0; j < tempNum.length; j++) {
							tempIndex[j] = check[temp][j + 1];
						}
						Arrays.sort(tempIndex); // �������� ����

						for (int j = 0; j < tempNum.length; j++) {
							tempNum[j] = num[tempIndex[j]];
						}
						Arrays.sort(tempNum, new Comparator<Integer>() { // �������� ����
							@Override
							public int compare(Integer o1, Integer o2) {
								return o2 - o1;
							}
						});
						for (int j = 0; j < tempNum.length; j++) { // ������������ ������ �����͸� tempIndex�� ������� ����
							num[tempIndex[j]] = tempNum[j];
						}
					}
				}
			} // end of for ���� ����

			// ������ ���ڰ� �����ϸ�, ��ȯ Ƚ���� ���Ƶ�, ���� �������� ��ȯ Ƚ���� ���ҽ�ų �� �ִ�.
			HashSet<Integer> hs = new HashSet<Integer>(Arrays.asList(num));// �迭�� Collection Ŭ������ ����
			// ��ȯ Ƚ���� ������, ���� ȸ����ŭ ��ȯ���ش�.
			// ��ȯ Ƚ���� ¦���̸� ����, ���� ��ȭ���� ��ȯ�� ����
			if (N % 2 == 1 && hs.size() == num.length) { // Ȧ����ŭ ���� ���, LSB ���ʺ��� 2�� ���ڸ� ��ȯ
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
