package exam;

import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("수를 입력하시오 : ");
		
		int number = in.nextInt();
		
		if ( number%3 == 0 ) {
			System.err.println("3의 배수 입니다.");
		}else {
			System.err.println("3의 배수가 아닙니다.");
		}
		
		in.close();
		
		
		
		
		
		
		
		
		
	}

}
