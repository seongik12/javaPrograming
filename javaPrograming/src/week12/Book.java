package week12;

public class Book {
	String title;
	String author;
	int jumsu;
	
	public Book(String bb) { // ������
		title = bb; author = "���ڹ̻�";
	}
	
	public Book(String t, String a) { // ������
		title = t; author = a;
	}
	
	public Book(int ccc) { // ������
		jumsu = ccc;
	}
	
	public static void main(String [] args) {
		Book littlePrince = new Book("�����", "�������丮"); 
		Book loveStory = new Book("������"); 
		Book junseo = new Book(123456);
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
		System.out.println(junseo.jumsu);
	}
}
