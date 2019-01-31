package com.dom;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParsing2 {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder parser = factory.newDocumentBuilder();
		Document doc = parser.parse("xml/member.xml");

		// NAME, ADDRESS 검색
		NodeList list = doc.getElementsByTagName("member");
		for (int i = 0; i < list.getLength(); i++) {
			Node member = list.item(i); // member 한 사람 정보
			NodeList child = member.getChildNodes();

			for (int j = 0; j < child.getLength(); j++) {
				Node one = child.item(j);
				String name = one.getNodeName();
				if (name.equals("name")) {
					// 이름 출력
					System.out.println(one.getFirstChild().getNodeValue());
				} else if (name.equals("address")) {
					// 주소 출력
					System.out.println(one.getFirstChild().getNodeValue());
					System.out.println();
				}
			}
		}
	}
}
