package test;

public class test32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intArray[] = new int[5]; // 배열 생성
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[4] = 5;
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		
		String strArray[] = new String[3]; // 배열 생성
		strArray[0] = "a";
		strArray[1] = "b";
		strArray[2] = "c";
		
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
	}

}
