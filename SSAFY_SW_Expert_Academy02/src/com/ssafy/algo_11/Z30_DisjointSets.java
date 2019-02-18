package com.ssafy.algo_11;

/**
 * 상호베타 집합 => MST (크루스칼 알고리즘에 활용) / 프림 < 크루스칼 makeSet(int x) 멤버 x를 포함하는 새로운 집합을
 * 생성 findSet(int x) 멤버 x를 포함하는 집합의 대표자를 리턴 union(int x, int y) 멤버 x,y 의 대표자를
 * 구해서 두 집합을 통합 link(int px, int py) x의 대표자의 집합과 y의 대표자의 집합을 합침
 */
public class Z30_DisjointSets {
	static int[] p = new int[10]; // 부모를 저장할 배열

	public static void main(String[] args) {
		for (int i = 0; i < p.length; i++) {
			makeSet(i);
		}

		printSet();
		unionSet(0, 1);
		printSet();
		unionSet(2, 3);
		printSet();
		unionSet(0, 3);
		printSet();
	} // end of main

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
	}

	/** 멤버 x를 포함하는 집합의 대표자를 리턴 */
	public static int findSet(int x) {
		if (x == p[x]) {
			return x;
		} else {
			return findSet(p[x]);
		}
	}

	/** 멤버 x,y의 대표자를 구해서 두 집합을 통합 */
	public static void unionSet(int x, int y) {
		int px = findSet(x); // 대표자 알아오기
		int py = findSet(y);

		if (px != py) { // 서로 다른 집합일 경우만 합쳐야한다. 무한루프가 돔
			p[py] = px; // 두 집합의 대표자를 합치기
		}
	}
} // end of class
