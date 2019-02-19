package com.ssafy.algo_12;

import java.util.Arrays;

/**
 * Dijkstra : 하나의 선택한 정점에서 각 정점까지 갈 수 있는 최단거리 구하는 알고리즘 Greedy 방식, 음이 아닌 가중치 일
 * 경우만 사용가능 음의 가중치가 있는 경우는 => 벨만포드 알고리즘을 통해서 구해야한다. 시간 복잡도 O[n^2]
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
		
		int s = 0; // 시작 정점
		int[] D = G[s].clone(); // 가중치 배열, 시작 정점의 진출 차수로 가중치 배열을 초기화
		boolean[] used = new boolean[G.length];
		
		for (int n = 0; n < used.length; n++) { // 정점 하나씩 선택하기
			// 사용하지 않은 정점 중에서, 가중치가 최소인 정점을 찾아서 used 배열에 정점 추가
			// 최소 가중치를 기준으로 index를 뽑아야함
			int minIndex = -1; // 최소 가중치가 저장된 D 배열의 index
			int min = M ; // 최소 가중치
			
			for (int i = 0; i < D.length; i++) {
				if(!used[i] && min > D[i]) {
					minIndex = i;
					min = D[i];
				}
			}
			// 가중치가 최소인 정점을 찾음. minIndex
			used[minIndex] = true;
			
			// 선택한 정점을 통해서 갈 수 있는 (인접한 정점) 정점의 가중치를 갱신하기
			for (int i = 0; i < used.length; i++) {
				// 사용하지 않은 정점, 인접한 정점, 가중치가 지금보다 더 작으면 => 갱신
				if(!used[i] && G[minIndex][i] != M && D[i] > D[minIndex] + G[minIndex][i]) {
					 D[i] = D[minIndex] + G[minIndex][i];
				}
			}


		}
		

	} // end of main
} // end of class
