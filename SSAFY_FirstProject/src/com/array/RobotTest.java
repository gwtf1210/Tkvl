package com.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RobotTest {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src\\com\\data\\Solution11.txt"));
		
		final Scanner sc = new Scanner(System.in);	
		int tc = sc.nextInt(); // test case
		
		for(int i = 0; i < tc; i++) {
			int N = sc.nextInt(); // 배열 크기
			char[][] array = new char[N][N];
			
			for(int x = 0; x < array.length; x++)
				for(int y = 0; y < array[x].length; y++)
					array[x][y] = sc.next().charAt(0);
			
			int count = 0; // 총 이동 횟수
			
			for(int x = 0; x < array.length; x++) {
				for(int y = 0; y < array[x].length; y++) {
					char robot = array[x][y];
					
					switch(robot) {
					case 'A': // 로봇 A인 경우
						for(int k = y+1; k < array[x].length ; k++) { // 오른쪽 이동, y값이 커짐
							if(array[x][k] == 'S') {
								count++;
							}else {
								break;
							}
						}
						break;
					case 'B': // 로봇 B인 경우
						for(int k = y+1; k < array[x].length ; k++) { // 오른쪽 이동, y값이 커짐
							if(array[x][k] == 'S') {
								count++;
							}else {
								break;
							}
						}
						for(int k = y-1; k >= 0 ; k--) { // 왼쪽 이동, y값이 작아짐
							if(array[x][k] == 'S') {
								count++;
							}else {
								break;
							}
						}
						break;
					case 'C': // 로봇 C인 경우
						for(int k = y+1; k < array[x].length ; k++) { // 오른쪽 이동, y값이 커짐
							if(array[x][k] == 'S') {
								count++;
							}else {
								break;
							}
						}
						for(int k = y-1; k >= 0 ; k--) { // 왼쪽 이동, y값이 작아짐
							if(array[x][k] == 'S') {
								count++;
							}else {
								break;
							}
						}
						for(int k = x+1; k < array[x].length ; k++) { // 위쪽 이동, x값이 커짐
							if(array[k][y] == 'S') {
								count++;
							}else {
								break;
							}
						}
						for(int k = x-1; k >= 0 ; k--) { // 아래쪽 이동, x값이 작아짐
							if(array[k][y] == 'S') {
								count++;
							}else {
								break;
							}
						}
						break;
					}
				}
			}
			System.out.println("#" + (i+1) + " " + count);
		}
		
	}
}
