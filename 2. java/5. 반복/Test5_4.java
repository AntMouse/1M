package m2_02_06;

import java.util.Scanner;

public class Test5_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your age -- > ");
		int age = sc.nextInt();
		
		while (age >= 18) {
			System.out.println("As you are " + age + " years of age, " + 
						"you can purchase alcohol");
			System.out.print("Please enter your age -> ");
			age = sc.nextInt();
		}

	}
}
