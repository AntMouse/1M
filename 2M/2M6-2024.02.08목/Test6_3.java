package m2_02_08;

public class Test6_3 {

	public static void main(String[] args) {
		int[] results = {10, 20, 30, 40, 50};
		for (int i = 0; i < results.length; i++) {
			results[i] = results[i] * 2;
			System.out.println("Element at " + i + ": " + results[i]);
		}
		
		for (int x : results) {
			System.out.println("Element : " + x);
		}
		
		
		
	}

}
