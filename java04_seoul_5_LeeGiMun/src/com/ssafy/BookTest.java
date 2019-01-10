package com.ssafy;

public class BookTest {
	
	public static void main(String[] args) {
		
		Book[] book = new Book[5];
		Magazine[] magazine = new Magazine[5];
		
		book[0] = new Book("21424","Java Pro  ","���ϳ�","Jaen.kr",15000,"Java �⺻ ����");
		book[1] = new Book("33455", "JDBC Pro", "��ö��", "Jaen,kr",23000,"");
		book[2] = new Book("55355", "Servlet/JSP", "���ڹ�", "Jaen,kr",41000,"Model2 ���");
		book[3] = new Book("35332", "Android App", "ȫ�浿", "Jaen,kr",25000,"Lightweight Framework");
		book[4] = new Book("35355", "OOAD �м�, ����", "�ҳ���", "Jaen,kr",30000,"");
		
		
		magazine[0] = new Magazine("35535","Java World","������","jaen.kr", 2013,2,7000,"");
		magazine[1] = new Magazine("33434","Mobile World","������","jaen.kr", 2013,8,8000,"");
		magazine[2] = new Magazine("75342","Next Web","������","jaen.kr", 2012,10,10000,"AJAX �Ұ�");
		magazine[3] = new Magazine("76543","Architecture","������","jaen.kr", 2010,3,5000,"java �ý���");
		magazine[4] = new Magazine("35535","Java World","������","jaen.kr", 2012,12,14000,"");

		
		System.out.println("*********************** ���� ��� **************************" );
		for(Book b : book)
			System.out.println(b.toString());
		
		System.out.println();
		
		System.out.println("*********************** ���� ��� **************************" );
		for(Magazine m : magazine)
			System.out.println(m.toString());
	}
		
}
