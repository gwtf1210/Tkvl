package com.di.animal.anno;

public class SeoulZoo implements Zoo {
	Tiger[] tigers;
	Lion lion;

	public void setTigers(Tiger[] tigers) {
		this.tigers = tigers;
	}

	public void setLion(Lion lion) {
		this.lion = lion;
	}

	@Override
	public void Info() {
		System.out.println("****************** Seoul Zoo!! *****************");
		int idx = 1;
		for (Tiger tiger : tigers) {
			System.out.println(idx + "번째 호랑이");
			tiger.info();
			idx++;
		}
		System.out.println("------------------------------------------------");
		lion.info();
		System.out.println("***********************************************");
	}
}
