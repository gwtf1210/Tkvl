package com.exception;

public class MoneyTransfer {
	public static void main(String[] args) {
		MoneyTransfer m = new MoneyTransfer();
		m.transfer();
	}
	
	private void transfer() { // ��ü �޼ҵ�
		withdraw(); // ��� �޼ҵ�
		try{
			deposit(); // �Ա� �޼ҵ�	
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("�Ա� ����");
			System.out.println("��� ���");
		}
	}
	
	private void deposit() throws Exception { // �Ա�
		throw new Exception();
	}
	
	private void withdraw() { // ���
		System.out.println("��� �۾�");
	}
}
