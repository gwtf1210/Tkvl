package com.di.animal.anno;

import javax.annotation.Resource;

// @Autowired : 타입 기준으로 객체를 자동 주입
import org.springframework.beans.factory.annotation.Autowired;
// @Qualifier("[XML ID]") 로 설정하면 변수명과 XML id가 같지 않아도 된다.
import org.springframework.beans.factory.annotation.Qualifier;
// @Component:빈 객체 생성
import org.springframework.stereotype.Component;

@Component("paris")
public class ParisZoo implements Zoo {

	@Autowired
	@Qualifier("tiger")
	Tiger tiger3; // 변수명과 xml 상의 id가 같아야한다.

	// @Resource : 이름 기준으로 주입(이름이 없으면 타입기준, 타입이 여러개면 이름기준)
	@Resource(name = "lion9")
	Lion lion;

	@Override
	public void Info() {
		tiger3.info();
		lion.info();
	}
}
