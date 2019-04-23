package com.di.animal.java;

import org.springframework.context.annotation.Bean;
// @Configuration : Spring Bean 설정 정보를 가지고 있는 클래스. context.xml 문서를 대신함
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	// @Bean: 리턴타입의 객체가 생섬됨. <bean> 태그와 동일. 메소드 이름이 id가 됨
	@Bean
	public Tiger getTiger() {
		Tiger t = new Tiger(3);
		t.setName("joy");
		return t;
	}

	@Bean
	public Lion getLion() {
		Lion l = new Lion(2);
		l.setName("molly");
		return l;
	}

	@Bean
	public TokyoZoo getTokyoZoo() {
		TokyoZoo zoo = new TokyoZoo();
		zoo.setLion(getLion());
		zoo.setTiger(getTiger());
		return zoo;
	}
}
