package com.ssafy;

public class ProductTest {
	public static void main(String[] args) {
		
		
		Refrigerator[] refrigerator = new Refrigerator[2]; 
		TV[] tv = new TV[2];
		
		refrigerator[0] = new Refrigerator(11, "LG �����", 400, 4, "120L");
		refrigerator[1] = new Refrigerator(13, "�Ｚ �����", 600, 2, "1800L");
		
		tv[0] = new TV(15, "Samsung TV", 100, 51, 100, "QLED");
		tv[1] = new TV(18, "SamMun TV", 200, 81, 150, "QQLED");

		System.out.println("����� ���");
		for(Refrigerator r : refrigerator) 
			System.out.println(r.toString());
		
		System.out.println();
		
		System.out.println("TV ���");
		for(TV t : tv) 
			System.out.println(t.toString());

		
	}
	
}
