package m2_02_06;

import java.util.Scanner;

public class Test5_3 {

	public static void main(String[] args) {
		int sum = 0;
		boolean keepGoing = true;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number (negative numver to exit) -> ");
			int n = sc.nextInt();
			if (n < 0) {
				keepGoing = false;
			} else {
				sum = sum + n;
			}
		} while (keepGoing);
		System.out.println("Sum of numbers is : " + sum);

	}

}
