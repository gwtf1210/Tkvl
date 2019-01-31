package com.sax;

import java.util.HashMap;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class FindBookEventHandler extends DefaultHandler {
	/// Field
	private boolean isBook, istitle, isauthor, isPrice;
	private String condition, keyWord;
	private HashMap hash;
	private Attributes attributes;

	/// Constructor
	public FindBookEventHandler(String condition) {
		this.condition = condition;// 검색기준 엘리먼트
		this.hash = new HashMap();
	}

	public FindBookEventHandler(String condition, String keyWord) {
		this.condition = condition; // 검색기준 엘리먼트
		this.keyWord = keyWord;// 검색 문자열
		this.hash = new HashMap();// 검색 내용을 저장할 HashMap 객체
	}

	/// Method
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals("book")) {
			isBook = true;
		} else if (qName.equals("title")) {
			istitle = true;
		} else if (qName.equals("author")) {
			isauthor = true;
		} else if (qName.equals("price")) {
			isPrice = true;
		}
	}

	public void characters(char[] ch, int start, int length) throws SAXException {
		String str = new String(ch, start, length).trim();
		if (istitle) {
			hash.put("title", str);
			istitle = false;
		} else if (isauthor) {
			hash.put("author", str);
			isauthor = false;
		} else if (isPrice) {
			hash.put("price", str);
			isPrice = false;
		}
	}

	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equals("book")) {// 책 한권이 끝날때만
			if (condition.equals("author")) {
				String val = (String) hash.get("author");
				if (val.equals(keyWord)) {
					displayBookInfo();
				}
			}
			if (condition.equals("title")) {
				String val = (String) hash.get("title");
				if (val.equals(keyWord)) {
					displayBookInfo();
				}
			}
			if (keyWord == null) {
				displayBookInfo();
			}
//			hash.clear(); // 덮어쓰기 되므로 상관 없음
		}
	}

	public void displayBookInfo() {
		System.out.println("title: " + (String) hash.get("title"));
		System.out.println("author: " + (String) hash.get("author"));
		System.out.println("price: " + (String) hash.get("price"));
		System.out.println("----------------------");
	}
	/*
	 * public void warning(SAXParseException exception) throws SAXException { throw
	 * new SAXException("warning 이벤트 처리"); }
	 * 
	 * public void error(SAXParseException exception) throws SAXException {
	 * System.out.println("DTD 또는 XML Schema 문서 구조에 위배됩니다.");
	 * System.out.println("유효하지 않는 문서 입니다."); throw new
	 * SAXException("error 이벤트 처리"); }
	 * 
	 * public void fatalError(SAXParseException exception) throws SAXException {
	 * System.out.println("XML 권고안의 내용을 지키지 않았습니다.");
	 * System.out.println("잘 짜여진 XML 문서가 아닙니다."); throw new
	 * SAXException("fatalError 이벤트 처리"); }
	 */
}