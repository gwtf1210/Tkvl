package com.news;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class NewsDAOImpl implements NewsDAO {
	DocumentBuilderFactory factory;
	DocumentBuilder parser;
	ArrayList<News> nList;

	public NewsDAOImpl() {
		try {
			factory = DocumentBuilderFactory.newInstance();
			parser = factory.newDocumentBuilder();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<News> getNewsData(String url) {
		nList = new ArrayList<>();
		Document doc = null;
		try {
			doc = parser.parse(url);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		NodeList list = doc.getElementsByTagName("item");
		for (int i = 0; i < list.getLength(); i++) {
			Node news = list.item(i); // 기사 1건
			NodeList child = news.getChildNodes(); // 기사 1건의 모든 자식 노드 알아내기
			News each = new News();

			for (int j = 0; j < child.getLength(); j++) {
				Node one = child.item(j);
				String name = one.getNodeName();
				if (name.equals("title")) {
					each.setTitle(one.getFirstChild().getNodeValue());
				} else if (name.equals("pubDate")) {
					each.setPubDate(one.getFirstChild().getNodeValue());
				}
			}
			nList.add(each);
		}
		return nList;
	}
}