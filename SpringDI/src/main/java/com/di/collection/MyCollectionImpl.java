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

	public void setArray(int[] array) {
		this.array = array;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	@Override
	public void arrayInfo() {
		System.out.println("------------------- num ---------------");
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	@Override
	public void listInfo() {
		System.out.println("------------------- list ---------------");
		for (String color : list) {
			System.out.print(color + " ");
		}
		System.out.println();
	}

	@Override
	public void setInfo() {
		System.out.println("------------------- set ---------------");
		for (String name : set) {
			System.out.print(name + " ");
		}
		System.out.println();
	}

	@Override
	public void mapInfo() {
		Set<String> keys = map.keySet(); // map 안의 key만 추출
		System.out.println("------------------- map ---------------");
		for (String key : keys) {
			System.out.print(key + " ");
		}
		System.out.println();
	}
}
