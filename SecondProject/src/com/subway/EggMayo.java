package com.subway;

public class EggMayo extends Sandwich {
	String eggmayo_con = "���׸��� 2���� / ġ�� 2�� / ��� �ӽ��͵� / ����Ʈ ĥ��";
	
	public EggMayo(int snum, String name, String sauce, String calory, String price, String size,
			String exp, String weight) {
		super(snum, name, sauce, calory, price, size, exp, weight);
	}
	
	@Override
	public void make() {
		super.make();
		System.out.println(super.getName() + "���� " + eggmayo_con + " ���� ���� ��������ϴ�.");
	}
}
