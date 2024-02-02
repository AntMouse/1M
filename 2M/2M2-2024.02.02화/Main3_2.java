
public class Main3_2 {

	public static void main(String[] args) {
		boolean b1 = false, b2 = true; boolean res = b1 & (b2=false); // F & F
		System.out.println(b1 + " " + b2 + " " + res);
	}

}
