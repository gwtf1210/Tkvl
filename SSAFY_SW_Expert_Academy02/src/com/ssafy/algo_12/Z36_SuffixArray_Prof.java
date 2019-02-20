package com.ssafy.algo_12;

import java.util.Arrays;

/**
 * Ư�� ���ڿ��� ��� �κ� ���ڿ��� ���ĵ� ���·� �˰� ���� �� Ư�� ���ڿ��� ��� ���̻縦 ���� -> ���� -> �� ���̻��� ��� ���λ縦
 * ����
 * 
 * Ʈ����(Trie) : ���ڿ��� ������ ǥ���ϴ� Ʈ�� Compressed Trie : ���ڿ��� ���̻��� Ʈ������ ����� ǥ��
 * 
 * ���̾� Ʈ��(Suffix Tree) : Compressed Trie�� ����, ���ڿ� ���� $�� �ٿ��� ǥ�� ���� �ð� ���⵵ O[n^2]
 * = > O[n log n] => O[n]
 * 
 * ���̾� �迭(Suffix Array) : ���̾���� ���������� ������ �迭, ���� : Ʈ���� ���� ������. / ���� : �޸� ����
 * (1/4), �ҽ��� ���� ���� �ð����⵵ O[n log n] (������ �ؾ��ϱ� ������)
 * 
 * LCP �迭 : (Longest Common Prefix) ���� ���� ���ξ�, ���̾� �迭�� ���� ���������� �ʿ��� �� ���ڿ� ������
 * ���� ���ξ��� ����
 */
public class Z36_SuffixArray_Prof {
	public static void main(String[] args) {
		// banana�� ��� �κ� ���ڿ��� ���ĵ� ���·� ���
		String s = "banana";

		// s ���ڿ��� ��� ���̻� ����
		int[] sa = new int[s.length()]; // Suffix Array : index��°���� �����ϴ� ���ڿ� s�� ���̻�

		for (int i = 0; i < sa.length; i++) {
			sa[i] = i;
		}

		// s ���ڿ��� ��� ���̻縦 ���� => ��ü �˰��򿡼� ���� ���� �ɸ��� �κ�
		for (int i = 0; i < sa.length; i++) { // ���� ����
			int minIndex = i;
			for (int j = i; j < sa.length; j++) {
//				 s.substring(sa[minIndex]) �� s.substring(sa[j]) �� ��
				if (s.substring(sa[minIndex]).compareTo(s.substring(sa[j])) > 0) {
					minIndex = j;
				}
			}
			int temp = sa[minIndex];
			sa[minIndex] = sa[i];
			sa[i] = temp;
		}

		int[] LCP = new int[s.length()]; // LCP ������� ���ξ� ������ �迭�� �غ�
		// LCP[4] = s.substring(sa[3]) �� substring(sa[4])�� ���� ���� ���ξ��� ����
		for (int i = 1; i < LCP.length; i++) { // 1������ �����Ѵ�.
			String s1 = s.substring(sa[i - 1]);
			String s2 = s.substring(sa[i]);
			while (s1.length() > LCP[i] // ���ڰ� ���� ��� index ���� �߻��� �� ����
					&& s2.length() > LCP[i] && s1.charAt(LCP[i]) == s2.charAt(LCP[i])) {
				LCP[i]++;
			}
		}
		System.out.println(Arrays.toString(LCP) + " : LCP");

		// ���
		System.out.println(Arrays.toString(sa) + " : SuffixArray");
		for (int i = 0; i < sa.length; i++) {
			String str = s.substring(sa[i]); // ���̻�
			System.out.println("< " + str + " >");
			// �� ���̻��� ��� ���λ縦 ����
			for (int j = 1; j <= str.length(); j++) {
				System.out.println(str.substring(0, j)); // ���λ� = i ~ j�� �κ� ���ڿ�
			}
			System.out.println(str.length() + " : ���λ��� ����"); // = �ش� ���̻��� ����
			System.out.println(LCP[i] + " : ������� ���λ��� ����"); // �ߺ��� ���ڿ��� ������ �ľ��ϱ� ���ؼ� �����
			System.out.println(str.length()-LCP[i] + " : ��ȿ�� �κ� ���ڿ��� ����"); // �� �ܰ迡�� 
		}

		System.out.println("\n\n���� Ǯ��");
		System.out.println("s���ڿ����� ���� �� �ִ� ��� �κ� ���ڿ��� ������ ���Ļ��¿��� k��° ���ڿ�");
		
		int k = 12;
		int index = k;
		for (int i = 0; i < sa.length; i++) {
			String str = s.substring(sa[i]); // ���̻�
			if(index - (str.length()-LCP[i])>0) {
				index = index - (str.length()-LCP[i]); // ��ȿ�� ���ڿ��� ������ ����
			}
			else{ // �� ���̻��� ���λ�鿡�� k��° ���ڿ��� ���ԵǾ��ִ�.
				System.out.println(str.substring(0, LCP[i] + index));
				break;
			}
		}
		
		
		

	} // end of main
} // end of class
