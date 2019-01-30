package com.inner;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class UITest3 {
	// field
	JFrame f; // â
	JButton ok, cancel; // ��ư
	JTextField tf; // ���� �Է�ĭ
	JTextArea ta; // ������ �Է�ĭ. ��ũ�ѹٰ� ��Ÿ������ JScrollPane�� ����ؾ���
	JLabel label; // ȭ�� �󿡼��� ����
//	JList, JTextArea, JTable --> JScrollPane�����÷�������
	JList list; // ����Ʈ
	String[] season = {"spring", "summer", "fall", "winter"};
	
	// GUI (ȭ��) �ۼ�
	UITest3(){
		f = new JFrame("swing test"); // title bar�� ���� �����鼭 â ����
		f.setLayout(new FlowLayout()); // layout manager(��ġ ������) ����. add�ϴ� ������� ȭ�鿡 ����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â �ݱ� ��ư ������ �� ���� ����. �ݱ� ��ư ������ ���α׷� ����

		list = new JList<>();
		list.setListData(season); // ���迡 ����
		JScrollPane pane3 = new JScrollPane(list);
		list.setVisibleRowCount(3);
		list.addListSelectionListener(new ListSelectionListener() { // ���迡 ����
			@Override
			public void valueChanged(ListSelectionEvent e) {
				int index = list.getSelectedIndex();
				String val = (String)list.getSelectedValue();
				System.out.println(val);
				
			}
		});
		
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
		c.add(pane3, "Center");
		c.add(tf, "South");
		
		f.setSize(300, 300);
		f.setVisible(true);

		
	}
	
	public static void main(String[] args) {
		UITest3 u = new UITest3();
		
		
	}
}
