package m2_02_06;

import java.util.Scanner;

public class Test4_22 {

	public static void main(String[] args) {
		int time;
		Scanner sc = new Scanner(System.in);
		System.out.print("시간 입력(10~19) : ");
		time = sc.nextInt();		

		if (0 <= time && time <= 24) {
			System.out.println("현재 시간은 " + time + "시 입니다.");
			
			if (10 <= time && time <=19) {
				System.out.println("방문객 개방시간입니다.");
			} else {
				System.out.println("방문객 개방시간이 아닙니다.");
			} 
		} else {
			System.out.println("제대로된 값을 입력해주세요.");
		}

	}

}
