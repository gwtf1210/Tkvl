package com.mybatis.vo;

public class Emp {
	private int id;
	private String name, mailid, start_date;
	private int manager_id;
	private String title;
	private int dept_id, salary, commission_pct;

	public Emp(int id, String name, String mailid, String start_date, int manager_id, String title, int dept_id,
			int salary, int commission_pct) {
		this.id = id;
		this.name = name;
		this.mailid = mailid;
		this.start_date = start_date;
		this.manager_id = manager_id;
		this.title = title;
		this.dept_id = dept_id;
		this.salary = salary;
		this.commission_pct = commission_pct;
	}

	public Emp() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCommission_pct() {
		return commission_pct;
	}

	public void setCommission_pct(int commission_pct) {
		this.commission_pct = commission_pct;
	}

}