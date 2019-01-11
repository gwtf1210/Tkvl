package com.ssafy;

public class MovieMgr {
	Movie[] movies;
	int index;
	
	MovieMgr(){
		movies = new Movie[100];
		index = 0;
	}
	
	public void add(Movie m) {
		movies[index++] = m;
		System.out.println("Movie ������ �߰��߽��ϴ�.");
	}
	
	public Movie[] search() {
		return this.movies;
	}
	
	public Movie[] search(String title) {
		Movie[] tmp = new Movie[index];
		
		for(int i=0; i< index; i++) {
			if(movies[i].getTitle().equals(title))
				tmp[i] = movies[i];
		}
		return tmp;
	}
	
	public Movie[] searchDirector(String name) {
		Movie[] tmp = new Movie[index];

		for(int i=0; i< index; i++) {
			if(movies[i].getDirector().equals(name))
				tmp[i] = movies[i];
		}
		return tmp;
	}
	
	public Movie[] searchGenre(String genre) {
		Movie[] tmp = new Movie[index];

		for(int i=0; i< index; i++) {
			if(movies[i].getGenre().equals(genre))
				tmp[i] = movies[i];
		}
		return tmp;
	}
	
	public void delete(String title) {
		int tmp_n = -1;
		
		for (int i = 0; i < index; i++) {
			if(movies[i].getTitle().equals(title)) {
				movies[i] = null;
				System.out.println("���� �ƽ��ϴ�.");
				index--;
				tmp_n = i;
				break;
			}
		}
		
		if(tmp_n != -1) {
			for(int i=tmp_n; i<index-1;i++) {
				movies[i] = movies[i+1];
			}
		}
		else System.out.println("ã���ô� ��ȣ�� �����ϴ�.");
	}
	
	public int getSize() {
		return index;
	}
}
