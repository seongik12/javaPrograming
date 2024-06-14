package test;

//정수 배열을 선언하고 초기화한 후 모든 원소를 출력하는 프로그램을 작성하시오.
public class ArrayExample {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		for (int number : numbers) {
			System.out.println(number);
		}
	}
	
	public int[] a(int b) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		for (int number : numbers) {
			System.out.println(number);
		}
		int c[] = {1,2};
		int d = 90;
		return c;
	}
}
