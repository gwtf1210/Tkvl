package com.compare;
/* interface Comparable, Comparator
 * ��ü�� ���İ� ���õ� �������̽�
 * Comparable : Ŭ���� ���ο� ��ü�� ���� ������ ����� ������ ����ϴ� �������̽�
 * Comparator : (Ŭ���� �ܺο���) Ư�� ��ü�� ���� ������ ǥ���ϴ� �������̽�
 */

public class Writer implements Comparable<Writer>{
	
	int age;
	String firstName;
	String lastName;
	String bookTitle;
	
	public Writer(int age, String firstName, String lastName, String bookTitle) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.bookTitle = bookTitle;
	}

	// ��ü�� ���� ������ ��� �ִ� �޼ҵ�
	@Override
	public int compareTo(Writer other) {
		int result = this.age - other.age;
		return result;
	}

	@Override
	public String toString() {
		return "Writer [age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + ", bookTitle=" + bookTitle
				+ "]";
	}
	
	
}
