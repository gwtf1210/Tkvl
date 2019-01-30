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
	// 클래스 선언과 객체 생성이 동시에 이루어짐. 1회용 객체
	
	public static void main(String[] args) {
		MP3Player player = new MP3Player();
		
		player.start(new Video() {
			@Override
			public void play() {
				System.out.println("비디오 재생");
			}
			
		});
		
		player.start(new Movie() {
			@Override
			void play() {
				System.out.println("good");
			}
		});
		
		player.start(new MyMovie()); // 이렇게 하기 싫을때,
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
