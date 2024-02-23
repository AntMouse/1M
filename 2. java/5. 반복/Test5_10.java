package m2_02_07;

public class Test5_10 {

	public static void main(String[] args) {
		System.out.println("i, j");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 3) {
					break;
				}
				System.out.println(i + ", " + j);
			}
		}
	}

}
