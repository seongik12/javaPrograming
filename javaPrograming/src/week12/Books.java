package week12;

public class Books {
	String title;
	String author;
	
	void show() {
		System.out.println(title + " " + author);
	}
	
	public Books() {
		this("", "");
		System.out.println("������ ȣ���");
	}

	public Books(String title) {
		this(title, "���ڹ̻�");
	}

	public Books(String title, String author) {
		this.title = title; this.author = author;
	}
	
	public static void main(String [] args) {
		Books littlePrince = new Books("�����", "�������丮");
		Books loveStory = new Books("������");
		Books emptyBook = new Books();		
		loveStory.show();
	}
}
