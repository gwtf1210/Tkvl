package com.file2;

public class FileManagerImpl implements FileManager{
	File[] playList;
	int size;
	
	FileManagerImpl(int size){
		playList = new File[size];
	}
	
	@Override
	public File[] allFiles() {
		return playList;
	}

	@Override
	public void addFile(File f) {
		for (int i = 0; i < playList.length; i++) {
			if(playList[i] == null) {
				playList[i] = f;
				System.out.println("file�� �߰� �߽��ϴ�.");
				size++;
				break;
			}
			if(i==playList.length-1) {
				System.out.println("���� ������ ���� �մϴ�.");
				break;
			}
		}
		System.out.println();
	}

	@Override
	public File[] findByName(String name) {
		File[] tmp = new File[this.size];
		int tmp_index = 0;
		
		for (int i = 0; i < this.size; i++) {
			if(playList[i] == null) continue;
			if(playList[i].getName().equals(name)) {
				tmp[tmp_index++] = playList[i]; 
			}else {
				continue;
			}
		}
		return tmp;
	}

	@Override
	public File[] findBySinger(String singer) {
		File[] tmp = new File[this.size];
		int tmp_index = 0;
		for (int i = 0; i < this.size; i++) {
			if(playList[i] == null) continue;
			if(playList[i] instanceof MP3File) {
				if(((MP3File)playList[i]).getSinger().equals(singer)) {
				tmp[tmp_index++] = playList[i]; 
			}
			}else {
				continue;
			}
		}
		return tmp;
	}

	@Override
	public File[] findMP3() {
		File[] tmp = new File[this.size];
		int tmp_index = 0;
		for (int i = 0; i < this.size; i++) {
			if(playList[i] == null) continue;
			if(playList[i] instanceof MP3File) {
				tmp[tmp_index++] = playList[i]; 
			}
			else {
				continue;
			}
		}
		return tmp;
	}

	@Override
	public File[] findText() {
		File[] tmp = new File[this.size];
		int tmp_index = 0;
		for (int i = 0; i < this.size; i++) {
			if(playList[i] == null) continue;
			if(playList[i] instanceof TextFile) {
				tmp[tmp_index++] = playList[i]; 
			}
			else {
				continue;
			}
		}
		return tmp;
	}

	@Override
	public boolean isEmpty() {
		if(this.size == 0 ) {
			return true;
		}
		return false;
	}

	@Override
	public void deleteFile(int index) {
		if(playList[index-1] == null) {
			System.out.println("file�� �������� �ʽ��ϴ�.");
		}else {
			playList[index-1] = null;
			System.out.println(index+"��° ������ �����߽��ϴ�.");
			size--;
		}
		System.out.println();
	}

	@Override
	public int size() {
		return this.size;
	}
}
