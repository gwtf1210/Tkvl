package com.mybatis.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mybatis.service.BoardService;
import com.mybatis.vo.Board;

public class BoardApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("customer.xml");

		BoardService service = context.getBean("bservice", BoardService.class);

		List<Board> list = service.selectAll();
		for (Board b : list) {
			System.out.println(b.getNum() + " : " + b.getPass() + " : " + b.getName() + " : " + b.getWdate() + " : "
					+ b.getTitle() + " : " + b.getContent() + " : " + b.getCount());
		}
		System.out.println();

		Board b = service.selectOne("22");
		System.out.println(b.getNum() + " : " + b.getPass() + " : " + b.getName() + " : " + b.getWdate() + " : "
				+ b.getTitle() + " : " + b.getContent() + " : " + b.getCount());
		System.out.println();

//		service.insert(new Board("", "guest", "gimun~~~", "", "게시판 연습130", "게시판연습입니다.", ""));
//		b = service.selectOne("25");
//		System.out.println(b.getNum() + " : " + b.getPass() + " : " + b.getName() + " : " + b.getWdate() + " : "
//				+ b.getTitle() + " : " + b.getContent() + " : " + b.getCount());
//		System.out.println();
//
//		service.delete("24");
//		list = service.selectAll();
//		for (Board b1 : list) {
//			System.out.println(b1.getNum() + " : " + b1.getPass() + " : " + b1.getName() + " : " + b1.getWdate() + " : "
//					+ b1.getTitle() + " : " + b1.getContent() + " : " + b1.getCount());
//		}
//		System.out.println();
	}
}
