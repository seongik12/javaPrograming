package test;

//2x3 행렬을 선언하고 초기화한 후, 모든 원소를 출력하는 프로그램을 작성하시오.
public class TwoDimensionalArray {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
