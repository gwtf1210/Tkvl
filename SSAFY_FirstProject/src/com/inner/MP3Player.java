package com.inner;

abstract class Movie{
	abstract void play();
}

interface Video{
	void play();
}

class MyMovie extends Movie{
	@Override
	void play() {
		System.out.println("harry potter...");
	}
}

public class MP3Player {
	
	public void start(Video v) {
		v.play();
	}
	
	public void start(Movie m) {
		m.play();
	}
	// player.start(new MyMovie());
	// Ŭ���� ����� ��ü ������ ���ÿ� �̷����. 1ȸ�� ��ü
	
	public static void main(String[] args) {
		MP3Player player = new MP3Player();
		
		player.start(new Video() {
			@Override
			public void play() {
				System.out.println("���� ���");
			}
			
		});
		
		player.start(new Movie() {
			@Override
			void play() {
				System.out.println("good");
			}
		});
		
		player.start(new MyMovie()); // �̷��� �ϱ� ������,
		player.start(new Movie() {
			@Override
			void play() {
				System.out.println("aqua man");
				test();
			}
			
			void test() {
				System.out.println("Good Movie");
			}
		});
	}
}
