package Day8;
class Mul1{
	public void display() {
		for(int i=1;i<=10;i++) {
			System.out.println("Wipro");
			}
	}
}
class Mul2{
	public void display() {
		for(int i=1;i<=10;i++) {
			System.out.println("Training");
			}
	}
}
public class MultiThreading {
	public void main(String[]args) {
		Mul1 m1 = new Mul1();
		Mul2 m2 = new Mul2();
		m1.display();
		m2.display();
	}
}
