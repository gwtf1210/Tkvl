package com.ssafy.algo_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class D1_2063 {
	final static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
/*		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();
		
		// 1. ����
		// 2. �߰� ��ġ�� ���� ã�´�.
		
		Arrays.sort(arr); // �������� ���� : ����Ʈ O[nlogn] -> �ð��ʰ��� ���� �ٸ� sort�� �����ؼ� ����Ѵ�.
		System.out.println(arr[N/2]);
		
		// ���� ���� O[n^2]
		for(int i = N-1; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				// �ΰ��� ���ؼ� ū �� �ڷ�
				if(arr[j] > arr[j+1]) {
					// swap(j,j+1); // ��ȸ������ �޼ҵ� ������ ���� ���� �ھƶ�. �ӵ� ����! �� ���������� ���ȭ�� �߿��ϴ�.
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				if(i == N/2 -1) break; // �߰������� ó��
			}
		}
		System.out.println(arr[N/2]);*/
		
		// ī���� ����
		
		int[] arr2 = {3,3,4,1,2,5,3,2,2,2,2}; // 11��, 5��° �߰���
		// ������ �������� ������ ������ �̸� �˾ƾ��Ѵ�. min, max
		int[] cnt = new int[6]; // �ִ밪�� 5�̱� ����
		
		for (int i = 0; i < arr2.length; i++) {
			cnt[arr2[i]]++;
		}
		
		for (int i = 0; i < cnt.length; i++) {
			for (int j = 0; j < cnt[i]; j++) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// �߰� ��ġ ���� ���
		int x = 0;
		for (int i = 0; i < cnt.length; i++) {
			x+=cnt[i];
			if(x > 11/2) {
				System.out.println(i); // �߰���
				break;
			}
		}
		
//		���� 10989��, �� �����ϱ�
		/*Scanner sc = new Scanner(System.in); // jdk 5�� �߰���
		int num = sc.next(); // try-catch�� �ȿ� ����. �ӵ��� ���� 
		*/ 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // ���ڿ��θ� ���ϵ�
		
		System.out.println(); // ������
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Hello \n");
		
		
		
		
		
		
		
	}
}
