package com.ssafy.algo_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Z22_MergeSort1 {
	public static List<Integer> merge(List<Integer> left, List<Integer> right) {
		List<Integer> result = new ArrayList<Integer>(left.size() + right.size()); // 두 개를 합친 큰 리스트
		int l = 0; // 왼쪽 리스트 인덱스 
		int r = 0; // 오른쪽 리스트 인덱스
		
		while(l < left.size() && r < right.size()) { // 둘다 원소가 있는 경우
			if(left.get(l) < right.get(r)) {
				result.add(left.get(l++));
			}else {
				result.add(right.get(r++));
			}
		}
		while(l < left.size()) { // 왼쪽만 있으면
			result.add(left.get(l++));
		}
		while(r < right.size()) { // 오른쪽만 있으면
			result.add(right.get(r++));
		}
		return result;
	}
	
	// 쪼개기
	public static List<Integer> mergeSort(List<Integer> ll) {
		if(ll.size() <= 1) { // 종료 조건
			return ll;
		}else { // 반복 조건
			int m = ll.size()/2;
			List<Integer> left = mergeSort(ll.subList(0, m));
			List<Integer> right = mergeSort(ll.subList(m, ll.size()));
			return merge(left,right);
		}
	}
	
	
	public static void main(String[] args) {
		Integer[] arr = {6,4,8,5,7,2,9,0,1}; 
		// 배열을 리스트로 변환, 단  int의 Wrapper Class의 Integer를 써야함.
		ArrayList<Integer> ll = new ArrayList(Arrays.asList(arr)); 
		System.out.println(mergeSort(ll));
		
	} // end of main
} // end of class
















