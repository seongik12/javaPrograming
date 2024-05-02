package exam;

import java.util.Scanner;

public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String order = scanner.next();
		int price = 0;
		
		switch( order  ) {
			case "에스프레소":
			case "카푸치노":
				price = 1500;
				break;
			case "아메리카노" :
				price = 1200;
				break;
			default :
				System.out.println("ssssssss");
		}
		
		
		
		
		
		
		
		
	}

}
