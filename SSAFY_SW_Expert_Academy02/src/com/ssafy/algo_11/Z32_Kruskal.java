package com.ssafy.algo_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Node{
	int start;
	int end;
	int weight;
	
	Node(int start, int end, int weight) {
		this.start = start;
		this.end = end;
		this.weight = weight;
	}
}

public class Z32_Kruskal {
	static int[] p = new int[7]; // 부모를 저장할 배열
	static int[] rank = new int[p.length]; // 랭크를 저장할 배열, 높이나 레벨이라고 하기엔 애매함
	static List<Node> A = new ArrayList<Node>();
	
	static void MST_Kruskal(List<Node> grapth) {
		for (int i = 0; i < 7; i++) {
			makeSet(i);
		}

		Collections.sort(grapth, new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				return o1.weight-o2.weight;
			}
		});
		
		/** Test 용 */
		for (int i = 0; i < grapth.size(); i++) {
			System.out.println(grapth.get(i).start + " " + grapth.get(i).end + " " +grapth.get(i).weight);
		}
		
		for (int i = 0; i < grapth.size(); i++) {
//			System.out.println("-----------");
//			System.out.println(findSet(grapth.get(i).start));
//			System.out.println(findSet(grapth.get(i).end));
//			System.out.println("===========");
			if(findSet(grapth.get(i).start) != findSet(grapth.get(i).end)) {
				A.add(grapth.get(i));
				printSet();
				unionSet(grapth.get(i).start, grapth.get(i).end);
				printSet();
			}
		} 
		
		System.out.println("\n* Answer *");
		for (int i = 0; i < A.size(); i++) {
			System.out.println(A.get(i).start + " " + A.get(i).end + " " +A.get(i).weight);
		}
		return;
	}
	
	public static void main(String[] args) {
		int[] input = { 0, 6, 51, 0, 2, 31, 0, 1, 32, 0, 5, 60, 2, 1, 21, 2, 6, 25, 2, 4, 46, 3, 5, 18, 3, 4, 34, 4, 6,
				51, 4, 5, 40 };
		
		List<Node> grapth = new ArrayList<Node>();
		
		for (int i = 0; i < input.length; i++) {
			int start = input[i];
			int end = input[i + 1];
			int weight = input[i + 2];
			grapth.add(new Node(start, end, weight));	
			i += 2;
		}
		
		MST_Kruskal(grapth);
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
}
