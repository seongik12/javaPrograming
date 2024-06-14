package week12;

public class Book {
	String title;
	String author;
	int jumsu;
	
	public Book(String bb) { // 생성자
		title = bb; author = "작자미상";
	}
	
	public Book(String t, String a) { // 생성자
		title = t; author = a;
	}
	
	public Book(int ccc) { // 생성자
		jumsu = ccc;
	}
	
	public static void main(String [] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리"); 
		Book loveStory = new Book("춘향전"); 
		Book junseo = new Book(123456);
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
		System.out.println(junseo.jumsu);
	}
}
