package com.file;

public class File {
	private String type;
	private int size;
	private String name;
	
	File(String type, int size, String name){
		this.type = type;
		this.size = size;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return type + "	" +  size + "	" + name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
