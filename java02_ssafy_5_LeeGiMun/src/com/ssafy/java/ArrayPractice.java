package com.ssafy.java;

import java.util.Arrays;

public class ArrayPractice {
		public static int[] list={34,23,64,25,12,75,22,88,53,37};
		
		public static void print(){
			for(int data : list) {
				System.out.print(data+" ");
			}
			System.out.println();
		}
		public static void total() {
			int sum = 0;
			for(int data : list) {
				sum +=data;
			}
			System.out.println("배열의 합 : " + sum);
			
		}
		public static void average(){
			int sum = 0;
			for(int data : list) {
				sum +=data;
			}
			int average = sum/list.length;
			System.out.println("배열의 평균 : " + average);
			
		}
		public static void minimum(){
			int min = 9999;
			for(int data : list) {
				min = (min>data)?data:min;
			}
			System.out.println("배열의 최소값 : " + min);
		}
		
		public static void selectionSort(){
			Arrays.sort(list);
		}
		public static void main(String[] args) {
			print();
			total();
			average();
			minimum();
			System.out.println("=== selection sort (Ascending Order)===");
			selectionSort();
			print();
	}
}
