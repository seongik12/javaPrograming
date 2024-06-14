package week13;

public class MethodSample {
	
	public int getSum(int i, int j) {
		return i+j;
	}
	
	public int getSum(int i, int j, int k) {
		return i+j+k;
	}
	
	public double getSum(double i, double j) {
		return i+j;
	}
	
	public String getSums(double i, int j) {
		return String.valueOf(i+j);
	}
	
	
	
	public static void main(String[] args) {
		MethodSample a = new MethodSample();
		int i = a.getSum(1, 2);
		int j = a.getSum(1, 2, 3);
		double k = a.getSum(1.1, 2.2);
		String s = a.getSums(1.1, 2);
		
		int qqq = 0;
		String www = "12313213";
		double eee = 1.1;
		
		System.out.println(String.valueOf(qqq)+100000);
		System.out.println(Integer.parseInt(www)+1100000);
		System.out.println(Double.parseDouble(www));
		
	}

}
