package com.test;

/**
	@author LGM
	@version 1.0
	@since 8.0
	
*/


public class Cat {
	String name;
	
	/** 정수 두개의 합을 리턴하는 메소드
	 * @param a 합을 구할 첫번째 파라미터
	 * @param b 합을 구할 두번째 파라미터
	 * @return 합의 결과
	 * @see Dog#sum(int, int)
	 */
	
	public int work(int a,int b) {
		Dog g= new Dog();
		
		int result = g.sum(a, b);
		
		return result;
		
	}
}
