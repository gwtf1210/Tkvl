package com.ssafy;

import java.util.Scanner;

public class MovieTest {
	static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		MovieMgr manager = new MovieMgr();
		
		boolean isStart = true;
		
		do {
			intro();
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				String aTitle = sc.next();
				String aDir = sc.next();
				int aGra = sc.nextInt();
				String aGen = sc.next();
				String aSum = sc.next();
				manager.add(new Movie(aTitle, aDir, aGra, aGen, aSum));
				break;
			case 2:
				if(manager.getSize() == 0 ) {
					System.out.println("������ �����ϴ�.");
					break;
				}
				System.out.println("****** ��ȭ ��� ******");
				for (int i = 0; i < manager.getSize(); i++) {
					if(manager.search()[i] != null)
						System.out.println(manager.search()[i].toString());
				}
				break;
			case 3:
				System.out.print("��ȭ���� �Է����ּ���. : ");
				String title = sc.next();
				boolean check = false;
				for (int i = 0; i < manager.getSize(); i++) {
					if(manager.search(title)[i] != null) {
						System.out.println("�˻� ��� : " + manager.search(title)[i].toString());
						check = true;
					}
				}
				if(!check) System.out.println("�ش� ������ �����ϴ�.");
				break;
			case 4:
				System.out.print("�帣�� �Է����ּ���. : ");
				String genre = sc.next();
				boolean check1 = false;
				for (int i = 0; i < manager.getSize(); i++) {
					if(manager.searchGenre(genre)[i] != null)
						System.out.println(manager.searchGenre(genre)[i].toString());
				}
				if(!check1) System.out.println("�ش� ������ �����ϴ�.");
				
				break;
			case 5:
				System.out.print("������ ��ȭ���� �Է����ּ���. : ");
				String del_title = sc.next();
				manager.delete(del_title);
				break;
			case 0:
				System.out.println("�����մϴ�.");
				isStart = false;
				return;
			}
		}while(isStart);
	}
	
	public static void intro() {
		String intro = "<<< ��ȭ ���� ���α׷� >>>\n"
				+ "1. ��ȭ ���� �Է�\n"
				+ "2. ��ȭ ���� ��ü �˻�\n"
				+ "3. ��ȭ�� �˻�\n"
				+ "4. ��ȭ �帣�� �˻�\n"
				+ "5. ��ȭ ���� ����\n"
				+ "0. ����\n"
				+ "���ϴ� ��ȣ�� �����ϼ���. : ";
		
		System.out.print(intro);
	}
}
