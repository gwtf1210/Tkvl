package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
	public static void main(String[] args) throws Exception{
		FileInputStream fis; // ���Ϸκ��� ������ �Է¹޴� ��Ʈ��
		FileOutputStream fos; // ���Ͽ� ������ ���� ��Ʈ��
		
		fis = new FileInputStream(args[0]); // ��������
		fos = new FileOutputStream(args[1]); // ����� ����
		
		for (int i; (i = fis.read()) != -1;) {
			System.out.println(i);
			fos.write(i); // �ش� �ڵ忡 ��ġ�ϴ� ����
		}
		
		// ��Ʈ�� �ݱ�
		fis.close();
		fos.close();
		
		System.out.println("file copied...");
	}
}
