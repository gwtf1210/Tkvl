package com.subway;

public class Meatball extends Sandwich{

	String meatball_con = "��Ʈ�� 4�� / ġ�� 2�� / �������� �ҽ� / ��ġ�巹��";
	
	public Meatball(int snum, String name, String sauce, String calory, String price, String size,
			String exp, String weight) {
		super(snum, name, sauce, calory, price, size, exp, weight);
	}
	
	@Override
	public void make() {
		super.make();
		System.out.println(super.getName() + "���� " + meatball_con + " ���� ���� ��������ϴ�.");
	}
}
