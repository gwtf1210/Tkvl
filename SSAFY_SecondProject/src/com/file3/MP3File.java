package com.file3;

public class MP3File extends File{
	String singer;
	
	MP3File(String type, int size, String name, String singer) {
		super(type, size, name);
		this.singer = singer;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return super.toString()  + "\t" + singer;
	}
}
