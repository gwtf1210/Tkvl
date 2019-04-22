package com.di.animal;

public class Lion implements Animal {
	int age;
	String name;

	public Lion(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void info() {
		System.out.println(age + "살이고 이름이 " + name + "인 호랑이가 살고 있어요.");
	}

}
