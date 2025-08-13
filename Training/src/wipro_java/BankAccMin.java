package wipro_java;

public class BankAccMin {
	public static void main(String[] args) {
		BankAccount b = new BankAccount("Varun",1000);
		b.deposit(2000);
		b.withdraw(500);
		b.displayDetails();
	}

}
