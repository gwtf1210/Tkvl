package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileTest {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("test.txt");	
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
