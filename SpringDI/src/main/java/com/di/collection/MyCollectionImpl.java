package com.di.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyCollectionImpl implements MyCollection {
	// 주입받을 데이터
	int[] array;
	List<String> list;
	Set<String> set;
	Map<String, String> map;

	@Override
	public void arrayInfo() {
		for (int num : array) {
			System.out.println(num);
		}
	}

	@Override
	public void listInfo() {
		for (String name : list) {
			System.out.println(name);
		}
	}

	@Override
	public void setInfo() {
		for (String color : set) {
			System.out.println(color);
		}
	}

	@Override
	public void mapInfo() {
		Set<String> keys = map.keySet(); // map 안의 key만 추출
		for (String key : keys) {
			System.out.println(key);
		}
	}
}
