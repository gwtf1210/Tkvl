package com.util;

import java.util.HashMap;

public class HashMapTest {
//	key, value 구조로 데이터를 저장함
//	key를 기준으로 데이터를 찾으므로 key가 중복되면 안됨
//	순서 x, 중복 x
	
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		
		map.put("num", "123");
		map.put("name", "tommy"); // 덮어쓰기 됨, key가 중복됐으므로
		map.put("address", "seoul");
		map.put("name", "bill");
		
		String val = map.get("num");
		System.out.println(val);
		
		val = map.get("name");
		System.out.println(val);
		
		//System.out.println(map);
		//map안의 모든 데이터를 꺼내서 출력
		
		System.out.println("-- 전체 데이터 출력 --");
		for(String key : map.keySet()) {
			System.out.println(key + " : "+ map.get(key));
		}
		
		//map.containsValue(value) // value를 포함하고 있는지 알 수 있음
		
	}
}
