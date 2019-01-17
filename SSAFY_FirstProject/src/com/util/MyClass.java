package com.util;

import com.abst.Circle;

// generic programming : 按眉 积己矫 蜡楷己捞 积辫

public class MyClass<X> {
	private X data;
	
	public X getData() {
		return data;
	}

	public void setData(X data) {
		this.data = data;
	}

	public static void main(String[] args) {
		MyClass<String> m1 = new MyClass<>(); 
		MyClass<Integer> m2 = new MyClass<>(); 
		MyClass<Circle> m3 = new MyClass<>(); 
	}
}
