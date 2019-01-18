package com.compare;
/* interface Comparable, Comparator
 * 객체의 정렬과 관련된 인터페이스
 * Comparable : 클래스 내부에 객체의 정렬 기준을 만들어 놓을때 사용하는 인터페이스
 * Comparator : (클래스 외부에서) 특정 객체의 정렬 기준을 표시하는 인터페이스
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

	// 객체간 정렬 기준이 들어 있는 메소드
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
