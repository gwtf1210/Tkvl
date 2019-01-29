package com.ssafy.algo_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/** 
 * 연습문제
 * 그래프를 저장 후 전위순회로 출력
 */
public class Z23_연습문제 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int V = Integer.parseInt(br.readLine().trim());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[32]; // 레벨 4 : 2^(4+1) = 32
		arr[1] = 1; // 루트 정점 번호를 저장
		while(st.hasMoreTokens()) {
			int start = Integer.parseInt(st.nextToken()); // 간선의 시작 정점
			int end = Integer.parseInt(st.nextToken()); // 간석의 끝 정점
			
			for (int i = 1; i < arr.length; i++) { // 0번 정점은 안씀, start가 저장된 배열의 위치 찾기
				if(start == arr[i]) {
					// 자식 정점을 저장, 왼쪽 자식이 없으면 왼쪽에 저장, 있으면 오른쪽에 저장
					if(arr[i*2] == 0) { // 왼쪽자식이 없음
						arr[i*2] = end; // 왼쪽자식에 저장
					}else {
						arr[i*2 + 1] = end; // 오른쪽자식에 저장
					}
					break;
				}
			}
		}
		// 트리구조로 이쁘게 출력하기
		for (int i = 0; i < arr.length; i++) {
			if(i== 1 || i == 2 || i== 4 || i==8 || i== 16) {
				System.out.println();
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
		// 전위 순회 출력하기
		System.out.print("전위 순회 : ");
		preorder_traverse(arr, 1);
		System.out.println();
		
		System.out.print("중위 순회 : ");
		inorder_traverse(arr, 1);
		System.out.println();
		
		System.out.print("후위 순회 : ");
		postorder_traverse(arr, 1);
		System.out.println();
	}

	private static void preorder_traverse(int[] arr, int index) {
		if(index < 32 && arr[index] != 0) {
			System.out.print(arr[index] + " ");
			preorder_traverse(arr, index*2);
			preorder_traverse(arr, index*2+1);
		}
	}
	
	private static void inorder_traverse(int[] arr, int index) {
		if(index < 32 && arr[index] != 0) {
			inorder_traverse(arr, index*2);
			System.out.print(arr[index] + " ");
			inorder_traverse(arr, index*2+1);
		}		
	}
	
	private static void postorder_traverse(int[] arr, int index) {
		if(index < 32 && arr[index] != 0) {
			postorder_traverse(arr, index*2);
			postorder_traverse(arr, index*2+1);
			System.out.print(arr[index] + " ");
		}		
	}
}










