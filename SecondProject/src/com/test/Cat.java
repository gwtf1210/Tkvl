package com.test;

/**
	@author LGM
	@version 1.0
	@since 8.0
	
*/


public class Cat {
	String name;
	
	/** ���� �ΰ��� ���� �����ϴ� �޼ҵ�
	 * @param a ���� ���� ù��° �Ķ����
	 * @param b ���� ���� �ι�° �Ķ����
	 * @return ���� ���
	 * @see Dog#sum(int, int)
	 */
	
	public int work(int a,int b) {
		Dog g= new Dog();
		
		int result = g.sum(a, b);
		
		return result;
		
	}
}
