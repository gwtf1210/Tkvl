package com.hello;

public class HelloBean {
	private String name = "billy";

	// 파라미터 있는 생성자를 만드는 경우, 디폴트 생성자를 명시해놔라.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
