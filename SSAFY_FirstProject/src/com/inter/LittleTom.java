package com.inter;

class Tom{
	int age = 50;
}

interface Hillary{
	int age = 46;
}

public class LittleTom extends Tom implements Hillary{
	int age = 20;
	
	private void test() {
		// Hillary.age = 40; // 인터페이스 안의 변수는 final이므로 수정하지 못함
		System.out.println(age); // 20
		System.out.println(this.age); // 20
		System.out.println(super.age); // 20
		System.out.println(Hillary.age); // 20
	}
	
	public static void main(String[] args) {
		LittleTom little = new LittleTom();
		little.test();
		
		
		
		if(little instanceof Tom)
			System.out.println("instanceof Tom");

		if(little instanceof Hillary)
			System.out.println("instanceof Hillary");
		
		if(little instanceof LittleTom)
			System.out.println("instanceof LittleTom");

		if(little instanceof Object)
			System.out.println("instanceof Object");
		
//		if(little instanceof Bill)
//			System.out.println("instanceof Tom");
	}

}
