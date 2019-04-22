package com.di.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collection.xml");
		
		// getBean
		MyCollection myCollection = context.getBean("col", MyCollectionImpl.class);
		
		// service method - 4개
		myCollection.arrayInfo();
		myCollection.listInfo();
		myCollection.setInfo();
		myCollection.mapInfo();
	}
}
