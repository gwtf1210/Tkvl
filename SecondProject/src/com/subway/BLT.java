package com.subway;

public class BLT extends Sandwich{
	String blt_con = "������ 4�� / ġ�� 2�� / ������� ���� / �ø������ / ����Ʈ��Ͼ�";
	
	public BLT(int snum, String name, String sauce, String calory, String price, String size,
			String exp, String weight) {
		super(snum, name, sauce, calory, price, size, exp, weight);
	}
	
	@Override
	public void make() {
		super.make();
		System.out.println(super.getName() + "���� " + blt_con + " ���� ���� ��������ϴ�.");
	}

}
