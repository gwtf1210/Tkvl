package com.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/** server 
 *  1. ServerSocket(port) 생성
 *  2. ServerSocket.accept() : 클라이언트가 접속해오기를 기다렸다가 받는 메소드 --> Socket이 들어옴(Client)
 *  3. Socket으로부터 입출력 스트림 얻어냄
 *  4. 스트림으로 메세지 전송 
 *  5. Socket 닫기 (close())
 *  6. 스트림 닫기
 */

public class SimpleServer {
	
	public static void main(String[] args) throws Exception {
		ServerSocket server; // 서버 역할 객체
		Socket client; // 서버로 접속해 들어온 클라이언트를 받을 객체
		OutputStream out; // node stream 
		DataOutputStream dos; // filter stream // byte 형식이라 한글이 깨질 수 있지만, 특별한 Method가 있음
		
		InputStream in;
		DataInputStream dis; 

		String message = "hello, 기문쓰";
		
		server = new ServerSocket(3000); // 3000번 포트에서 실행
		System.out.println("클라이언트를 기다리는 중...");
		client = server.accept(); // 클라이언트가 접속해 올때까지 기다렷다가 클라이언트를 받음. block 되는 특징
		System.out.println("클라이언트 접속!"); 
		
		// 출력
		out = client.getOutputStream(); // 
		dos = new DataOutputStream(out); // 
		
		// 입력
		in = client.getInputStream();
		dis = new DataInputStream(in);
		
		dos.writeUTF(message); // Unicode Method가 있음
		
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
