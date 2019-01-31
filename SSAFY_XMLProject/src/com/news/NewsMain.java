package com.news;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class NewsMain {
	JFrame f;
	JButton b;
	JList li;
	NewsDAOImpl dao = new NewsDAOImpl();

	public NewsMain() {
		createGUI();
		addEvent();
	}

	private void addEvent() {
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showList();
			}
		});
	}

	// dao의 메소드 호출해서 데이터 받아온 후에 그 결과를 화면(JList)에 뿌려주기
	protected void showList() {
		List<News> nList = dao.getNewsData("http://api.newswire.co.kr/rss/industry/600");

		li.removeAll();
		for (News n : nList) {
			System.out.println(n.toString());
		}
		li.setListData(nList.toArray());

	}

	private void createGUI() {
		f = new JFrame("News Info");
		b = new JButton("call News");

		li = new JList();
		JScrollPane pane = new JScrollPane(li);
		Container c = f.getContentPane();

		c.add(b, "North");
		c.add(pane, "Center");

		f.setSize(1200, 800);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new NewsMain();
	}

}
