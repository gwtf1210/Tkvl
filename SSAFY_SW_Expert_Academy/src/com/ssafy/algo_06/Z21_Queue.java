package com.ssafy.algo_06;
/** 
 * ¼±ÇüÅ¥
 */

public class Z21_Queue {
	public static int[] q = new int[5];
	public static int front = -1;
	public static int rear = -1;
	
	public static boolean isEmpty() {
		return front == rear;
	}
	
	public static int deQueue() {
		if(isEmpty()) {
			System.out.println("Queue underflow error ~!");
			return -1;
		}else {
			return q[++front];
		}
	}

	public static boolean isFull() {
		return rear == q.length -1;
	}
	
	public static void enQueue(int item){
		if(isFull()) {
			System.out.println("Queue overflow error ~!");
		}else {
			q[++rear] = item;
		}
	}	
	
	public static void main(String[] args) {

		enQueue(1);
		enQueue(2);
		enQueue(3);
		
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());
	}
}
