package com.di.animal.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("anno.xml");

		// getBean
		Zoo paris = context.getBean("paris", Zoo.class);

		paris.Info();
	}
}
