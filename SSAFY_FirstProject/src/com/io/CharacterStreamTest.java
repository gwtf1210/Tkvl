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
		
		// 16~27 : ���Ͽ� ���� �۾�
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("�ȳ��ϼ���?");
		bw.newLine();
		bw.write("����");
		bw.newLine();
		bw.write("���� ���� �ʹ�.");
		bw.newLine();
		
		bw.close();
		fw.close();
		
		//30~37 : ���Ͽ��� �о����
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		for (String str; (str = br.readLine()) != null;) {
			System.out.println(str);
		}
		
		br.close();
		fr.close();
			
	}
}
