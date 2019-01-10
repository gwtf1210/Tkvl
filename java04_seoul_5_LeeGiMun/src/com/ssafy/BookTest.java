package com.ssafy;

public class BookTest {
	
	public static void main(String[] args) {
		
		Book[] book = new Book[5];
		Magazine[] magazine = new Magazine[5];
		
		book[0] = new Book("21424","Java Pro  ","김하나","Jaen.kr",15000,"Java 기본 문법");
		book[1] = new Book("33455", "JDBC Pro", "김철수", "Jaen,kr",23000,"");
		book[2] = new Book("55355", "Servlet/JSP", "박자바", "Jaen,kr",41000,"Model2 기반");
		book[3] = new Book("35332", "Android App", "홍길동", "Jaen,kr",25000,"Lightweight Framework");
		book[4] = new Book("35355", "OOAD 분석, 설계", "소나무", "Jaen,kr",30000,"");
		
		
		magazine[0] = new Magazine("35535","Java World","편집부","jaen.kr", 2013,2,7000,"");
		magazine[1] = new Magazine("33434","Mobile World","편집부","jaen.kr", 2013,8,8000,"");
		magazine[2] = new Magazine("75342","Next Web","편집부","jaen.kr", 2012,10,10000,"AJAX 소개");
		magazine[3] = new Magazine("76543","Architecture","편집부","jaen.kr", 2010,3,5000,"java 시스템");
		magazine[4] = new Magazine("35535","Java World","편집부","jaen.kr", 2012,12,14000,"");

		
		System.out.println("*********************** 도서 목록 **************************" );
		for(Book b : book)
			System.out.println(b.toString());
		
		System.out.println();
		
		System.out.println("*********************** 잡지 목록 **************************" );
		for(Magazine m : magazine)
			System.out.println(m.toString());
	}
		
}
