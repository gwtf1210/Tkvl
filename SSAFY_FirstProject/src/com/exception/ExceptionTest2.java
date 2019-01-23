package com.exception;

// 사용자 정의 exception 클래스
class MyException extends Exception{
	@Override
	public String toString() {
		return "MyException 발생~";
	}
	
}

public class ExceptionTest2 {
	public static void main(String[] args) throws Exception{
		ExceptionTest2 e = new ExceptionTest2();

		try {
			e.check(-3);	
		}catch(MyException e1) {
			e1.printStackTrace();
		}
		catch(Exception e1) {
			e1.printStackTrace();
		}
	}
	
	private void check(int i) throws Exception{
		if(i>0) {
			System.out.println("result :" + ++i);
		}else if(i==0){ // 예외상황 --> 예외 발생
			throw new Exception();
		}
		else {
			
		}
	}
}
