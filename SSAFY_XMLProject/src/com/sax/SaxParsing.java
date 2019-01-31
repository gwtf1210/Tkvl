package com.sax;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

// sax parsing : event(�����±� ���� ��, text ���� ��, �ݴ� �±� ���� ��) �߻��ø��� ó���ϴ� ���
public class SaxParsing extends DefaultHandler {

	public static void main(String[] args) throws Exception {
		SaxParsing p = new SaxParsing();
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		FindBookEventHandler h = new FindBookEventHandler("title");
		FindBookEventHandler h2 = new FindBookEventHandler("author", "�̱Թ�");
		parser.parse("xml/book.xml", h);
	}

	// ������Ʈ�� ���۵� ��
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

	// ������Ʈ�� ���� ��
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String str = new String(ch, start, length).trim();
		System.out.print(str);
	}

	// Text ���� ��
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
	public void startDocument() throws SAXException { // ������ ���۵� ��
		System.out.println("���� ����~");
	}

	@Override
	public void endDocument() throws SAXException { // ������ ���� ��
		System.out.println("���� ��~");
	}

}
