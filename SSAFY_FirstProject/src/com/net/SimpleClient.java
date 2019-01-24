package com.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/** client 
 *  1. Socket(ip, port) ����
 *  2. Socket���κ��� ����� ��Ʈ�� ��
 *  3. ��Ʈ������ �޼��� ����
 *  4. Socket �ݱ�(close())
 *	5. ��Ʈ�� �ݱ�
 */

public class SimpleClient {
	public static void main(String[] args) throws Exception{
		Socket client;
		InputStream in;
		DataInputStream dis; 
		
		OutputStream out; // node stream 
		DataOutputStream dos; // filter stream // byte �����̶� �ѱ��� ���� �� ������, Ư���� Method�� ����
		
		// 127.0.0.1 : loopback address
		client = new Socket("localhost", 3000); // ���� ��ü�� ��������� ���� ������ ������ ��. 
		in = client.getInputStream();
		dis = new DataInputStream(in);
		
		out = client.getOutputStream(); 
		dos = new DataOutputStream(out); 
		
		
		String message = dis.readUTF();
		System.out.println(message);
		
		String send = "��� ���̺�";
		dos.writeUTF(send); 
		
		dos.close();
		out.close();
		dis.close();
		in.close();
		client.close();
	}
}
