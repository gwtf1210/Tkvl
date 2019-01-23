package com.exception;

public class MoneyTransfer {
	public static void main(String[] args) {
		MoneyTransfer m = new MoneyTransfer();
		m.transfer();
	}
	
	private void transfer() { // 이체 메소드
		withdraw(); // 출금 메소드
		try{
			deposit(); // 입금 메소드	
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("입금 예외");
			System.out.println("출금 취소");
		}
	}
	
	private void deposit() throws Exception { // 입금
		throw new Exception();
	}
	
	private void withdraw() { // 출금
		System.out.println("출금 작업");
	}
}
