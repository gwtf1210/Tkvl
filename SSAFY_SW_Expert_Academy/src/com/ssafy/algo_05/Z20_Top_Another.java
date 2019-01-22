package com.ssafy.algo_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * ���� ž 1809
 * �ٸ� ���̵��� Ǯ��
 */
public class Z20_Top_Another {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder(); // ���� ����� ���ڿ�
		
		int[] arr = new int[N+1]; // 0���� �Ⱦ�
		int[] stack = new int[N]; // ����, ž�� index�� ����
		int top = -1;
		
//		String[] str = br.readLine().split(" "); // StringTokenizer�� �ɰ��� ���� �� ����.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i <= N; i++) { // �Է°� �ޱ�
			arr[i] = Integer.parseInt(st.nextToken());
			
			// ���ÿ� ������ ���� ������ ž�� ������ pop ���� ������
			while(top != -1 && arr[stack[top]] < arr[i]) {
				top--; // index�� ���� (���� ȿ��)
			}
			
			if(top == -1) { // ������ ���������
				sb.append("0 ");
			}else {
				sb.append(stack[top] + " ");
			}
			stack[++top] = i;// ���ÿ� �� ž�� �ױ�
		}
		System.out.println(sb);
	} // end of main
} // end of class


// 2333ms
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int N = sc.nextInt();
//	
//	int[] arr = new int[N+1]; // 0���� �Ⱦ�
//	int[] stack = new int[N]; // ����, ž�� index�� ����
//	int top = -1;
//	
//	for (int i = 0; i <= N; i++) { // �Է°� �ޱ�
//		arr[i] = sc.nextInt();
//		
//		// ���ÿ� ������ ���� ������ ž�� ������ pop ���� ������
//		while(top != -1 && arr[stack[top]] < arr[i]) {
//			top--; // index�� ���� (���� ȿ��)
//		}
//		
//		if(top == -1) { // ������ ���������
//			System.out.print("0 ");
//		}else {
//			System.out.print(stack[top] + " ");
//		}
//		stack[++top] = i;// ���ÿ� �� ž�� �ױ�
//	}
//	System.out.println();
//	
//} // end of main
