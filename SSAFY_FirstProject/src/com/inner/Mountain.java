package com.inner;
// local class
public class Mountain { // top-level
	int height = 1950;
	
	public void work() {
		class Gold{ // local class. 메소드 안에 선언되어있는 클래스
			void dig() {
				System.out.println(height);
			}
		}
		
		Gold g = new Gold();
		g.dig();
		System.out.println(this.getClass().getName());
	}
	
	
	public static void main(String[] args) {
		Mountain m = new Mountain();
		m.work();
		
	}
}
