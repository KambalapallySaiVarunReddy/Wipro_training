package Day5;
abstract class Vehicle_drive {
	  abstract void speed();
	 abstract void brand();
	}
	class Car extends Vehicle_drive{
		void speed() {
			System.out.println("speed of the car : 60km/hr");
			
		}
		void brand() {
			System.out.println("brand is: audi");
		}
		
		}
	class Bike extends Vehicle_drive{
		void speed() {
			System.out.println("speed of the bike : 40km/hr");
		}
		void brand() {
			System.out.println("brand is: yamaha");
		}
	}

