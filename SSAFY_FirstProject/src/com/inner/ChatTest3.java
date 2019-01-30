package com.inner;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatTest3 extends MouseAdapter implements MouseMotionListener{
	// field
	JFrame f; // 창
	JButton ok, cancel; // 버튼
	JTextField tf; // 한줄 입력칸
	JTextArea ta; // 여러줄 입력칸. 스크롤바가 나타나도록 JScrollPane을 사용해야함
	JLabel label; // 화면 상에서의 글자
	
	// GUI (화면) 작성
	ChatTest3(){
		f = new JFrame("chat test"); // title bar에 글자 넣으면서 창 생성
		f.setLayout(new BorderLayout()); // layout manager(배치 관리자) 지정. add하는 순서대로 화면에 붙음
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫기 버튼 눌렀을 때 할일 지정. 닫기 버튼 누르면 프로그램 종료
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// STREAM 닫기
				// SOCKET 닫기
				System.out.println("bye!!");
			}
		});
		
		f.addMouseListener(this);
		f.addMouseMotionListener(this);
		
		ok = new JButton("전송");
		cancel = new JButton("cancel");
		label = new JLabel("Chat Test", JLabel.CENTER);
		Font font = new Font("맑은고딕", Font.BOLD, 30);
		label.setFont(font);
		
		tf = new JTextField(25);
		ta = new JTextArea(5, 30);
	
		ta.setEditable(false); // 편집안됨
		ta.setBackground(Color.CYAN); 
		
		JPanel panel = new JPanel(new FlowLayout()); // container. 내부에 다른 화면 구성요소를 담을 수 있음
		panel.add(tf);
		panel.add(ok);
		
		JScrollPane pane = new JScrollPane(ta); // Test Area는 반드시 ScorllPane이 있어야함.
		Container c  = f.getContentPane(); // 화면상에서 ContentPane영역을 알아냄
		
		c.add(label, "North");
//		c.add(pane, "Center");
		c.add(panel, "South");
		
		f.setSize(400, 500);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		ChatTest3 u = new ChatTest3();
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouse clicked...");		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouse entered...");		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouse exited...");		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mouse pressed...");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouse released...");
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		tf.setText(e.getX() + " : " + e.getY());
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("mouse moved...");
	}
	
}
