package m2_02_13;

class A {
	void print() {
		System.out.println("입력값이 없습니다.");
	}
	
	void print(int a) {
		System.out.println("정수 : " + a);
	}
	
	void print(double a) {
		System.out.println("실수 : " + a);
	}
	
	void print(String a) {
		System.out.println(a);
	}
	
	void print(int...a) {
		int sum = 0;
		
		for (int i : a) {
			sum += i;
		}
		
		System.out.println(((double)sum / a.length));
	}
}

public class Testa {

	public static void main(String[] args) {
		A a = new A();
		a.print();
		a.print(3);
		a.print(5.8);
		a.print("문자1");
		
		a.print(1,2);
	}

}
