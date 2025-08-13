package Day5;
abstract class RealEstate{
	abstract void home();
	abstract void apartment() ;
}	
class Varadi extends RealEstate{
	void home() {
		int food = 5000;
		double rent = 10000.00;
		int expensives = 8000;
		double total = (double) (food+rent+expensives);
		System.out.println("Total property cost" + total);
	}
	void apartment(){
		int food = 8000;
		double rent = 15000.00;
		int expensives = 12000;
		double total =(double)( food+rent+expensives);
		System.out.println("Total property cost" + total);
	}
}
class Varun1 extends RealEstate{
	void home() {
		int food = 9000;
		double rent = 20000.00;
		int expensives = 14000;
		double total = (double)(food+rent+expensives);
		System.out.println("Total property cost" + total);
	}
	void apartment(){
		int food = 15000;
		double rent = 35000.00;
		int expensives = 18000;
		double total = (double)(food+rent+expensives);
		System.out.println("Total property cost" + total);
	}
}

	


