package com.di.db.java;

import org.springframework.context.annotation.Bean;
// @Configuration : Spring Bean 설정 정보를 가지고 있는 클래스. context.xml 문서를 대신함
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBJavaConfig {

	// @Bean: 리턴타입의 객체가 생섬됨. <bean> 태그와 동일. 메소드 이름이 id가 됨
	@Bean
	public OracleDataServiceImpl getOracle() {
		OracleDataServiceImpl oracle = new OracleDataServiceImpl("url:com.di.db.OracleSQLDataServiceImpl",
				"driver:com.di.db.OracleDataServiceImpl");
		oracle.setId("oracle_id");
		oracle.setPass("oracle_pw");
		return oracle;
	}

	@Bean
	public MySQLDataServiceImpl getMySQL() {
		MySQLDataServiceImpl mySQL = new MySQLDataServiceImpl("url:com.di.db.MySQLDataServiceImpl",
				"driver:com.di.db.MySQLDataServiceImpl");
		mySQL.setId("mySQL_id");
		mySQL.setPass("mySQL_pw");
		return mySQL;
	}
}
