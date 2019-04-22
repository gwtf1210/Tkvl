package com.di.db;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.di.collection.MyCollection;
import com.di.collection.MyCollectionImpl;

public class DatabaseApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("db.xml");

		// getBean
		DataService mySQL = context.getBean("mySQLDataService", MySQLDataServiceImpl.class);
		mySQL.info();
		
		DataService oracle = context.getBean("oracleDataService",OracleDataServiceImpl.class);
		oracle.info();
	}
}
