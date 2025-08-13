package Day4;
abstract class Payments
{
	double amount ;
	
	Payments(double amount)
	{
		this.amount = amount ;
	}
	
	abstract void makePayment();
	
	void showSuccessMessage()
	{
		System.out.println("Payment successfull " +amount);
	}
	
}
class CreditCardPayment1 extends Payments
{
	CreditCardPayment1(double amount)
	{
		super(amount) ;
		
	}
	
	void makePayment()
	{
		System.out.println("Credit Card payment is Done...");
	}
}
class UpiPayments extends Payments
{
	 UpiPayments(double amount)
	 {
		super(amount) ;
	}
	
	 void makePayment()
	 {
		 System.out.println("Upi payment is Done...");
	 }
}

public class Payment {
	public static void main(String[] args)
	{
		Payments py = new CreditCardPayment1(45000) ;
		py.makePayment();
		System.out.println("Credit Card Payment Process is Completed ");
		
		Payments py2 = new UpiPayments(30000) ;
		py2.makePayment();
		System.out.println("Upi Payment Process is Completed ");
	}
}
