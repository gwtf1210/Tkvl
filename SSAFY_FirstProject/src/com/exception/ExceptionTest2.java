package com.exception;

// ����� ���� exception Ŭ����
class MyException extends Exception{
	@Override
	public String toString() {
		return "MyException �߻�~";
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
		}else if(i==0){ // ���ܻ�Ȳ --> ���� �߻�
			throw new Exception();
		}
		else {
			
		}
	}
}
