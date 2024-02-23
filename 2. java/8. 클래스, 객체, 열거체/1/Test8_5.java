package m2_02_15;

public class Test8_5 {
	private String dogName;
	protected int age;
	public Test8_5(String dogName) {
		this.dogName = dogName;
	}
	public String getDogName() {
		return dogName;
	}
	void pkgPrivate() {
		this.dogName = "chairman";
		System.out.println(this.dogName);
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.testDogAccess();
	}
}

class Cat {
	Cat() {
		
	}
	public void testDogAccess() {
		Test8_5 d = new Test8_5("Rex");
		// d.dogName = "Abc";
		d.age = 2;
		System.out.println(d.getDogName() + " " + d.age);
		d.pkgPrivate();
	}
}
