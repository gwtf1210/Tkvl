package com.inner;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
// 사건 처리 : 버튼 클릭(ActionEvent)했을때 처리. ActionEvent 처리하는 핸들자 --> ActionListener
// 1. 클래스 선언시 listener 구현 표시
// 2. 
public class EventTest2 implements ActionListener{
	
	// field
	JFrame f; // 창
	JButton ok, cancel; // 버튼
	JLabel label; // 화면 상에서의 글자
	
	// GUI (화면) 작성
	EventTest2(){
		f = new JFrame("event test"); // title bar에 글자 넣으면서 창 생성
		f.setLayout(new FlowLayout()); // layout manager(배치 관리자) 지정. add하는 순서대로 화면에 붙음
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫기 버튼 눌렀을 때 할일 지정. 닫기 버튼 누르면 프로그램 종료
		
		ok = new JButton("ok");
		cancel = new JButton("cancel");
		
		// 2. 사건 발생 대상에 listener 등록
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("press me!!");	
			}
		});
		
		cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("don't press me");
			}
		});
		
		label = new JLabel("하이 기문짱~");
		
		Container c  = f.getContentPane(); // 화면상에서 ContentPane영역을 알아냄
		c.add(ok);
		c.add(cancel);
		c.add(label);
		
		f.setSize(300, 300);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		EventTest2 u = new EventTest2();
	}
	
	// ActionListener가 가지고 있는 추상 메소드
	// 3. 사건이 발생했을 때 listener가 해야 되는 일을 가지고 있는 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
