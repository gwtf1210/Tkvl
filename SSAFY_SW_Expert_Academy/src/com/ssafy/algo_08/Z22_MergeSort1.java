package com.ssafy.algo_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Z22_MergeSort1 {
	public static List<Integer> merge(List<Integer> left, List<Integer> right) {
		List<Integer> result = new ArrayList<Integer>(left.size() + right.size()); // �� ���� ��ģ ū ����Ʈ
		int l = 0; // ���� ����Ʈ �ε��� 
		int r = 0; // ������ ����Ʈ �ε���
		
		while(l < left.size() && r < right.size()) { // �Ѵ� ���Ұ� �ִ� ���
			if(left.get(l) < right.get(r)) {
				result.add(left.get(l++));
			}else {
				result.add(right.get(r++));
			}
		}
		while(l < left.size()) { // ���ʸ� ������
			result.add(left.get(l++));
		}
		while(r < right.size()) { // �����ʸ� ������
			result.add(right.get(r++));
		}
		return result;
	}
	
	// �ɰ���
	public static List<Integer> mergeSort(List<Integer> ll) {
		if(ll.size() <= 1) { // ���� ����
			return ll;
		}else { // �ݺ� ����
			int m = ll.size()/2;
			List<Integer> left = mergeSort(ll.subList(0, m));
			List<Integer> right = mergeSort(ll.subList(m, ll.size()));
			return merge(left,right);
		}
	}
	
	
	public static void main(String[] args) {
		Integer[] arr = {6,4,8,5,7,2,9,0,1}; 
		// �迭�� ����Ʈ�� ��ȯ, ��  int�� Wrapper Class�� Integer�� �����.
		ArrayList<Integer> ll = new ArrayList(Arrays.asList(arr)); 
		System.out.println(mergeSort(ll));
		
	} // end of main
} // end of class
















