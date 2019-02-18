package com.ssafy.algo_11;

/**
 * ��ȣ��Ÿ ���� => MST (ũ�罺Į �˰��� Ȱ��) / ���� < ũ�罺Į makeSet(int x) ��� x�� �����ϴ� ���ο� ������
 * ���� findSet(int x) ��� x�� �����ϴ� ������ ��ǥ�ڸ� ���� union(int x, int y) ��� x,y �� ��ǥ�ڸ�
 * ���ؼ� �� ������ ���� link(int px, int py) x�� ��ǥ���� ���հ� y�� ��ǥ���� ������ ��ħ
 */
public class Z30_DisjointSets {
	static int[] p = new int[10]; // �θ� ������ �迭

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
	}

	/** ��� x�� �����ϴ� ������ ��ǥ�ڸ� ���� */
	public static int findSet(int x) {
		if (x == p[x]) {
			return x;
		} else {
			return findSet(p[x]);
		}
	}

	/** ��� x,y�� ��ǥ�ڸ� ���ؼ� �� ������ ���� */
	public static void unionSet(int x, int y) {
		int px = findSet(x); // ��ǥ�� �˾ƿ���
		int py = findSet(y);

		if (px != py) { // ���� �ٸ� ������ ��츸 ���ľ��Ѵ�. ���ѷ����� ��
			p[py] = px; // �� ������ ��ǥ�ڸ� ��ġ��
		}
	}
} // end of class
