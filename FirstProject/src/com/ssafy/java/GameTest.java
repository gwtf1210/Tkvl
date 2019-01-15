package com.ssafy.java;
import java.util.*;

public class GameTest {
	final static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int user_num, win_num = 0;
		int user_win_cnt = 0, com_win_cnt = 0, game_cnt=0;
		boolean isGamming = true;

		System.out.println(">>가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
		System.out.println("1. 5판 3승");
		System.out.println("2. 3판 2승");
		System.out.println("3. 1판 1승");
		System.out.print("번호를 입력하세요.");
		
		user_num = sc.nextInt();
		
		switch(user_num) {
		case 1:
			win_num = 3;
			break;
		case 2:
			win_num = 2;
			break;
		case 3:
			win_num = 1;
			break;
		}
		
		while(isGamming) {
			game_cnt++;
			int computer = (int)(Math.random()*3)+1;
			System.out.print("가위바위보 중 하나 입력:");
			String user_choice =  sc.next();
			
			int user_tmp = change(user_choice);
			int tmp = (user_tmp + 1)>3 ? 1:user_tmp;
			
			if(user_tmp == computer)
				System.out.println("비겼습니다!!!");
			else if(tmp == computer){
				user_win_cnt ++;
				System.out.println("이겼습니다!!!");
			}else {
				com_win_cnt ++;
				System.out.println("졌습니다!!!");
			}
			
			if(user_win_cnt==win_num) {
				isGamming = false;
				System.out.println("### 사용자 승!!!");
			}
			else if(com_win_cnt==win_num) {
				isGamming = false;
				System.out.println("### 컴퓨터 승!!!");
			}
		}
	}

	public static int change(String _user_choice) {
		int tmp = 0;
		switch(_user_choice) {
		case "가위":
			tmp = 1;
			break;
		case "바위" :
			tmp = 2;
			break;
		case "보":
			tmp = 3;
			break;
		}
		return tmp;
	}
}
