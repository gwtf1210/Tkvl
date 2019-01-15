package com.ssafy.algo_02;

import java.util.Scanner;

// static ����� non-static ����� ������ �� ����.
// static ����� ���� ����� �� �ְ�, : Ŭ������ ������ ó�� �ε��ɶ�����~ ���α׷� ����ñ���
// non-static ����� ���߿� ����� �� �ִ�. : ��ó ��������~ ���������� ������������

public class Z04_��͸޼ҵ� {
// �ݺ��� : cpu�� ���길 ���, �޸��� ����� ����.
	
// ����Լ� : �� �ڽ��� �Լ��� �ٽ� ȣ���ϴ� �Լ�
// �ݺ����� ������ ����ϴ� (�ݺ�)
// �ӵ��� ������, CallStack ������ �޸𸮸� ���� ����Ѵ�
// �� ����Լ��� ����ؾ��ϴ� ��츸 ����
// �Ű� ������ �ִ��� �Ƴ���.
	
	public static void a(int start, int end, int step) {
		if(start > end) { // ���� ��Ʈ
			System.out.println();
		}
		else { // �ݺ���Ʈ
			System.out.println(start);
			a(start + step, end, step); // ���� �Լ��� �ٽ� ȣ��
		}
	}
	
	public static void b(int start, int end) {
		if(start > end) {
			System.out.println();
		}
		else {
			System.out.println(start);
			b(start +=2, end);
		}
	}
	
	public static void d(int start, int end, int step) {
		if(start > end) {
			System.out.println();
		}
		else {
			System.out.print(start + " ");
			d(start + step, end, step);
		}
	}
	
	static int sum = 0;
	public static void e(int start, int end) {
		if(start > end) {
			System.out.println("sum : " + sum);
		}
		else {
			sum += start;
			e(start+1, end);
		}
	}
	public static int f(int start, int end) {
		if(start == end) {
			return end;
		}else {
			return f(start+1,end) + start;
		}
	}
	
	public static void main(String[] args) {
		/*for (int i = 0; i < 4; i++) {
			System.out.println(i);
		}
		System.out.println();
		*/
		a(0, 4, 1);
		b(2, 8); // 2 4 6 8
		
		Scanner sc = new Scanner(System.in);
		d(sc.nextInt(),sc.nextInt(), sc.nextInt()); // 1. ������� �Է� start, end, step�� ���ڷ� �޾Ƽ� �ݺ���ó�� ���ٿ� ����ϴ� ����Լ� d �ۼ�
		e(1, 3); // 2. ������� �Է� start, end �� ���ڷ� �޾Ƽ� start~end ������ ���� ��� ����Լ� e �ۼ�
		System.out.println(f(1,100));
		
	} // end of main
} // end of class
