package com.basic;

public class HelloWorld {

	public static void main(String[] args) { 
		// comment : ����
		/*
		 * ������ �ּ�
		 * Ctrl + Alt + ����Ű �Ʒ� -> �� ����
		 * sysout + Ctrl + Space -> System.out.println();
		 * Ŀ�� + Alt + ����Ű ��,�Ʒ� -> �� �̵�
		 * Ŀ�� + Ctrl + D -> �� ����
		 */
		
		/* data type>>
		 * 1) primitive type �⺻��
		 *     1. ���� : boolean(��, ����)
		 *     2. ������ 
		 *         a. ������ (byte(1), short(2), int(4)***, long(8), char(2))
		 *         b. �Ǽ��� (float(4), double(8)***)
		 *         
		 * 2) reference type ������
		 *     - class(String), interface, array, enum... 
		 */
		
		System.out.println(StaticTest.scount); // Ŭ���� �̸����� static ���� ��� ����
		StaticTest.go();
		
		String name = "Ricky";
		System.out.println("Hello, " + name);
		System.out.println("i'll ace this exam");
		System.out.println("What did you do last night?");
				
	}
}