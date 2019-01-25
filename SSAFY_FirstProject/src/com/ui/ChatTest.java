package com.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatTest implements ActionListener, KeyListener{
	// field
	JFrame f; // â
	JButton ok, cancel; // ��ư
	JTextField tf; // ���� �Է�ĭ
	JTextArea ta; // ������ �Է�ĭ. ��ũ�ѹٰ� ��Ÿ������ JScrollPane�� ����ؾ���
	JLabel label; // ȭ�� �󿡼��� ����
	
	// GUI (ȭ��) �ۼ�
	ChatTest(){
		f = new JFrame("chat test"); // title bar�� ���� �����鼭 â ����
		f.setLayout(new BorderLayout()); // layout manager(��ġ ������) ����. add�ϴ� ������� ȭ�鿡 ����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â �ݱ� ��ư ������ �� ���� ����. �ݱ� ��ư ������ ���α׷� ����

		ok = new JButton("����");
		cancel = new JButton("cancel");
		label = new JLabel("Chat Test", JLabel.CENTER);
		Font font = new Font("�������", Font.BOLD, 30);
		label.setFont(font);
		
		tf = new JTextField(25);
		ta = new JTextArea(5, 30);
	
		ok.addActionListener(this);
		tf.addKeyListener(this);
		
		ta.setEditable(false); // �����ȵ�
		ta.setBackground(Color.CYAN); 
		
		JPanel panel = new JPanel(new FlowLayout()); // container. ���ο� �ٸ� ȭ�� ������Ҹ� ���� �� ����
		panel.add(tf);
		panel.add(ok);
		
		JScrollPane pane = new JScrollPane(ta); // Test Area�� �ݵ�� ScorllPane�� �־����.
		Container c  = f.getContentPane(); // ȭ��󿡼� ContentPane������ �˾Ƴ�
		
		c.add(label, "North");
		c.add(pane, "Center");
		c.add(panel, "South");
		
		
		f.setSize(400, 500);
		f.setVisible(true);

		
	}
	
	public static void main(String[] args) {
		ChatTest u = new ChatTest();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		
		if(o == ok) { // ����������, �ؽ�Ʈ �����ְ�, ���� ���̱�
			ta.append(tf.getText() +"\n");
			tf.setText("");
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER){
			ta.append( tf.getText() +"\n");
			tf.setText("");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
