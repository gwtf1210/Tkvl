package com.subway;

public class Meatball extends Sandwich{

	String meatball_con = "미트볼 4개 / 치즈 2장 / 마리나라 소스 / 랜치드레싱";
	
	public Meatball(int snum, String name, String sauce, String calory, String price, String size,
			String exp, String weight) {
		super(snum, name, sauce, calory, price, size, exp, weight);
	}
	
	@Override
	public void make() {
		super.make();
		System.out.println(super.getName() + "에는 " + meatball_con + " 들이 들어가서 만들어집니다.");
	}
}
