package exam2;

import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 3�� �Է�>>");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int median = a;
		if((a >= b && a <= c) || (a >= c && a <= b)) {
			median = a;
		}else if((b >= a && b <= c) || (b >= c && b <= a)) {
			median = b;
		}else {
			median = c;
		}
		System.out.println("�߰� ���� " + median);
		scanner.close();
	}

}
