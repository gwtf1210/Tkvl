package com.io;

import java.io.Serializable;

// ��ü�� ��ũ���� ���� �̵���Ű���� ����ȭ(Serialization) ������ ���� ���Ѿ� ��
// ����ȭ : ��ü�� ��Ʈ���� ���� �̵��� �ɶ� ��ü���� �����Ͱ� ����Ʈ �迭�� �ٲ�� ���۵Ǵ� �۾�
// ����ȭ ���� : Serialization

public class Card implements Serializable{
	private int num;
	private transient String name; // �޸𸮿����� ����. 
	
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
