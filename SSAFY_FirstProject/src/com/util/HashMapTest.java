package com.util;

import java.util.HashMap;

public class HashMapTest {
//	key, value ������ �����͸� ������
//	key�� �������� �����͸� ã���Ƿ� key�� �ߺ��Ǹ� �ȵ�
//	���� x, �ߺ� x
	
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		
		map.put("num", "123");
		map.put("name", "tommy"); // ����� ��, key�� �ߺ������Ƿ�
		map.put("address", "seoul");
		map.put("name", "bill");
		
		String val = map.get("num");
		System.out.println(val);
		
		val = map.get("name");
		System.out.println(val);
		
		//System.out.println(map);
		//map���� ��� �����͸� ������ ���
		
		System.out.println("-- ��ü ������ ��� --");
		for(String key : map.keySet()) {
			System.out.println(key + " : "+ map.get(key));
		}
		
		//map.containsValue(value) // value�� �����ϰ� �ִ��� �� �� ����
		
	}
}
