package com.subway;

public class EggMayo extends Sandwich {
	String eggmayo_con = "에그마요 2스쿱 / 치즈 2장 / 허니 머스터드 / 스위트 칠리";
	
	public EggMayo(int snum, String name, String sauce, String calory, String price, String size,
			String exp, String weight) {
		super(snum, name, sauce, calory, price, size, exp, weight);
	}
	
	@Override
	public void make() {
		super.make();
		System.out.println(super.getName() + "에는 " + eggmayo_con + " 들이 들어가서 만들어집니다.");
	}
}
