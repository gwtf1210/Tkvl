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
		
//		System.out.println(s1 == s2); // true �ּ��� ��
//		System.out.println(s3 == s4); // false
		// ���빰 ��
//		System.out.println(s1.equals(s2)); // ���빰�� ������ ���ϴ� �޼ҵ�
//		System.out.println(s3.equals(s4)); // ���빰�� ������ ���ϴ� �޼ҵ�
//		
//		System.out.println(s1.substring(1)); // ���ڿ� ���� 1~ ��
//		System.out.println(s1.substring(1,3)); // ���ڿ� ���� 1 <= <3
//		
//		String s = "��� �� ���� ���� ����";
//		String[] srr = s.split(" ");
//		
//		System.out.println(Arrays.toString(srr));
		
//		StringBuilder sb = new StringBuilder("���α�"); // ���ڼ� + 16
//		���ڿ� �����Ҵ� String => StringBuilder, StringBuffer
//		���ڿ� �ɰ��� String split() => StringTokenizer
//		����½� Scanner => BufferedReader
//		Scanner sc = new Scanner(System.in);
//		String sss1 = sc.nextLine(); // ���͸� �Է��� �������� ������ �޾ƿ�, ���ʹ� �Һ���� ����, ���� �ѺҸ� ���ڿ��� ������
		
//		������ Ÿ���� �����Ͱ� ���� ��(����)�� ȭ�̽�Ʈ�����̽��� ����
//		String sss2 = sc.next();
//		int aa = sc.nextInt();
//		double dd = sc.nextDouble();
//		boolean bb = sc.nextBoolean();
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		// try-catch�� �� ������. ������ throw�� ���.
//		br.readLine();
	
		
//		String x = "1 2 3 1 2 3 1";
//		StringTokenizer st = new StringTokenizer(x," ");
//		
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
		
		String str  = "algorithm";
		char[] crr = str.toCharArray(); // char �迭�� ����
		for (int i = 0; i < crr.length; i++) {
			char temp = crr[i];
			crr[i] = crr[crr.length-1-i];
		}
		System.out.println(Arrays.toString(crr));
		System.out.println(new String(crr)); // �迭�� ���ڿ��� �����
		
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			s = str.charAt(i) + s;
		}
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder(str); // ���ڿ� String => StringBuilder
		sb.reverse(); // ������ ��������
		System.out.println(sb);
		String bb = sb.toString();
		
		Boy b1 = new Boy(10);
		Boy b2 = new Boy(10);
		System.out.println(b1 == b2); // �ּ� ��
		System.out.println(b1.equals(b2));
	}
}

class Boy {
	int a;
	
	public Boy() {
	}
	
	public Boy(int a) {
		this.a = a;
	}
}
