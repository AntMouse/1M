package m2_02_13;

public class Test7_5 {

	public static void main(String[] args) {
		m1();
		m1(1);
		m1(1,2);
		m1(1,2,3);
		
	}
	
	public static void m1(int...args) {
		int sum = 0;
		for (int i : args) {
			sum += i;
		}
		System.out.println(sum);
	}

}
