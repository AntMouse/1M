package m2_02_23;

class A {
	protected int a = 3;
	int b = 4;
}
class B extends A {
	int a = 6;
	void n1() {
		super.a = 10;
		this.a = 20;
		System.out.println(super.a);
		System.out.println(this.a);
		System.out.println(a);
	}
}

public class Testa {

	public static void main(String[] args) {
		B b = new B();
		b.n1();

	}

}
