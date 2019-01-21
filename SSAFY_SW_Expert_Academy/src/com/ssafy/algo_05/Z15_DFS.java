package com.ssafy.algo_05;
/**
 * 자료구조 : 선형자료구조(1:1), 비선형자료구조(1:다 or 다:다)
 * 비선형자료구조 : 저장방법, 순회
 * 
 * DFS 깊이 우선 탐색
 * 1, 2, 1, 3, 2, 4, 2, 5, 4, 6, 5, 6, 6, 7, 3, 7
 */
public class Z15_DFS {
	public static void main(String[] args) {
		int[][] G = {      // 정점에 연결된 정점의 정보를 저장
				{},        // 정점 0에 인접한 정접
				{2, 3},    // 정점 1에 인접한 정접
				{1, 4, 5}, // 정점 2에 인접한 정접
				{1, 7},    // 정점 3에 인접한 정접
				{2, 6},    // 정점 4에 인접한 정접
				{2, 6},    // 정점 5에 인접한 정접
				{4, 5, 7}, // 정점 6에 인접한 정접
				{3, 6}     // 정점 7에 인접한 정접
		};
		int[] stack = new int[20];
		int top = -1; // 스택의 인덱스를 관리할 변수
		boolean[] visited = new boolean[8]; // 정점의 개수만큼
		
		// 시작정점 하나를 지정 후 방문, 스택에 넣고, 반복을 시작함
		int v = 1; // 시작정점 A를 의미
		visited[v] = true; // 방문여부 체크
		System.out.println(v + " "); // 방문해서 할일
		stack[++top] = v; // 마지막 갈림길을 확인하기 위해 지나가는 정점을 저장
		
		// 반복문 시작, stack에서 값을 꺼내서 인접한 정점을 방문
		while(top > -1) { // 박몬 종료 : 스택이 비워질 때
			v = stack[top]; // 마지막 정점을 읽어옴(삭제는 안함)
			
			int go = -1; // 다음 갈 정점을 저장, flag 변수
			for (int i = 0; i < G[v].length; i++) { // 인접한 정점 중에 
				if(!visited[G[v][i]]) { // 방문하지 않았으면
					go = G[v][i]; // 다음 갈 정점
					visited[go] = true; // 방문여부 체크
					System.out.println(go + " "); // 방문해서 할일
					stack[++top] = go;
					v = go;
					break; // 인접한 정점중, 방문 안한 정점이 확인되면 반복 종료
				}
			}
			if(go == -1) { // 인접한 정점을 모두 방문한 경우
				v = stack[top--]; // 스택에서 마지막 갈림길을 꺼냄
			}
		}
	} // end of main
} // end of class





















