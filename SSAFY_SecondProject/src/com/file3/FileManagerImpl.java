package com.file3;

import java.util.ArrayList;

public class FileManagerImpl implements FileManager{
	ArrayList<File> playList;

	FileManagerImpl(){
		playList = new ArrayList<>();
	}
	
	@Override
	public ArrayList<File> allFiles() {
		// TODO Auto-generated method stub
		return playList;
	}

	@Override
	public void addFile(File f) {
		playList.add(f);
	}

	@Override
	public ArrayList<File> findByName(String name) {
		ArrayList<File> tmp = new ArrayList<>();
		for(File f : playList) {
			if(f.getName().equals(name)) {
				tmp.add(f);
			}
		}
		
		if(tmp.size() == 0) {
			return null;
		}
		else {
			return tmp;
		}
	}

	@Override
	public ArrayList<File> findBySinger(String singer) {
		ArrayList<File> tmp = new ArrayList<>();
		for(File f : playList) {
			if(f instanceof MP3File) {
				if(((MP3File)f).getSinger().equals(singer)) {
					tmp.add(f);
				}
			}
		}
		if(tmp.size() == 0) {
			return null;
		}
		else {
			return tmp;
		}
	}

	@Override
	public ArrayList<File> findMP3() {
		ArrayList<File> tmp = new ArrayList<>();
		for(File f : playList) {
			if(f instanceof MP3File) {
				tmp.add(f);
			}
		}
		if(tmp.size() == 0) {
			return null;
		}
		else {
			return tmp;
		}
	}

	@Override
	public ArrayList<File> findText() {
		ArrayList<File> tmp = new ArrayList<>();
		for(File f : playList) {
			if(f instanceof TextFile) {
				tmp.add(f);
			}
		}
		if(tmp.size() == 0) {
			return null;
		}
		else {
			return tmp;
		}
	}

	@Override
	public boolean isEmpty() {
		return playList.isEmpty();
		
//		if(playList.size() == 0) {
//			return true;
//		}else {
//			return false;	
//		}
	}

	@Override
	public void deleteFile(int index) {
		playList.remove(index);
	}

	@Override
	public int size() {
		return playList.size();
	}

	@Override
	public void deleteAll() {
		playList.clear();
		
	}

	@Override
	public File getFile(int index) {
		return playList.get(index);
	}
}
