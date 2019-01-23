package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
	public static void main(String[] args) throws Exception{
		FileInputStream fis; // 파일로부터 내용을 입력받는 스트림
		FileOutputStream fos; // 파일에 내용을 쓰는 스트림
		
		fis = new FileInputStream(args[0]); // 원본파일
		fos = new FileOutputStream(args[1]); // 복사될 파일
		
		for (int i; (i = fis.read()) != -1;) {
			System.out.println(i);
			fos.write(i); // 해당 코드에 일치하는 글자
		}
		
		// 스트림 닫기
		fis.close();
		fos.close();
		
		System.out.println("file copied...");
	}
}
