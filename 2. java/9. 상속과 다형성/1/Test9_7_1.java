package Test9_7_Plus;
import m2_02_20.Test9_7;

class FictionBook extends Test9_7 {
	public void doThings() {
		//a
		read();
		//1
		this.read();
		FictionBook fb = new FictionBook();
		//2
		fb.read();
		//3
		Test9_7 b = new Test9_7();
		//4 
		// b.read();
	}
}
class SpaceFictionBook extends FictionBook {
	public void doThings() {
		//5
		read();
		//6
		// new Test9_7().read();
		//7
		// new FictionBook().read();
		//8
		new SpaceFictionBook().read();
	}
}
class Reader{
	public void doThings() {
		Test9_7 b = new Test9_7();
		//9
		// b.read();
		FictionBook fb = new FictionBook();
		//10
		// fb.read();
	}
}

public class Test9_7_1 {

	public static void main(String[] args) {
		

	}

}
