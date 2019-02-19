package com.ssafy.algo_11;

import java.util.ArrayList;

public class Z31_MST_Prim {
	static int[] group, key, parent;
	static ArrayList<int[]> edges;
	static boolean[] visited;
	static int V;

	public static void Init() {
		for (int v = 1; v < V; v++) {
			key[v] = Integer.MAX_VALUE;
		}
	}

	public static void main(String[] args) {
		V = 5;
		group = new int[V];
		key = new int[V];
		parent = new int[V];
		visited = new boolean[V];
		edges = new ArrayList<int[]>();

		int[][] graph = new int[][] { { 0, 2, 0, 6, 0 }, { 2, 0, 3, 8, 5 }, { 0, 3, 0, 0, 7 }, { 6, 8, 0, 0, 9 },
				{ 0, 5, 7, 9, 0 } };

		Init();

		key[0] = 0;
		parent[0] = -1;

		for (int e = 0; e < V - 1; e++) {
			int mk = Integer.MAX_VALUE;
			int mv = 0;

			// 현재 최소인 키 값을 찾기.
			for (int v = 0; v < V; v++) {
				if (visited[v] == false && key[v] < mk) {
					mk = key[v];
					mv = v;
				}
			}

			visited[mv] = true;
			for (int i = 0; i < V; i++) {
				if (graph[mv][i] != 0 && visited[i] == false && graph[mv][i] < key[i]) {
					parent[i] = mv;
					key[i] = graph[mv][i];
				}
			}
		}
		print(graph);
	}

	static void print(int[][] graph) {
		for (int v = 1; v < V; v++) {
			System.out.println(v + " : " + parent[v] + " : " + graph[v][parent[v]]);
		}
	}
}
