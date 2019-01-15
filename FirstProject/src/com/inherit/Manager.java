package com.inherit;
// super class, 부모 클래스

class Employee {
	int num;
	String name;
	int salary;
	
	public Employee(int num, String name, int salary){
		this.num = num;
		this.name = name;
		this.salary = salary;
	}
	
	public void info() {
		System.out.println("num : " + num);
		System.out.println("name : " + name);
		System.out.println("salary : " + salary);
	}
	
	
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public double getBonus() {
		return salary * 0.3;	
	}
}

class CEO extends Employee{

	public CEO(int num, String name, int salary) {
		super(num, name, salary);
	}
	
	@Override
	public double getBonus() {
		return getSalary() * 0.7;
	}
	
}

// sub class, 자식 클래스
public class Manager extends Employee {
	
	private int mcode;
	
	public Manager(int num, String name, int salary, int mcode){
		super(num,name,salary);
		this.mcode = mcode;
	}
	
	
	
	public int getMcode(){
		return mcode;
	}
	public void setMcode() {
		this.mcode = mcode;
	}
	
	@Override
	public double getBonus() {
		return super.getBonus() * 0.5;
	}
	
	
	public static void main(String[] args) {
		Employee tom = new Employee(100,"tom",5000);
		tom.setSalary(5000);
		
		Manager bill = new Manager(200, "bill", 7000,100);
		System.out.println(bill.getBonus());
		
	}
}
