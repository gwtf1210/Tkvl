package com.inherit;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee[] list = new Employee[5];
		list[0] = new Employee(100,"tom", 5000);
		list[1] = new Employee(200,"tom", 6000);
		list[2] = new Manager(300,"tom", 8000,1);
		list[3] = new Manager(400,"tom", 10000,2);
		list[4] = new CEO(500,"tom", 15000);
		
		for(Employee who:list) {
			System.out.println(who.getClass().getSimpleName());
			System.out.println(who.getBonus());
			System.out.println();
		}
		
	}
}
