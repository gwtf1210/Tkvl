package com.sax;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

// sax parsing : event(시작태그 만날 때, text 만날 때, 닫는 태그 만날 때) 발생시마다 처리하는 방식
public class SaxParsing extends DefaultHandler {

	public static void main(String[] args) throws Exception {
		SaxParsing p = new SaxParsing();
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		FindBookEventHandler h = new FindBookEventHandler("title");
		FindBookEventHandler h2 = new FindBookEventHandler("author", "이규미");
		parser.parse("xml/book.xml", h);
	}

	// 엘리먼트가 시작될 때
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals("booklist")) {
			System.out.println("<booklist>");
		} else if (qName.equals("book")) {
			System.out.println("<book kind=" + attributes.getValue(0) + ">");
		} else if (qName.equals("isbn")) {
			System.out.print("<isbn>");
		} else if (qName.equals("title")) {
			System.out.print("<title>");
		} else if (qName.equals("author")) {
			System.out.print("<author>");
		} else if (qName.equals("publisher")) {
			System.out.print("<publisher>");
		} else if (qName.equals("price")) {
			System.out.print("<price>");
		}
	}

	// 엘리먼트가 끝날 때
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String str = new String(ch, start, length).trim();
		System.out.print(str);
	}

	// Text 만날 때
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equals("booklist")) {
			System.out.println("</booklist>");
		} else if (qName.equals("isbn")) {
			System.out.println("</isbn>");
		} else if (qName.equals("book")) {
			System.out.println("</book>");
		} else if (qName.equals("title")) {
			System.out.println("</title>");
		} else if (qName.equals("author")) {
			System.out.println("</author>");
		} else if (qName.equals("publisher")) {
			System.out.println("</publisher>");
		} else if (qName.equals("price")) {
			System.out.println("</price>");
		}
	}

	@Override
	public void startDocument() throws SAXException { // 문서가 시작될 때
		System.out.println("문서 시작~");
	}

	@Override
	public void endDocument() throws SAXException { // 문서가 끝날 때
		System.out.println("문서 끝~");
	}

}
