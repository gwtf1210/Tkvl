package com.file;

public class TextFile extends File{
	
	String date;
	
	TextFile(String type, int size, String name, String date) {
		super(type, size, name);
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return super.toString()  + "	" +  date;
	}
}
