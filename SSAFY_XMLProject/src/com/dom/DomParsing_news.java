package com.dom;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParsing_news {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder parser = factory.newDocumentBuilder();
		Document doc = parser.parse("http://api.newswire.co.kr/rss/industry/600");
		
		//NAME, ADDRESS �˻�
		NodeList list = doc.getElementsByTagName("item");
		for (int i = 0; i < list.getLength(); i++) {
			Node member = list.item(i); // ��� 1��
			NodeList child = member.getChildNodes(); // ��� 1���� ��� �ڽ� ��� �˾Ƴ���
			
			for (int j = 0; j < child.getLength(); j++) {
				Node one = child.item(j);
				String name = one.getNodeName();
				if(name.equals("title")) {
					// �̸� ���
					System.out.println(one.getFirstChild().getNodeValue());
				}else if(name.equals("pubDate")) {
					// �ּ� ���
					System.out.println(one.getFirstChild().getNodeValue()); 
					System.out.println();
				}
			}	
		}	
	}
}
