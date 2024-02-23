package m2_02_21;
// 1
public sealed class Test9_11 permits Car2 {
	@Override
    public String toString() {
		return "Test9_11::toString()";
    }

	public static void main(String[] args) {
		Test9_11 test9_11 = new Test9_11();
		Car2 car2 = new Car2();
		Saloon2 saloon2 = new Saloon2();
		Volvo volvo = new Volvo();
		Ford ford = new Ford();
		
		System.out.println(test9_11);
		System.out.println(car2);
		System.out.println(saloon2);
		System.out.println(volvo);
		System.out.println(ford);
		
		System.out.println();
		
		Test9_11[] vehicles = new Test9_11[] 
		{new Test9_11(), new Car2(), new Saloon2(), new Volvo(), new Ford()};
		for (Test9_11 vehicle : vehicles) {
		    System.out.println(vehicle);
		}
	}

}
//2
sealed class Car2 extends Test9_11 permits Saloon2 {
	@Override
    public String toString() {
		return "Car2::toString()";
    }
}
//3 sealed class Truck extends Test9_11 {}
//4
non-sealed class Saloon2 extends Car2 {
	@Override
    public String toString() {
        return "Saloon2::toString()";
    }
}
class Volvo extends Saloon2 {
	@Override
    public String toString() {
        return "Volvo::toString()";
    }
}
class Ford extends Saloon2 {
	@Override
    public String toString() {
        return "Ford::toString()";
    }
}
//5 class Convertible extends Car{}
