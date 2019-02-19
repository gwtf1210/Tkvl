package com.ssafy.algo_11;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * MST 알고리즘 중 KRUSKAL이 더 직관적이고 간단(많이 사용됨)
 * 상호 베타 집합(DisjointSet)을 이용해야한다.
 * 
 * 6 11
 * 5 3 18
 * 1 2 21
 * 2 6 25
 * 0 2 31
 * 0 1 32
 * 3 4 34
 * 5 4 40
 * 2 4 46
 * 0 6 51
 * 4 6 51
 * 0 5 60
 */
public class Z32_Kruskal_Prof {
	static int[] p; // 부모를 저장할 배열
	static int[] rank; // 랭크를 저장할 배열, 높이나 레벨이라고 하기엔 애매함
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt(); // 정점의 개수
		int E = sc.nextInt();

		p = new int[V+1];
		rank = new int[V+1];
		
		Edge[] ed = new Edge[E];
		for (int i = 0; i < E; i++) {
			ed[i] = new Edge(sc.nextInt(),sc.nextInt(),sc.nextInt());
		}
		
		Arrays.sort(ed); // compareTo() 를 작성
	
		for (int i = 0; i < p.length; i++) {
			makeSet(i); // 원소 1개짜리 집합 만들기
		}
		
		for (int i = 0; i < ed.length; i++) { // 가중치가 낮은 간선부터 선택하기
			Edge e = ed[i];
			
			if(findSet(e.a) != findSet(e.b)) { // 서로 다른 집합일 경우만 합치기
				unionSet(e.a, e.b);
				System.out.println(e.a + " " + e.b + " " + e.val);
			}
		}
	}
	
	/** p 배열 출력 */
	public static void printSet() {
		System.out.println();
		System.out.print("index : ");
		for (int i = 0; i < p.length; i++) {
			System.out.printf("%2d ", i);
		}
		System.out.print("\nparent: ");
		for (int i = 0; i < p.length; i++) {
			System.out.printf("%2d ", p[i]);
		}
		System.out.println();
	}

	/** 멤버 x를 포함하는 새로운 집합을 생성 */
	public static void makeSet(int x) {
		p[x] = x; // 부모 : 자신의 index로 표시 or -1
//		rank[x] = 0; // 초기값 0임 // 생략 가능
	}

	/** 멤버 x를 포함하는 집합의 대표자를 리턴 */
	public static int findSet(int x) {
		if (x == p[x]) {
			return x;
		} else {
			p[x] = findSet(p[x]); // Path Compression
//			rank[x] = 1; // 할 필요가 없다. 대표자의 깊이(랭크)만 알면 된다.
			return p[x];
		}
	}

	/** 멤버 x,y의 대표자를 구해서 두 집합을 통합 */
	public static void unionSet(int x, int y) {
		int px = findSet(x); // 대표자 알아오기
		int py = findSet(y);

		if (px != py) { // 서로 다른 집합일 경우만 합쳐야한다. 무한루프가 돔
//			p[py] = px; // 두 집합의 대표자를 합치기
			link(px, py);
		}
	}

	/** x의 대표자의 집합과 y의 대표자의 집합을 합침, rank도 맞춤 */
	public static void link(int px, int py) {
		if (rank[px] > rank[py]) {
			p[py] = px; // 작은 쪽을 큰 쪽에 붙인다
		} else {
			p[px] = py;
			if (rank[px] == rank[py]) { // 같은 경우는 rank 값이 증가한다.
				rank[py]++; // 집합의 대표자 랭크가 증가됨
			}
		}
	}
	
	public static class Edge implements Comparable<Edge> {
		int a; // 정점1
		int b; // 정점2
		int val; // 가중치
		
		public Edge(int a, int b, int val) {
			this.a = a;
			this.b = b;
			this.val = val;
		}

		@Override
		public int compareTo(Edge o) { // 비교 기준
			return this.val - o.val;
		}
	}
} // end of class
