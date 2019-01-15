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
			int N = sc.nextInt(); // �迭 ũ��
			char[][] array = new char[N][N];
			
			for(int x = 0; x < array.length; x++)
				for(int y = 0; y < array[x].length; y++)
					array[x][y] = sc.next().charAt(0);
			
			int count = 0; // �� �̵� Ƚ��
			
			for(int x = 0; x < array.length; x++) {
				for(int y = 0; y < array[x].length; y++) {
					char robot = array[x][y];
					
					switch(robot) {
					case 'A': // �κ� A�� ���
						for(int k = y+1; k < array[x].length ; k++) { // ������ �̵�, y���� Ŀ��
							if(array[x][k] == 'S') {
								count++;
							}else {
								break;
							}
						}
						break;
					case 'B': // �κ� B�� ���
						for(int k = y+1; k < array[x].length ; k++) { // ������ �̵�, y���� Ŀ��
							if(array[x][k] == 'S') {
								count++;
							}else {
								break;
							}
						}
						for(int k = y-1; k >= 0 ; k--) { // ���� �̵�, y���� �۾���
							if(array[x][k] == 'S') {
								count++;
							}else {
								break;
							}
						}
						break;
					case 'C': // �κ� C�� ���
						for(int k = y+1; k < array[x].length ; k++) { // ������ �̵�, y���� Ŀ��
							if(array[x][k] == 'S') {
								count++;
							}else {
								break;
							}
						}
						for(int k = y-1; k >= 0 ; k--) { // ���� �̵�, y���� �۾���
							if(array[x][k] == 'S') {
								count++;
							}else {
								break;
							}
						}
						for(int k = x+1; k < array[x].length ; k++) { // ���� �̵�, x���� Ŀ��
							if(array[k][y] == 'S') {
								count++;
							}else {
								break;
							}
						}
						for(int k = x-1; k >= 0 ; k--) { // �Ʒ��� �̵�, x���� �۾���
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
