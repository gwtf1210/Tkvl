package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CardSave {
	
	public static void main(String[] args) throws Exception{
		Card c = new Card(12345,"tommy");
		Car car = new Car();
		car.setNum(999);
		car.setColor("blue");
		car.setYear(2019);
		
		// 스트림을 사용한 객체 저장
		FileOutputStream fos = new FileOutputStream("save.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos); // filter
		oos.writeObject(c);
		oos.writeObject(car);
		
		oos.close();
		fos.close();
		
		//스트림을 통한 객체 읽기
		FileInputStream fis = new FileInputStream("save.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Card cc = (Card)ois.readObject();
		Car car2 = (Car)ois.readObject();

		System.out.println(car2.getNum());
		System.out.println(car2.getColor());
		System.out.println(car2.getYear());
		
		System.out.println(cc.getNum());
		System.out.println(cc.getName());
		
		ois.close();
		fis.close();
	}
}
