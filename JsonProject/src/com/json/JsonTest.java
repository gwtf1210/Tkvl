package com.json;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonTest {
	public static void parsing2() {
		String s1 = "{'client' : 'localhost','servers':['1.2.3.4','12.34.56.78','123.456.654.099']}";
		String s2 = "{'winners':['kim','lee','queen','king','price']}";
		String s3 = "['red','yellow','blue']";
		
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();
		
		JsonObject obj = parser.parse(s1).getAsJsonObject();
		JsonArray arr = obj.getAsJsonArray("servers");
		ArrayList list = gson.fromJson(arr, ArrayList.class);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println();
		////////////////////////////////////////////////////////
		JsonObject obj2 = parser.parse(s2).getAsJsonObject();
		JsonArray arr2 = obj2.getAsJsonArray("winners");
		ArrayList list2 = gson.fromJson(arr2, ArrayList.class);
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		System.out.println();
		//////////////////////////////////////////////////////////////
		JsonArray arr3 = parser.parse(s3).getAsJsonArray();
		ArrayList list3 = gson.fromJson(arr3, ArrayList.class);
		
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i));
		}
		System.out.println();
		
	}
	
	public static void parsing() {
		String json = "{'num' : '678', 'name' : 'william', 'address':'seattle'}";
		JsonParser parser = new JsonParser();
		// 1. jsonObject로 받아와야함
		JsonObject obj = parser.parse(json).getAsJsonObject();
//		String num = obj.get("num").getAsString(); // 객체를 String으로 바꾼다.
		int num = obj.get("num").getAsInt();
		String name = obj.get("name").getAsString();
		String address = obj.get("address").getAsString();
		
		System.out.println(num + "--" + name + ":" + address);
		
		
	}
	
	
	public static void main(String[] args) {
		// 1. java object --> json string
		Member m = new Member();
		m.setNum("123");
		m.setName("tommy");
		m.setAddress("la");
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
//		builder는 환경을 설정하고 사용하고 싶을 때나, 출력 시 가독성을 높이고 싶을때 사용한다.
		Gson gson = builder.create(); 
//		Gson gson = new Gson(); 
		String str = gson.toJson(m);
		System.out.println(str);
		
		
		// 2. json string --> java object
		String json = "{'num' : '678', 'name' : 'william', 'address':'seattle'}";
		Gson gson2 = new Gson();
		Member m2 = gson2.fromJson(json, Member.class);
		System.out.println(m2.toString());
		
		// 3. JsonObject --> json string
		JsonObject obj = new JsonObject();
		obj.addProperty("num", "890");
		obj.addProperty("name", "kim");
		obj.addProperty("address", "seoul");
		str = gson.toJson(obj);
		System.out.println(str);

		// 4. parsing
		parsing();
		parsing2();
		
		
	}
}
















