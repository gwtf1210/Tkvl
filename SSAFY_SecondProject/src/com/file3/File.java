package com.file3;

public abstract class File {
	private String name;
	private String type;
	private int size;
	
	File(String type, int size, String name){
		this.name = name;
		this.type = type;
		this.size = size;
		
	}
	
	@Override
	public String toString() {
		return type + "\t" +  size + "\t" + name;
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
