package com.ui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
// ��� ó�� : ��ư Ŭ��(ActionEvent)������ ó��. ActionEvent ó���ϴ� �ڵ��� --> ActionListener
// 1. Ŭ���� ����� listener ���� ǥ��
// 2. 
public class EventTest implements ActionListener{
	
	// field
	JFrame f; // â
	JButton ok, cancel; // ��ư
	JLabel label; // ȭ�� �󿡼��� ����
	
	// GUI (ȭ��) �ۼ�
	EventTest(){
		f = new JFrame("event test"); // title bar�� ���� �����鼭 â ����
		f.setLayout(new FlowLayout()); // layout manager(��ġ ������) ����. add�ϴ� ������� ȭ�鿡 ����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â �ݱ� ��ư ������ �� ���� ����. �ݱ� ��ư ������ ���α׷� ����
		
		ok = new JButton("ok");
		cancel = new JButton("cancel");
		
		// 2. ��� �߻� ��� listener ���
		ok.addActionListener(this);
		cancel.addActionListener(this);
		
		label = new JLabel("���� �⹮¯~");
		
		Container c  = f.getContentPane(); // ȭ��󿡼� ContentPane������ �˾Ƴ�
		c.add(ok);
		c.add(cancel);
		c.add(label);
		
		f.setSize(300, 300);
		f.setVisible(true);

		
	}
	
	public static void main(String[] args) {
		EventTest u = new EventTest();
	}
	
	
	// ActionListener�� ������ �ִ� �߻� �޼ҵ�
	// 3. ����� �߻����� �� listener�� �ؾ� �Ǵ� ���� ������ �ִ� �޼ҵ�
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource(); // source(����� �߻��� ���)�� �˾Ƴ�
		if( o == ok) {
			System.out.println("press me!!");	
		}else {
			System.out.println("don't press me");
		}
	}
}
