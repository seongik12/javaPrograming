package week10;

public class ReturnArray {

	static int[] makeArray(int dd) { // ������ �迭�� �����ϴ� �޼ҵ�
		System.out.println(dd);
		int temp[] = new int[4]; // �迭 ����
		for (int i=0; i<temp.length; i++) {
			temp[i] = i; // �迭�� ���Ҹ� 0, 1, 2, 3���� �ʱ�ȭ
			temp[i] = dd;
		}
	
		return temp; // �迭 ����
	}

	public static void main (String[] args) {
		int intArray[]; // �迭 ���۷��� ���� ����
		int a = 3333;
		intArray = makeArray(a); // �޼ҵ�κ��� �迭 ���޹���

		
		
		try {
			for (int i=0; i<intArray.length; i++) {
				System.out.print(intArray[i] + " "); // �迭 ��� ���� ���
			}
		}catch(Exception e){
			e.getMessage();
		}
	}
}
