package week6;

// 다음 ★ 을 10개 중 홀수의 경우에만 그리기 위한 코딩이다.
// for 문과 if 문 안의 조건을 넣으시오.

public class week6 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i + " ★");
			}
		}
	}
}
