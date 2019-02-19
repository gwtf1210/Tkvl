package com.ssafy.algo_11;

import java.util.Arrays;

public class Z33_Dijkstra {
	static int[] d;
	static int[][] graph;
	static int MV, V;
	static boolean[] visited;
	
	public static void main(String[] args) {
		MV = Integer.MAX_VALUE;
		V = 6;
				
		graph = new int[][] {
			{0, 3, 5, MV, MV, MV,},
			{MV, 0, 2, 6, MV, MV},
			{MV, 1, 0, 4, 6, MV},
			{MV, MV, MV, 0, 2, 3},
			{3, MV, MV, MV, 0, 6},
			{MV, MV, MV, MV, MV, 0}
		};
		
		d = new int[V];
		visited = new boolean[V];
		Dijkstra(0); // 시작점
		
		System.out.println(Arrays.toString(d)); // 모든 점까지의 최단 거리 
	}
	
	public static void Dijkstra(int s) {
		visited[s] = true;
		
		for (int i = 0; i < V; i++) {
			d[i] = graph[0][i];
		}
		
		int cnt = 1;
		while(cnt < V) {
			int mv = Integer.MAX_VALUE, midx = 0;
			
			for (int i = 0; i < V; i++) {
				if (visited[i] == false && d[i] < mv) {
					mv = d[i];
					midx = i;
				}
			}
			visited[midx] = true;
			
			for (int i = 0; i < V; i++) {
				if (graph[midx][i] != 0 && d[i] > d[midx] + graph[midx][i] && graph[midx][i] != Integer.MAX_VALUE) {
					d[i] = d[midx] + graph[midx][i];
				}
			}
			cnt++;
		}
	}
}
