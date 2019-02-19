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
	static int[] p = new int[7]; // �θ� ������ �迭
	static int[] rank = new int[p.length]; // ��ũ�� ������ �迭, ���̳� �����̶�� �ϱ⿣ �ָ���
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
		
		/** Test �� */
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
}
