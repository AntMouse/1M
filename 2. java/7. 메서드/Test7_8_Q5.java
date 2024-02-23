package m2_02_13;

import java.util.Scanner;

public class Test7_8_Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("공룡의 이름 : ");
		String dinoName = sc.nextLine();
		System.out.print("방문객의 이름 : ");
		String guestName = sc.nextLine();
		
		System.out.println(guestMessage(dinoName, guestName));
	}
	
	public static String guestMessage(String dinoNamePress, String guestNamePress) {
		return (guestNamePress + "님 " + dinoNamePress + "을 찾아주셔서 감사합니다.");
	}

}
