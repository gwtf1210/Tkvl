package chap4.base;

public class MovieTest {

	public static void main(String[] args) {

		Movie m1 = new Movie();
		
		m1.title = "���� : �ο����� �����������";
		m1.director = "gd";
		m1.genre = "������";
		m1.grade = 5;
		m1.summary = "����";
		
		m1.movieInfo();
		
		String tmp = m1.toString();
		System.out.println(tmp);
	}

}
