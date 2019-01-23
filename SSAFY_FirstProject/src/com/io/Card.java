package com.io;

import java.io.Serializable;

// 객체를 스크린을 통해 이동시키려면 직렬화(Serialization) 조건을 만족 시켜야 됨
// 직렬화 : 객체가 스트림을 통해 이동이 될때 객체안의 데이터가 바이트 배열로 바뀌어 전송되는 작업
// 직렬화 조건 : Serialization

public class Card implements Serializable{
	private int num;
	private transient String name; // 메모리에서만 쓴다. 
	
	public Card(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Card [num=" + num + ", name=" + name + "]";
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
