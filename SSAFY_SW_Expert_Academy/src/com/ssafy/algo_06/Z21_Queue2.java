package com.ssafy.algo_06;
/** 
 * ¿øÇüÅ¥
 */
import java.util.Arrays;
import java.util.Scanner;

public class Z21_Queue2 {
	public static int[]  q = new int[5];
	public static int front = 0;
	public static int rear = 0;
	
	public static boolean isEmpty() {
		return front == rear;
	}
	
	public static int deQueue() {
		if(isEmpty()) {
			System.out.println("Queue underflow error~!");
			return -1;
		}
		else {
			front++;
			if(front == q.length) {
				front = 0;
			}
//			front = ++front % q.length;
			return q[front];
		}
	}
	
	public static boolean isFull() {
		return(rear + 1) % q.length == front; 
	}
	
	public static void enQueue(int item) {
		if(isFull()) {
			System.out.println("Queue overflow error~!");
		}else {
			rear++;
			if(rear == q.length) {
				rear = 0;
			}
//			rear = ++rear % q.length; 
			q[rear] = item;
		}
	}
	
	
	public static void main(String[] args) {
		enQueue(1);
		enQueue(2);
		enQueue(3);
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());
		
		enQueue(1);
		enQueue(2);
		enQueue(3);
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());
		
		enQueue(1);
		enQueue(2);
		enQueue(3);
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());
	}
}
