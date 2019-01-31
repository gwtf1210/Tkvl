package com.dom;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomParsing {
	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder parser;
		try {
			parser = factory.newDocumentBuilder();
			Document doc = parser.parse("xml/member.xml");
			System.out.println("well-formed xml!!!");

			// name으로 검색
			NodeList list = doc.getElementsByTagName("name");
			for (int i = 0; i < list.getLength(); i++) {
				Node each = list.item(i);
				Node child = each.getFirstChild();
				System.out.println(child.getNodeName());
				System.out.println(child.getNodeValue());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
