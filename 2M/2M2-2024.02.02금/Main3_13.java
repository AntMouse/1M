
public class Main3_13 {

	public static void main(String[] args) {
		int currentYear = 2024;
		String isLeapYear = currentYear % 4 == 0 && (currentYear % 100 != 0 
				|| currentYear % 400 == 0) ?
				" is leap year" : " is not leap year";
		System.out.println(currentYear + isLeapYear);
	}
}
