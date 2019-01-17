package com.file3;

import java.util.ArrayList;

public interface FileManager {
	
	ArrayList<File> allFiles();// ArrayList안의 모든 파일을 ArrayList에 담아 리턴
	void addFile(File f);//파일 한개를 파라메터로 받아 ArrayList에 추가
	
	ArrayList<File> findByName(String name);//파일 제목으로 검색 후 일치하는 결과를 ArrayList에 담아 리턴
	ArrayList<File> findBySinger(String singer);//MP3파일 중 가수이름으로 검색해 일치하는 결과를 ArrayList에 담아 리턴
	
	ArrayList<File> findMP3();//ArrayList에서 MP3파일만 찾아 ArrayList에 담아 리턴
	ArrayList<File> findText();//ArrayList에서 Text파일만 찾아 ArrayList에 담아 리턴
	
	boolean isEmpty();//ArrayList이 비었는지 결과를 리턴
	void deleteFile(int index);//ArrayList에서 인덱스 위치의 파일을 삭제
	int size();//ArrayList안에 저장되어 있는 파일 갯수 리턴
	void deleteAll();//모든 파일 삭제
	File getFile(int index);//index위치의 파일 리턴

}
