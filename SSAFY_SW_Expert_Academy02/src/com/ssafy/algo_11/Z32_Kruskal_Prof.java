package com.ssafy.algo_11;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * MST �˰��� �� KRUSKAL�� �� �������̰� ����(���� ����)
 * ��ȣ ��Ÿ ����(DisjointSet)�� �̿��ؾ��Ѵ�.
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
	static int[] p; // �θ� ������ �迭
	static int[] rank; // ��ũ�� ������ �迭, ���̳� �����̶�� �ϱ⿣ �ָ���
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt(); // ������ ����
		int E = sc.nextInt();

		p = new int[V+1];
		rank = new int[V+1];
		
		Edge[] ed = new Edge[E];
		for (int i = 0; i < E; i++) {
			ed[i] = new Edge(sc.nextInt(),sc.nextInt(),sc.nextInt());
		}
		
		Arrays.sort(ed); // compareTo() �� �ۼ�
	
		for (int i = 0; i < p.length; i++) {
			makeSet(i); // ���� 1��¥�� ���� �����
		}
		
		for (int i = 0; i < ed.length; i++) { // ����ġ�� ���� �������� �����ϱ�
			Edge e = ed[i];
			
			if(findSet(e.a) != findSet(e.b)) { // ���� �ٸ� ������ ��츸 ��ġ��
				unionSet(e.a, e.b);
				System.out.println(e.a + " " + e.b + " " + e.val);
			}
		}
	}
	
	/** p �迭 ��� */
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

	/** ��� x�� �����ϴ� ���ο� ������ ���� */
	public static void makeSet(int x) {
		p[x] = x; // �θ� : �ڽ��� index�� ǥ�� or -1
//		rank[x] = 0; // �ʱⰪ 0�� // ���� ����
	}

	/** ��� x�� �����ϴ� ������ ��ǥ�ڸ� ���� */
	public static int findSet(int x) {
		if (x == p[x]) {
			return x;
		} else {
			p[x] = findSet(p[x]); // Path Compression
//			rank[x] = 1; // �� �ʿ䰡 ����. ��ǥ���� ����(��ũ)�� �˸� �ȴ�.
			return p[x];
		}
	}

	/** ��� x,y�� ��ǥ�ڸ� ���ؼ� �� ������ ���� */
	public static void unionSet(int x, int y) {
		int px = findSet(x); // ��ǥ�� �˾ƿ���
		int py = findSet(y);

		if (px != py) { // ���� �ٸ� ������ ��츸 ���ľ��Ѵ�. ���ѷ����� ��
//			p[py] = px; // �� ������ ��ǥ�ڸ� ��ġ��
			link(px, py);
		}
	}

	/** x�� ��ǥ���� ���հ� y�� ��ǥ���� ������ ��ħ, rank�� ���� */
	public static void link(int px, int py) {
		if (rank[px] > rank[py]) {
			p[py] = px; // ���� ���� ū �ʿ� ���δ�
		} else {
			p[px] = py;
			if (rank[px] == rank[py]) { // ���� ���� rank ���� �����Ѵ�.
				rank[py]++; // ������ ��ǥ�� ��ũ�� ������
			}
		}
	}
	
	public static class Edge implements Comparable<Edge> {
		int a; // ����1
		int b; // ����2
		int val; // ����ġ
		
		public Edge(int a, int b, int val) {
			this.a = a;
			this.b = b;
			this.val = val;
		}

		@Override
		public int compareTo(Edge o) { // �� ����
			return this.val - o.val;
		}
	}
} // end of class
