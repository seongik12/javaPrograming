package exam2;

public class TV {
	private String manufacturer;
	private int year;
	private int size;
	
	public TV(String manufacturer, int year, int size) {
		this.manufacturer = manufacturer;
		this.year = year;
		this.size = size;
	}
	
	public void show() {
		System.out.print(this.manufacturer + "���� ���� ");
		System.out.print(this.year + "���� ");
		System.out.print(this.size + "��ġ TV");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myTV = new TV("U1", 2024, 32);
		myTV.show();
	}

}
