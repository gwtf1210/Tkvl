package com.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/** server 
 *  1. ServerSocket(port) ����
 *  2. ServerSocket.accept() : Ŭ���̾�Ʈ�� �����ؿ��⸦ ��ٷȴٰ� �޴� �޼ҵ� --> Socket�� ����(Client)
 *  3. Socket���κ��� ����� ��Ʈ�� ��
 *  4. ��Ʈ������ �޼��� ���� 
 *  5. Socket �ݱ� (close())
 *  6. ��Ʈ�� �ݱ�
 */

public class SimpleServer {
	
	public static void main(String[] args) throws Exception {
		ServerSocket server; // ���� ���� ��ü
		Socket client; // ������ ������ ���� Ŭ���̾�Ʈ�� ���� ��ü
		OutputStream out; // node stream 
		DataOutputStream dos; // filter stream // byte �����̶� �ѱ��� ���� �� ������, Ư���� Method�� ����
		
		InputStream in;
		DataInputStream dis; 

		String message = "hello, �⹮��";
		
		server = new ServerSocket(3000); // 3000�� ��Ʈ���� ����
		System.out.println("Ŭ���̾�Ʈ�� ��ٸ��� ��...");
		client = server.accept(); // Ŭ���̾�Ʈ�� ������ �ö����� ��ٷǴٰ� Ŭ���̾�Ʈ�� ����. block �Ǵ� Ư¡
		System.out.println("Ŭ���̾�Ʈ ����!"); 
		
		// ���
		out = client.getOutputStream(); // 
		dos = new DataOutputStream(out); // 
		
		// �Է�
		in = client.getInputStream();
		dis = new DataInputStream(in);
		
		dos.writeUTF(message); // Unicode Method�� ����
		
		message = dis.readUTF();
		System.out.println(message);
		
		dis.close();
		in.close();
		
		dos.close();
		out.close();
		client.close();
		server.close();
	}
}
