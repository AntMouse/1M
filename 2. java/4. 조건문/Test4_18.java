package m2_02_06;

import java.util.Scanner;

public class Test4_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("안전 등급 (최고 10 / 최하 1) : ");
		int safetyRating = sc.nextInt();
		
		if (safetyRating <= 4) {
			System.out.println("안전 등급이 4 이하입니다.");
		}
		System.out.println("현재 안전 등급 : " + safetyRating);
	}

}
