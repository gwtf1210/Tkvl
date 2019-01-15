package com.array;

public class MethodTest2 {

	public static void pringGreeting(String name) {
		System.out.println(name + " be happy!");
	}
	
	public static String greeting(String name) {
		return (name + " welcome!");
	}

	public static boolean reverse(boolean tf) {
		// !tf
		return tf?false:true;
	}
	
	public static String result(boolean tf1, boolean tf2) {
		return (tf1 && tf2)?"ok":"cancel";
	}
	
	public static void loopString(int count, String msg) {
		for(int i=0;i<count;i++) {
			System.out.println(msg);
		}
	}
	
	public static double getArea(int r) {
		return (3.14*r*r);
	}
	
	public static void printCircum(int r) {
		System.out.println((2*3.14*r));
	}
	
	public static int[] makeArray(int len) {
		return new int[len];
	}
	
	public static void total(int[] data) {
		int sum = 0;
		for(int each : data) {
			sum += each;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		System.out.print("printGreeting(\"Ricky\") >> ");
		pringGreeting("Ricky");
		
		System.out.print("greeting(\"Ricky\") >> ");
		System.out.println(greeting("Ricky"));
		
		System.out.print("reverse(true) >> ");
		System.out.println(reverse(true));
		
		System.out.print("result(true,false) >> ");
		System.out.println(result(true,false));
		
		System.out.print("loopString(5,\"Ricky\") >> ");
		loopString(5,"Ricky");
		
		System.out.print("getArea(5) >> ");
		System.out.println(getArea(5));
		
		System.out.print("printCircum(6) >> ");
		printCircum(6);
		
		System.out.print("makeArray(6) >> ");
		System.out.println(makeArray(6));
		
		int data[] = {10,28,30,50,90,123,450,66,67};
		System.out.print("total(data) >> ");
		total(data);
	}

}
