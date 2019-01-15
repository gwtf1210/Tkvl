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
		Frame f = new Frame(); // window 창
		Checkbox cb = new Checkbox("눌러봐", true);
		f.setLayout(new FlowLayout()); // 배치 관리자 지정
		
		Date d = new Date();
		f.add(play); // 창안에 버튼을 붙임
		f.add(cb);
		TextArea ta = new TextArea(5,20);
		TextField tf = new TextField(30);
		ta.setText(d.toString());
		
		f.add(ta);
		f.add(tf);
		f.setSize(500, 500); // 창 사이즈 꼭 지정해줘야함
		f.setVisible(true); 
		
	}
}
