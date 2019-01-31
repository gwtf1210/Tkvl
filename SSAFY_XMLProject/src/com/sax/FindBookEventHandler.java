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
		this.condition = condition;// �˻����� ������Ʈ
		this.hash = new HashMap();
	}

	public FindBookEventHandler(String condition, String keyWord) {
		this.condition = condition; // �˻����� ������Ʈ
		this.keyWord = keyWord;// �˻� ���ڿ�
		this.hash = new HashMap();// �˻� ������ ������ HashMap ��ü
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
		if (qName.equals("book")) {// å �ѱ��� ��������
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
//			hash.clear(); // ����� �ǹǷ� ��� ����
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
	 * new SAXException("warning �̺�Ʈ ó��"); }
	 * 
	 * public void error(SAXParseException exception) throws SAXException {
	 * System.out.println("DTD �Ǵ� XML Schema ���� ������ ����˴ϴ�.");
	 * System.out.println("��ȿ���� �ʴ� ���� �Դϴ�."); throw new
	 * SAXException("error �̺�Ʈ ó��"); }
	 * 
	 * public void fatalError(SAXParseException exception) throws SAXException {
	 * System.out.println("XML �ǰ���� ������ ��Ű�� �ʾҽ��ϴ�.");
	 * System.out.println("�� ¥���� XML ������ �ƴմϴ�."); throw new
	 * SAXException("fatalError �̺�Ʈ ó��"); }
	 */
}