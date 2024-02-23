package m2_02_20;

class VehicleT {
	public void move() {
		System.out.println("Vehicle::move");
	}
	
	int x = 5;
}

public class Testa {
	public static void doAction(VehicleT v) {
		v.move();
		System.out.println(v.x);
	}
	
	public static void move23() {
		System.out.println("Vehicle::move23");
	}

	public static void main(String[] args) {
		doAction(new VehicleT());
	}

}
