package chap4.base;

public class MovieTest {

	public static void main(String[] args) {

		Movie m1 = new Movie();
		
		m1.title = "ΩŒ«« : ΩŒøÏ∞ÌΩ√∆„ ««≈Õ¡ˆ∞ÌΩ√∆„";
		m1.director = "gd";
		m1.genre = "Ω∫∏±∑Ø";
		m1.grade = 5;
		m1.summary = "≤‹¿Î";
		
		m1.movieInfo();
		
		String tmp = m1.toString();
		System.out.println(tmp);
	}

}
