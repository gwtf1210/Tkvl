package com.ui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UITest2 {
	// field
	JFrame f; // 창
	JButton ok, cancel; // 버튼
	JTextField tf; // 한줄 입력칸
	JTextArea ta; // 여러줄 입력칸. 스크롤바가 나타나도록 JScrollPane을 사용해야함
	JLabel label; // 화면 상에서의 글자
	
	// GUI (화면) 작성
	UITest2(){
		f = new JFrame("swing test"); // title bar에 글자 넣으면서 창 생성
		f.setLayout(new BorderLayout()); // layout manager(배치 관리자) 지정. add하는 순서대로 화면에 붙음
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫기 버튼 눌렀을 때 할일 지정. 닫기 버튼 누르면 프로그램 종료

		ok = new JButton("ok");
		cancel = new JButton("cancel");
		label = new JLabel("하이 기문짱~");
		tf = new JTextField(30);
		ta = new JTextArea(5, 30);
		JScrollPane pane = new JScrollPane(ta);
		Container c  = f.getContentPane(); // 화면상에서 ContentPane영역을 알아냄
		
		c.add(ok, "East"); // 첫번째 글자 반드시 대문자
		c.add(cancel, "West");
		c.add(label, "North");
		c.add(pane, "Center");
		c.add(tf, "South");
		
		f.setSize(300, 300);
		f.setVisible(true);

		
	}
	
	public static void main(String[] args) {
		UITest2 u = new UITest2();
		
		
	}
}
