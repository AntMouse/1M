package m2_02_20;

public class Test9_7 {
	protected void read() {}

	public static void main(String[] args) {
		

	}

}

class NonFictionBook extends Test9_7 {
	public void doThings() {
		read();
	}
}
class Magnifier {
	void magnify() {
		Test9_7 b = new Test9_7();
		// 1
		b.read();
	}
}
