package com.file2;

public interface FileManager {
	
	File[] allFiles();
	void addFile(File f);
	File[] findByName(String name);
	File[] findBySinger(String singer);
	
	File[] findMP3();
	File[] findText();
	boolean isEmpty();
	void deleteFile(int index);
	int size();

}
