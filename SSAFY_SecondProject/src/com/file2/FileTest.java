package com.file2;

public class FileTest{
	public static void main(String[] args) {
		FileManagerImpl fm = new FileManagerImpl(10);
		
		fm.addFile(new MP3File("MP3", 500,"Home","Michael Buble"));
		fm.addFile(new MP3File("MP3", 300,"Yellow","Beatles"));
		fm.addFile(new MP3File("MP3", 100,"Homes","Michael Buble(feat. MeMa)"));
		
		fm.addFile(new TextFile("text",280,"Resume", "2013/07/01"));
		fm.addFile(new TextFile("text", 550,"Resumming","2011/03/01"));
		fm.addFile(new TextFile("text", 280,"Replay me","2019/05/01"));
		
		System.out.println("----------------------------------------------------------");
		for(File f : fm.allFiles()) {
			if(f != null) System.out.println(f.toString());
		}
		System.out.println("----------------------------------------------------------");
		
		fm.deleteFile(2);
		
		System.out.println("----------------------------------------------------------");
		for(File f : fm.allFiles()) {
			if(f != null) System.out.println(f.toString());
		}
		System.out.println("----------------------------------------------------------");
		
		System.out.println("\n---------------- 이름 검색 결과입니다. ----------------");
		for(File f : fm.findByName("Resume")) {
			if(f != null) System.out.println(f.toString());
		}
		
		System.out.println("\n---------------- 가수 검색결과입니다. ----------------");
		for(File f : fm.findBySinger("Michael Buble")) {
			if(f != null) System.out.println(f.toString());
		}
		
		System.out.println("\n---------------- MP3 파일입니다. ----------------");
		for(File f : fm.findMP3()) {
			if(f != null) System.out.println(f.toString());
		}
		
		System.out.println("\n---------------- Text 파일입니다. ----------------");
		for(File f : fm.findText()) {
			if(f != null) System.out.println(f.toString());
		}
		
		System.out.println("\n------ 총 용량 : " + fm.size());
	}
}
