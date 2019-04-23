package com.mybatis.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mybatis.dao.BoardDAO;
import com.mybatis.vo.Board;

public class BoardApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("customer.xml");

		BoardDAO dao = context.getBean("boa", BoardDAO.class);

		List<Board> list = dao.selectAll();
		for (Board b : list) {
			System.out.println(b.getNum() + " : " + b.getPass() + " : " + b.getName() + " : " + b.getWdate() + " : "
					+ b.getTitle() + " : " + b.getContent() + " : " + b.getCount());
		}
		System.out.println();

		Board b = dao.selectOne("22");
		System.out.println(b.getNum() + " : " + b.getPass() + " : " + b.getName() + " : " + b.getWdate() + " : "
				+ b.getTitle() + " : " + b.getContent() + " : " + b.getCount());
		System.out.println();

		dao.insert(new Board("", "guest", "gimun~~~", "", "게시판 연습130", "게시판연습입니다.", ""));
		b = dao.selectOne("23");
		System.out.println(b.getNum() + " : " + b.getPass() + " : " + b.getName() + " : " + b.getWdate() + " : "
				+ b.getTitle() + " : " + b.getContent() + " : " + b.getCount());
		System.out.println();

		dao.delete("23");
		list = dao.selectAll();
		for (Board b1 : list) {
			System.out.println(b1.getNum() + " : " + b1.getPass() + " : " + b1.getName() + " : " + b1.getWdate() + " : "
					+ b1.getTitle() + " : " + b1.getContent() + " : " + b1.getCount());
		}
		System.out.println();
	}
}
