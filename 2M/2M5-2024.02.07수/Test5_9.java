package m2_02_07;

public class Test5_9 {

	public static void main(String[] args) {
		int[] data = {9,3,5,7};
		System.out.println("[]\t[n]\tHistogram");
		for (int i = 0; i < data.length; i++) {
			System.out.print(i + "\t" + data[i] + "\t");
			for (int j = 0; j < data.length; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("My name is \"Alan\"");
	}

}
