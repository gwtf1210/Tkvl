package com.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/** client 
 *  1. Socket(ip, port) 생성
 *  2. Socket으로부터 입출력 스트램 얻어냄
 *  3. 스트림으로 메세지 전송
 *  4. Socket 닫기(close())
 *	5. 스트림 닫기
 */

public class SimpleClient {
	public static void main(String[] args) throws Exception{
		Socket client;
		InputStream in;
		DataInputStream dis; 
		
		OutputStream out; // node stream 
		DataOutputStream dos; // filter stream // byte 형식이라 한글이 깨질 수 있지만, 특별한 Method가 있음
		
		// 127.0.0.1 : loopback address
		client = new Socket("localhost", 3000); // 소켓 객체가 만들어지는 순간 서버로 접속해 들어감. 
		in = client.getInputStream();
		dis = new DataInputStream(in);
		
		out = client.getOutputStream(); 
		dos = new DataOutputStream(out); 
		
		
		String message = dis.readUTF();
		System.out.println(message);
		
		String send = "요우 베이비";
		dos.writeUTF(send); 
		
		dos.close();
		out.close();
		dis.close();
		in.close();
		client.close();
	}
}
