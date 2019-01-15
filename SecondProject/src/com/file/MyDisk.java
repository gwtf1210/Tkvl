package com.file;

public class MyDisk{

	File[] playList;

	MyDisk(int size){
		playList = new File[size];
	}
	
	public void addFile(File f) {
		for (int i = 0; i < playList.length; i++) {
			if(playList[i] == null) {
				playList[i] = f;
				System.out.println("file�� �߰� �߽��ϴ�.");
				break;
			}
			if(i==playList.length-1) {
				System.out.println("���� ������ ���� �մϴ�.");
				break;
			}
		}
		System.out.println();
	}
	
	public void deleteFile(int index) {
		if(playList[index-1] == null) {
			System.out.println("file�� �������� �ʽ��ϴ�.");
		}else {
			playList[index-1] = null;
			System.out.println(index+"��° ������ �����߽��ϴ�.");
		}
		System.out.println();
	}
	
	public void showList() {
		System.out.println("Name ---------- Size -------- Type -------- (Singer/Date)");
		
		for (int i = 0; i < playList.length; i++) {
			if(playList[i] != null) {
				System.out.println(playList[i].toString());
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		MyDisk md = new MyDisk(5);
		
		md.addFile(new MP3File("Home    ", 500,"      MP3     ","Michael Buble"));
		md.addFile(new MP3File("Yellow  ", 300,"      MP3     ","Beatles"));
		md.addFile(new MP3File("Homes   ", 100,"      MP3     ","Michael Buble(feat. MeMa)"));
		
		md.addFile(new TextFile("Resume   ", 280,"     text     ","2013/07/01"));
		md.addFile(new TextFile("Resumming   ", 550,"     text     ","2011/03/01"));
		md.addFile(new TextFile("Replay me   ", 280,"     text     ","2019/05/01"));
		
		md.showList();
		md.deleteFile(2);
		md.showList();
	}
}
