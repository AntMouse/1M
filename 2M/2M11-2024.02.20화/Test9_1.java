package m2_02_20;

class Vehicle {
	public String toString() {
		return "Vehicle::toString()";
	}
}

class Car extends Vehicle {}
class Boat extends Vehicle {}
class Saloon extends Car {}
class Convertible extends Car {}

public class Test9_1 {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		System.out.println(vehicle.toString());
		Car car = new Car();
		System.out.println(car);
		Saloon saloon = new Saloon();
		System.out.println(saloon);
		System.out.println(new Test9_1().toString());

	}

}
