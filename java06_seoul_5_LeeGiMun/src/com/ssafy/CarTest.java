package com.ssafy;

public class CarTest {

	public static void main(String[] args) {
		CarMgr manager = new CarMgr();
		
		manager.add(new Car("1120","Avante\t", 2000));
		manager.add(new Car("3429","Grandeur", 2500));
		manager.add(new Car("8790","M5\t", 3400));
		manager.add(new Car("2243","Morining", 2800));
		manager.add(new Car("5693","K5\t", 3200));
		manager.add(new Car("0588","Malibu\t", 4000));
		manager.add(new Car("5693","Avante\t", 1500)); // �ߺ�
		manager.add(new Car("1120","Avante\t", 2000)); // �ߺ�
		manager.add(new Car("2930","Z4\t", 3800));
		manager.add(new Car("4593","Sonata\t", 1800));
		manager.add(new Car("5660","Santafe\t", 2100));

		System.out.println("\n****************** �ڵ��� ��� ******************");
		for (int i = 0; i < manager.size()-1; i++) 
			System.out.println(manager.search()[i].toString());
		
		String sNum = "5693";
		
		if(manager.search(sNum).toString() != null) {
			System.out.println("\n****************** " + sNum + "�� ���� ���� ******************");
			System.out.println(manager.search(sNum).toString());
		}
		
		int sPrice = 3000;
		
		System.out.println("\n****************** " + sPrice + "�������� �� �ڵ��� ��� ******************");
		for (int i = 0; i < manager.size(); i++) {
			if(manager.search(sPrice)[i] != null)
				System.out.println(manager.search(sPrice)[i].toString());
		}
		
		manager.update("5660", 50);
		
		System.out.println("\n****************** �ڵ��� ��� ******************");
		for (int i = 0; i < manager.size(); i++) 
			System.out.println(manager.search()[i].toString());
		
		manager.delete("5660");
		
		System.out.println("\n****************** �ڵ��� ��� ******************");
		for (int i = 0; i < manager.size(); i++) 
			System.out.println(manager.search()[i].toString());
		
		System.out.println("\n��ϵ� �� ��� : " + manager.size() + "��");
		
		System.out.println("\n��ϵ� �� �ݾ� : " + manager.totalPrice() + "����");		
	}

}
