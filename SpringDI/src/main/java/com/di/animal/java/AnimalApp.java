package com.di.animal.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnimalApp {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		// getBean
		Zoo tokyo = context.getBean("getTokyoZoo", Zoo.class);
		tokyo.Info();
	}
}
