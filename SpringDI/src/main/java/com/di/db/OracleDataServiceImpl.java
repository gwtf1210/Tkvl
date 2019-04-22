package com.di.db;

public class OracleDataServiceImpl implements DataService {
	String id;
	String pass;
	String url;
	String driver;

	public void setId(String id) {
		this.id = id;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public OracleDataServiceImpl(String url, String driver) {
		this.url = url;
		this.driver = driver;
	}

	@Override
	public void info() {
		System.out.println("********* OracleDataServiceImpl ********");
		System.out.println("ID : " + id);
		System.out.println("PASS : " + pass);
		System.out.println("URL : " + url);
		System.out.println("DIRVER : " + driver);
		System.out.println();
	}
}
