package com.di.db.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DatabaseApp {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(DBJavaConfig.class);

		// getBean
		DataService mySQL = context.getBean("getMySQL", DataService.class);
		DataService oracle = context.getBean("getOracle", DataService.class);

		mySQL.info();
		oracle.info();
	}
}
