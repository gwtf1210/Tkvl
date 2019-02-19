package com.ssafy.algo_12;

import java.util.Arrays;

/**
 * Dijkstra : �ϳ��� ������ �������� �� �������� �� �� �ִ� �ִܰŸ� ���ϴ� �˰��� Greedy ���, ���� �ƴ� ����ġ ��
 * ��츸 ��밡�� ���� ����ġ�� �ִ� ���� => �������� �˰����� ���ؼ� ���ؾ��Ѵ�. �ð� ���⵵ O[n^2]
 */

public class Z33_Dijkstra_Prof {

	public static void main(String[] args) {
		final int M = Integer.MAX_VALUE;

		int[][] G = { 
				{ 0, 3, 5, M, M, M }, 
				{ M, 0, 2, 6, M, M }, 
				{ M, 1, 0, 4, 6, M }, 
				{ M, M, M, 0, 2, 3 },
				{ 3, M, M, M, 0, 6 }, 
				{ M, M, M, M, M, 0 } };
		
		int s = 0; // ���� ����
		int[] D = G[s].clone(); // ����ġ �迭, ���� ������ ���� ������ ����ġ �迭�� �ʱ�ȭ
		boolean[] used = new boolean[G.length];
		
		for (int n = 0; n < used.length; n++) { // ���� �ϳ��� �����ϱ�
			// ������� ���� ���� �߿���, ����ġ�� �ּ��� ������ ã�Ƽ� used �迭�� ���� �߰�
			// �ּ� ����ġ�� �������� index�� �̾ƾ���
			int minIndex = -1; // �ּ� ����ġ�� ����� D �迭�� index
			int min = M ; // �ּ� ����ġ
			
			for (int i = 0; i < D.length; i++) {
				if(!used[i] && min > D[i]) {
					minIndex = i;
					min = D[i];
				}
			}
			// ����ġ�� �ּ��� ������ ã��. minIndex
			used[minIndex] = true;
			
			// ������ ������ ���ؼ� �� �� �ִ� (������ ����) ������ ����ġ�� �����ϱ�
			for (int i = 0; i < used.length; i++) {
				// ������� ���� ����, ������ ����, ����ġ�� ���ݺ��� �� ������ => ����
				if(!used[i] && G[minIndex][i] != M && D[i] > D[minIndex] + G[minIndex][i]) {
					 D[i] = D[minIndex] + G[minIndex][i];
				}
			}


		}
		

	} // end of main
} // end of class
