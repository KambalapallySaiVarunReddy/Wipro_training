package wipro_java;
class Vechile1{
	void start() {
		System.out.println("Vechile is started");
		}
}
class Car extends Vechile1 {
	void drive() {
		System.out.println("Car is driving");
	}
}
public class Vehicle {
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.drive();
	}
}
