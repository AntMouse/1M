package m2_02_15;

public record Person7(String name, Integer age) {
	public person7 {
		if (age < 18) {
			name = "Error";
			age = -1;
		}
	}
}

class PersonTest {
	public static void main(String[] args) {
		person7 p1 = new Person7("Joe Bloggs", 20);
	}
}

public class Test8_12 {

	public static void main(String[] args) {
		

	}

}
