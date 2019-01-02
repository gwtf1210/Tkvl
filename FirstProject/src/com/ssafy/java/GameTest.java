package com.ssafy.java;
import java.util.*;

public class GameTest {
	final static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int user_num, win_num = 0;
		int user_win_cnt = 0, com_win_cnt = 0, game_cnt=0;
		boolean isGamming = true;

		System.out.println(">>���������� ������ �����մϴ�. �Ʒ� ���� �� �ϳ��� ������.");
		System.out.println("1. 5�� 3��");
		System.out.println("2. 3�� 2��");
		System.out.println("3. 1�� 1��");
		System.out.print("��ȣ�� �Է��ϼ���.");
		
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
			System.out.print("���������� �� �ϳ� �Է�:");
			String user_choice =  sc.next();
			
			int user_tmp = change(user_choice);
			int tmp = (user_tmp + 1)>3 ? 1:user_tmp;
			
			if(user_tmp == computer)
				System.out.println("�����ϴ�!!!");
			else if(tmp == computer){
				user_win_cnt ++;
				System.out.println("�̰���ϴ�!!!");
			}else {
				com_win_cnt ++;
				System.out.println("�����ϴ�!!!");
			}
			
			if(user_win_cnt==win_num) {
				isGamming = false;
				System.out.println("### ����� ��!!!");
			}
			else if(com_win_cnt==win_num) {
				isGamming = false;
				System.out.println("### ��ǻ�� ��!!!");
			}
		}
	}

	public static int change(String _user_choice) {
		int tmp = 0;
		switch(_user_choice) {
		case "����":
			tmp = 1;
			break;
		case "����" :
			tmp = 2;
			break;
		case "��":
			tmp = 3;
			break;
		}
		return tmp;
	}
}
