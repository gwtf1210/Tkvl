package com.object;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.util.Date;

public class ObjectTest {
	public static void main(String[] args) {
		Button play = new Button("play");
		Frame f = new Frame(); // window â
		Checkbox cb = new Checkbox("������", true);
		f.setLayout(new FlowLayout()); // ��ġ ������ ����
		
		Date d = new Date();
		f.add(play); // â�ȿ� ��ư�� ����
		f.add(cb);
		TextArea ta = new TextArea(5,20);
		TextField tf = new TextField(30);
		ta.setText(d.toString());
		
		f.add(ta);
		f.add(tf);
		f.setSize(500, 500); // â ������ �� �����������
		f.setVisible(true); 
		
	}
}
