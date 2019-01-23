package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CharacterStreamTest {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		File f = File.createTempFile("sample", ".java");
		System.out.println(f);
		
		// 16~27 : 파일에 쓰기 작업
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("안녕하세요?");
		bw.newLine();
		bw.write("빨리");
		bw.newLine();
		bw.write("집에 가고 싶다.");
		bw.newLine();
		
		bw.close();
		fw.close();
		
		//30~37 : 파일에서 읽어오기
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		for (String str; (str = br.readLine()) != null;) {
			System.out.println(str);
		}
		
		br.close();
		fr.close();
			
	}
}
