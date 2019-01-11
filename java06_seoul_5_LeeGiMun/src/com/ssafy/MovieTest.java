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
					System.out.println("정보가 없습니다.");
					break;
				}
				System.out.println("****** 영화 목록 ******");
				for (int i = 0; i < manager.getSize(); i++) {
					if(manager.search()[i] != null)
						System.out.println(manager.search()[i].toString());
				}
				break;
			case 3:
				System.out.print("영화명을 입력해주세요. : ");
				String title = sc.next();
				boolean check = false;
				for (int i = 0; i < manager.getSize(); i++) {
					if(manager.search(title)[i] != null) {
						System.out.println("검색 결과 : " + manager.search(title)[i].toString());
						check = true;
					}
				}
				if(!check) System.out.println("해당 정보가 없습니다.");
				break;
			case 4:
				System.out.print("장르를 입력해주세요. : ");
				String genre = sc.next();
				boolean check1 = false;
				for (int i = 0; i < manager.getSize(); i++) {
					if(manager.searchGenre(genre)[i] != null)
						System.out.println(manager.searchGenre(genre)[i].toString());
				}
				if(!check1) System.out.println("해당 정보가 없습니다.");
				
				break;
			case 5:
				System.out.print("삭제할 영화명을 입력해주세요. : ");
				String del_title = sc.next();
				manager.delete(del_title);
				break;
			case 0:
				System.out.println("종료합니다.");
				isStart = false;
				return;
			}
		}while(isStart);
	}
	
	public static void intro() {
		String intro = "<<< 영화 관리 프로그램 >>>\n"
				+ "1. 영화 정보 입력\n"
				+ "2. 영화 정보 전체 검색\n"
				+ "3. 영화명 검색\n"
				+ "4. 영화 장르별 검색\n"
				+ "5. 영화 정보 삭제\n"
				+ "0. 종료\n"
				+ "원하는 번호를 선택하세요. : ";
		
		System.out.print(intro);
	}
}
