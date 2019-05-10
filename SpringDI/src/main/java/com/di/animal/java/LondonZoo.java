package com.di.animal.java;

public class LondonZoo implements Zoo {
	Tiger tiger;
	Lion[] lions;

	public void setTiger(Tiger tiger) {
		this.tiger = tiger;
	}

	public void setLions(Lion[] lions) {
		this.lions = lions;
	}

	public void Info() {
		System.out.println("****************** London Zoo!! *****************");
		tiger.info();
		System.out.println("-------------------------------------------------");
		int idx = 1;
		for (Lion lion : lions) {
			System.out.println(idx + "번째 사자");
			lion.info();
			idx++;
		}
		System.out.println("***********************************************");
	}
}
