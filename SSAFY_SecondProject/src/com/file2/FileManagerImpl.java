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
				System.out.println("file을 추가 했습니다.");
				size++;
				break;
			}
			if(i==playList.length-1) {
				System.out.println("저장 공간이 부족 합니다.");
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
			System.out.println("file이 존재하지 않습니다.");
		}else {
			playList[index-1] = null;
			System.out.println(index+"번째 파일을 삭제했습니다.");
			size--;
		}
		System.out.println();
	}

	@Override
	public int size() {
		return this.size;
	}
}
