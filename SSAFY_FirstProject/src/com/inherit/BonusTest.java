package com.inherit;

public class BonusTest {
	public void printBonus(Employee who) {
		System.out.println(who.getBonus());
	}
	
	public static void main(String[] args) {
		Employee tom =  new Employee(111,"tom",500);
		BonusTest bt = new BonusTest();
		bt.printBonus(tom);
		bt.printBonus(new Employee(200,"jane",600));
		
		Manager bill = new Manager(321,"bill", 700 ,111);
		bt.printBonus(bill);
				
	}
}
