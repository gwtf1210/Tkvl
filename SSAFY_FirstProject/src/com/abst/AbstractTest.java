package com.abst;
/* 상속-extends
 * 1. 구현 상속
 * 부모 클래스에서 메소드를 완성해서 물려주는 방식
 * 
 * 2. 타입 상속 : 추상 클래스, interface
 * 부모 클래스에서 추상(미완성) 메소드를 자식에게 물려줌
 */

// abstract class (추상 클래스): 클래스 내부에 추상 메소드가 있음. 미완성 클래스.
abstract class MyAbstract{
	// abstract method(추상메소드) : 바디({})가 없는 메소드.미완성의 메소드.키워드 abstract를 붙여줌
	public abstract void run();
	
	// concrete method(구상 메소드) : 바디가 있는 메소드
	public void stop() {
		System.out.println("stop");
	}
}
// 자식 클래스에서 상속 받은 후에 부모가 가지고 있던 추상메소드를 완성
class MyAbstractChild extends MyAbstract{

	@Override
	public void run() {
		System.out.println("run~~~");
	}
}

public class AbstractTest {
	public static void main(String[] args) {
//		MyAbstract m = new MyAbstract(); // 객체 생성 안됨
		
	}
}
