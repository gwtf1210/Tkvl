package com.ssafy.algo_06;

import java.util.Arrays;

public class Solution_������_�̱⹮ {
	public static void main(String[] args) {
		int[] queue = new int[50];
		int front = -1;
		int rear = -1;
		int myChoo = 20;
		int each_myChoo[] = new int[50]; // 0�� �Ⱦ�
		int index = 1;
		
		// ó�� inQueue
		queue[++rear] = index;
		each_myChoo[index]++; // 0 1
		
		while(myChoo >  0) { // ���� ���� : �����鰡 0���϶�
			queue[++rear]= queue[++front]; // ��ť�Ѱ��� ��ť�Ѵ�
			myChoo -= each_myChoo[queue[front]];
			each_myChoo[queue[front]]++;
			queue[++rear] = (++index); //��� �ø���
			each_myChoo[index]++;
		}
		System.out.println("������ ������ : " + queue[front]);
	}
}
