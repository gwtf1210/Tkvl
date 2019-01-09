package chap4.base;

public class Movie {
	String title;
	String director;
	int grade;
	String genre;
	String summary;
	
	public void movieInfo() {
		System.out.println("title : " + title 
				+ "\ndirector : " + director 
				+ "\ngrade : " + grade 
				+ "\ngenre : " + genre
				+ "\nsummary : " + summary);
	}
	
	public String toString() {
		return title + " " + director + " " + grade + " " + genre + " " + summary;
	}
}
