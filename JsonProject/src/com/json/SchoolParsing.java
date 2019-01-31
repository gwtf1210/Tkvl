package com.json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class SchoolParsing {
	
	public static void main(String[] args) throws JsonSyntaxException, ClassNotFoundException, IOException {
		new SchoolParsing().parse();
	}
	
	// school.json을 읽어와서 parsing
	public void parse() throws JsonSyntaxException, ClassNotFoundException, IOException {
		// 1. File에 Stream 연결
		BufferedReader br = new BufferedReader(new FileReader("json/school.json"));
		
		// 2. JsonParser 생성 후 parse
		JsonParser parser = new JsonParser();
		
		// 3. 파싱 결과를 JsonArray로 받아내기
		JsonObject obj = parser.parse(br).getAsJsonObject();
		JsonArray arr = obj.getAsJsonArray("records");
		
		// 4. JsonArray 처리(학구명, 교육지원청코드, 시도교육청명, 교육지원청명)
		for (int i = 0; i < arr.size(); i++) {
			JsonObject o = (JsonObject) arr.get(i);
			
			String code = o.get("학구명").getAsString();
			String code2 = o.get("교육지원청코드").getAsString();
			String code3 = o.get("시도교육청명").getAsString();
			String code4 = o.get("교육지원청명").getAsString();
			
			System.out.println(code + " | " + code2 + " | " + code3 + " | " + code4);
		}
	}
}
