package com.ui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UITest {
	
	// field
	JFrame f; // 창
	JButton ok, cancel; // 버튼
	JLabel label; // 화면 상에서의 글자
	
	// GUI (화면) 작성
	UITest(){
		f = new JFrame("swing test"); // title bar에 글자 넣으면서 창 생성
		f.setLayout(new FlowLayout()); // layout manager(배치 관리자) 지정. add하는 순서대로 화면에 붙음
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫기 버튼 눌렀을 때 할일 지정. 닫기 버튼 누르면 프로그램 종료
		
		ok = new JButton("ok");
		cancel = new JButton("cancel");
		label = new JLabel("하이 기문짱~");
		
		Container c  = f.getContentPane(); // 화면상에서 ContentPane영역을 알아냄
		c.add(ok);
		c.add(cancel);
		c.add(label);
		
		f.setSize(300, 300);
		f.setVisible(true);

		
	}
	
	public static void main(String[] args) {
		UITest u = new UITest();
		
		
	}
}
