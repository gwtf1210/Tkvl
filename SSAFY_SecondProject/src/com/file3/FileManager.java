package com.file3;

import java.util.ArrayList;

public interface FileManager {
	
	ArrayList<File> allFiles();// ArrayList���� ��� ������ ArrayList�� ��� ����
	void addFile(File f);//���� �Ѱ��� �Ķ���ͷ� �޾� ArrayList�� �߰�
	
	ArrayList<File> findByName(String name);//���� �������� �˻� �� ��ġ�ϴ� ����� ArrayList�� ��� ����
	ArrayList<File> findBySinger(String singer);//MP3���� �� �����̸����� �˻��� ��ġ�ϴ� ����� ArrayList�� ��� ����
	
	ArrayList<File> findMP3();//ArrayList���� MP3���ϸ� ã�� ArrayList�� ��� ����
	ArrayList<File> findText();//ArrayList���� Text���ϸ� ã�� ArrayList�� ��� ����
	
	boolean isEmpty();//ArrayList�� ������� ����� ����
	void deleteFile(int index);//ArrayList���� �ε��� ��ġ�� ������ ����
	int size();//ArrayList�ȿ� ����Ǿ� �ִ� ���� ���� ����
	void deleteAll();//��� ���� ����
	File getFile(int index);//index��ġ�� ���� ����

}
