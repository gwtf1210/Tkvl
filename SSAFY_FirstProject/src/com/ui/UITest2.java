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
	JFrame f; // â
	JButton ok, cancel; // ��ư
	JTextField tf; // ���� �Է�ĭ
	JTextArea ta; // ������ �Է�ĭ. ��ũ�ѹٰ� ��Ÿ������ JScrollPane�� ����ؾ���
	JLabel label; // ȭ�� �󿡼��� ����
	
	// GUI (ȭ��) �ۼ�
	UITest2(){
		f = new JFrame("swing test"); // title bar�� ���� �����鼭 â ����
		f.setLayout(new BorderLayout()); // layout manager(��ġ ������) ����. add�ϴ� ������� ȭ�鿡 ����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â �ݱ� ��ư ������ �� ���� ����. �ݱ� ��ư ������ ���α׷� ����

		ok = new JButton("ok");
		cancel = new JButton("cancel");
		label = new JLabel("���� �⹮¯~");
		tf = new JTextField(30);
		ta = new JTextArea(5, 30);
		JScrollPane pane = new JScrollPane(ta);
		Container c  = f.getContentPane(); // ȭ��󿡼� ContentPane������ �˾Ƴ�
		
		c.add(ok, "East"); // ù��° ���� �ݵ�� �빮��
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
