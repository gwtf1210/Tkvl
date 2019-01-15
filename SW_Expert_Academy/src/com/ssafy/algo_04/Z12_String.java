package com.ssafy.algo_04;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Z12_String {
	public static void main(String[] args) throws IOException {
		String s1 = "���α�";
		String s2 = "���α�";
		String s3 = new String("���α�");
		String s4 = new String("���α�");
		
		// ���� : �⺻��, ������
		
		System.out.println(s1 == s2); // true �ּ��� ��
		System.out.println(s3 == s4); // false
		// ���빰 ��
		System.out.println(s1.equals(s2)); // ���빰�� ������ ���ϴ� �޼ҵ�
		System.out.println(s3.equals(s4)); // ���빰�� ������ ���ϴ� �޼ҵ�
		
		System.out.println(s1.substring(1)); // ���ڿ� ���� 1~ ��
		System.out.println(s1.substring(1,3)); // ���ڿ� ���� 1 <= <3
		
		String s = "��� �� ���� ���� ����";
		String[] srr = s.split(" ");
		
		System.out.println(Arrays.toString(srr));
		
		StringBuilder sb = new StringBuilder("���α�"); // ���ڼ� + 16
//		���ڿ� �����Ҵ� String => StringBuilder, StringBuffer
//		���ڿ� �ɰ��� String split() => StringTokenizer
//		����½� Scanner => BufferedReader
		Scanner sc = new Scanner(System.in);
		String sss1 = sc.nextLine(); // ���͸� �Է��� �������� ������ �޾ƿ�, ���ʹ� �Һ���� ����, ���� �ѺҸ� ���ڿ��� ������
		
//		������ Ÿ���� �����Ͱ� ���� ��(����)�� ȭ�̽�Ʈ�����̽��� ����
//		String sss2 = sc.next();
//		int aa = sc.nextInt();
//		double dd = sc.nextDouble();
//		boolean bb = sc.nextBoolean();
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		// try-catch�� �� ������. ������ throw�� ���.
//		br.readLine();
	
		
		String x = "1 2 3 1 2 3 1";
		StringTokenizer st = new StringTokenizer(x," ");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
