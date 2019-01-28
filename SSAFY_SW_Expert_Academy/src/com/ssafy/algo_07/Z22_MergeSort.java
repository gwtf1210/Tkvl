package com.ssafy.algo_07;

import java.util.LinkedList;

public class Z22_MergeSort {
	static LinkedList<Integer> merge_sort(LinkedList<Integer> ll){
		// 사이즈가 0이거나 1인 경우, 바로 리턴
		if(ll.size() <= 1)
			return ll;
		LinkedList<Integer> left = new LinkedList<>(), right = new LinkedList<>();
		int middle = ll.size() / 2;
		
		for (int i = 0; i < middle; i++) {
			left.add(ll.get(i));
		}
		
		for (int i = middle; i < ll.size(); i++) {
			right.add(ll.get(i));
		}
		
		left = merge_sort(left);
		right = merge_sort(right);
		// 분할된 리스트들 병합
		// 2. CONQUER Part
		
		return merge(left, right);
	}
	
	static LinkedList<Integer> merge(LinkedList<Integer> left, LinkedList<Integer> right){
		LinkedList<Integer> result = new LinkedList<Integer>();
		
		while(left.size() > 0 || right.size() > 0) {
			if(left.size() > 0 && right.size() > 0) {
				if(left.getFirst() <= right.getFirst()) {
					result.add(left.getFirst());
					left.removeFirst();
				}else {
					result.add(right.getFirst());
					right.removeFirst();
				}
			}
			else if(left.size() > 0) { // 왼쪽 리스트에 원소가 남아있는 경우
				result.add(left.getFirst());
				left.removeFirst();
			}else if(right.size() > 0) {
				result.add(right.getFirst());
				right.removeFirst();
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		LinkedList<Integer> input = new LinkedList<Integer>();
		
		input.add(69);
		input.add(10);
		input.add(30);
		input.add(2);
		input.add(16);
		input.add(8);
		input.add(31);
		input.add(22);
		
		input = merge_sort(input);
		
		System.out.println(input);
	}
}
























