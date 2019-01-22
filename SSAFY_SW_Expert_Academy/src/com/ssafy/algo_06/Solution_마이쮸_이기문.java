package com.ssafy.algo_06;

import java.util.Arrays;

public class Solution_마이쮸_이기문 {
	public static void main(String[] args) {
		int[] queue = new int[50];
		int front = -1;
		int rear = -1;
		int myChoo = 20;
		int human[] = new int[50]; // 0은 안씀
		int index = 1;
		
		// 처음 inQueue
		queue[++rear] = index;
		human[index]++; // 0 1
		
		while(myChoo >  0) { // 종료 조건 : 마이쮸가 0개일때
			queue[++rear]= queue[++front]; // 디큐한것을 인큐한다
			myChoo -= human[queue[front]];
			human[queue[front]]++;
			queue[++rear] = (++index); //사람 늘리기
			human[index]++;
		}
		System.out.println("마지막 마이쮸 : " + queue[front]);
	}
}
