package com.ssafy.algo_11;

import java.util.ArrayList;

/**
 * 그래프(1:N) 비선형 자료구조
 */
public class Z29_BFS {
	static ArrayList<Integer>[] grapth = new ArrayList[8];
	static boolean[] visit = new boolean[8];
	static int[] queue = new int[100];
	static int front = 1;
	static int rear = 1;

	private static void BFS(ArrayList<Integer>[] grapth, int node) {
		queue[rear++] = node; // 시작점 v를 큐에 삽입
		System.out.print(node + " ");
		visit[node] = true; // 노드 v를 방문한 것으로 표시

		while (front != rear) {
			int t = queue[front++];
			for (int i = 0; i < grapth[t].size(); i++) {
				int u = grapth[t].get(i);
				if (!visit[u]) {
					queue[rear++] = u;
					visit[u] = true;
					System.out.print(u + " ");
				}
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] input = { 1, 2, 1, 3, 2, 4, 2, 5, 4, 6, 7, 6, 6, 7, 3, 7 };

		for (int i = 1; i < grapth.length; i++) {
			grapth[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < input.length; i++) {
			int start = input[i];
			int end = input[i + 1];
			grapth[start].add(end);
			grapth[end].add(start);
			i++;
		}
		BFS(grapth, 1);
	}
}
