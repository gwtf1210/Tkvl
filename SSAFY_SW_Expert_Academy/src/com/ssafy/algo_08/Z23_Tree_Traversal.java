package com.ssafy.algo_08;

import java.util.Arrays;

public class Z23_Tree_Traversal {
	public static void main(String[] args) {
		char[] input = {'A','B', 'A', 'C', 'B', 'D', 'B', 'E', 'E', 'H', 'E', 'I', 'C', 'F', 'C', 'G'};
;
		int index = 0;
		
		int n = 3;
		int node_cnt = (int)Math.pow(2, 3+1)-1;
		char[] tree = new char[node_cnt+1+1]; // level 3
		
		tree[1] = 'A';
		while(index < input.length) {
			char start = input[index++];
			char end = input[index++];
			
			for (int i = 1; i < tree.length; i++) {
				if(start == tree[i]) {
					if(tree[i*2] == '\u0000') {
						tree[i*2] = end;
					}else {
						tree[i*2 + 1] = end;
					}
					break;
				}
			}
		}
//		for (int i = 1; i < tree.length; i++) {
//			if(i== 1 || i == 2 || i== 4 || i==8) {
//				System.out.println();
//			}
//			System.out.print(tree[i] + " ");
//		}
//		System.out.println();
		
		postOrder(tree,1);
	} // end of main

	private static void postOrder(char[] tree, int index) {
		if(index < tree.length && tree[index] != '\u0000') {
			postOrder(tree,2*index);
			postOrder(tree,2*index+1);
			System.out.print(tree[index] + " ");
		}
	}
	
} // end of class





















