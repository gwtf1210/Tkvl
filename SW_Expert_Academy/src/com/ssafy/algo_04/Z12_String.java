package com.ssafy.algo_04;

public class Z12_String {
	public static void main(String[] args) {
		String s1 = "���α�";
		String s2 = "���α�";
		String s3 = new String("���α�");
		String s4 = new String("���α�");
		
		// ���� : �⺻��, ������
		
		System.out.println(s1 == s2); // true �ּ��� ��
		System.out.println(s3 == s4); // false
		// ���빰 ��
		System.out.println(s1.equals(s2)); // ���빰�� ������ ���ϴ� �޼ҵ�
		
	}

}
