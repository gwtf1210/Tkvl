package com.ui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UITest {
	
	// field
	JFrame f; // â
	JButton ok, cancel; // ��ư
	JLabel label; // ȭ�� �󿡼��� ����
	
	// GUI (ȭ��) �ۼ�
	UITest(){
		f = new JFrame("swing test"); // title bar�� ���� �����鼭 â ����
		f.setLayout(new FlowLayout()); // layout manager(��ġ ������) ����. add�ϴ� ������� ȭ�鿡 ����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â �ݱ� ��ư ������ �� ���� ����. �ݱ� ��ư ������ ���α׷� ����
		
		ok = new JButton("ok");
		cancel = new JButton("cancel");
		label = new JLabel("���� �⹮¯~");
		
		Container c  = f.getContentPane(); // ȭ��󿡼� ContentPane������ �˾Ƴ�
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
