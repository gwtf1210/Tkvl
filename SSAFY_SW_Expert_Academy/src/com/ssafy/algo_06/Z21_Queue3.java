package com.ssafy.algo_06;
import java.util.LinkedList;
import java.util.Queue;

public class Z21_Queue3 {
	public static Node front;
	public static Node rear;
	public static boolean isEmpty() {
		return front == null;
	}
	
	public static int deQueue() {
		if(isEmpty()) {
			System.out.println("Queue Underflow Error~!");
			return -1;
		}else {
			int data = front.data;
			front = front.link;
			if(isEmpty()) { // 공백 큐라면
				rear = null;
			}
			return data;
		}
	}
	
//	public static boolean isFull() {} // 동적 리스트이므로 안쓴다. 메모리 공간이 허용하는한 무한대로 사용가능
	
	public static void enQueue(int item) {
		Node newNode = new Node(item);
		if(isEmpty()) { // 공백 큐 였으면
			front = newNode;
			rear = newNode;
		}else {
			rear.link = newNode;
			rear = newNode;
		}
	}
	
	public static void main(String[] args) {
		Queue q = new LinkedList<>();
		enQueue(1);
		enQueue(2);
		enQueue(3);
		
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());
	}
}

class Node{
	Node link; // 다음 노드의 주소를 저장할 변수
	int data;
	public Node(int data) {
		this.data= data;
	}
}
