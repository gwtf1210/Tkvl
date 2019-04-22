package com.di.animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("animal.xml");

		// getBean
		Zoo londonZoo = context.getBean("londonZoo", Zoo.class);
		Zoo seoulZoo = context.getBean("seoulZoo", Zoo.class);
		
		londonZoo.Info();
		seoulZoo.Info();
	}
}
