package m2_02_07;

public class Test5_13 {

	public static void main(String[] args) {
		System.out.println("i, j\n====");
		outerLoop:
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 3) {
					continue outerLoop;
				}
				System.out.println(i + ", " + j);
			}
		}

	}

}
