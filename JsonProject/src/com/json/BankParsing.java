package com.json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class BankParsing {
	
	public static void main(String[] args) throws JsonSyntaxException, ClassNotFoundException, IOException {
		new BankParsing().parse();
	}
	
	// school.json을 읽어와서 parsing
	public void parse() throws JsonSyntaxException, ClassNotFoundException, IOException {
		String url = "http://finlife.fss.or.kr/finlifeapi/annuitySavingProductsSearch.json?auth=1db6e257b5ad61c5241a1bc1c9bc863b&topFinGrpNo=050000&pageNo=1";
		InputStream in = new URL(url).openConnection().getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		JsonParser parser = new JsonParser();
		JsonObject obj = parser.parse(br).getAsJsonObject();
		obj = obj.getAsJsonObject("result");
		JsonArray jsonArray = (JsonArray)obj.getAsJsonArray("baseList");
		
		for (int i = 0; i < jsonArray.size(); i++) {
			JsonObject o = (JsonObject) jsonArray.get(i);
			
			String code = o.get("kor_co_nm").getAsString();
			String code2 = o.get("fin_prdt_nm").getAsString();
			
			System.out.println(code + " | " + code2);
		}
	}
}
