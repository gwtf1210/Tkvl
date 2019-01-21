package com.ssafy.algo_05;
/**
 * ���� ����
 */
public class Z19_Divide {
	// base : �ؼ�, ex : ����, �ݺ������� ���غ���
	public static int power(int base, int exp) {
		int result = 1;
		for (int i = 0; i < exp; i++) {
			result *= base;
		}
		return result;
	}
	public static int power2(int base, int exp) {
		if( exp == 0) {
			return 1;
		}else if(exp == 1) {
			return base;
		}else { // �����Ʈ
			// 2^10 = 2^5 * 2^5
			// 2^9 = 2^4 * 2^4 * 2
			int n = power(base,exp/2);
			if(exp % 2  == 0) { // ¦���̸�
				return n*n;
			}else { // Ȧ���̸�
				return n*n*base;
			}
		}
	}
	
	public static void main(String[] args) {
		// 2�� 10�� ���� ���ϱ�
		System.out.println(power(2,10));
		System.out.println(power(2,9));
		
	} // end of main
} // end of class
