package com.di.animal.java;

public class TokyoZoo implements Zoo {

	Tiger tiger; // 변수명과 xml 상의 id가 같아야한다.
	Lion lion;

	public void setTiger(Tiger tiger) {
		this.tiger = tiger;
	}

	public void setLion(Lion lion) {
		this.lion = lion;
	}

	@Override
	public String toString() {
		return "ToyoZoo";
	}

	@Override
	public void Info() {
		tiger.info();
		lion.info();
	}
}
