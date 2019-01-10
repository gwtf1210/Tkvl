package com.subway;

public class BLT extends Sandwich{
	String blt_con = "베이컨 4장 / 치즈 2장 / 레드와인 식초 / 올리브오일 / 스위트어니언";
	
	public BLT(int snum, String name, String sauce, String calory, String price, String size,
			String exp, String weight) {
		super(snum, name, sauce, calory, price, size, exp, weight);
	}
	
	@Override
	public void make() {
		super.make();
		System.out.println(super.getName() + "에는 " + blt_con + " 들이 들어가서 만들어집니다.");
	}

}
