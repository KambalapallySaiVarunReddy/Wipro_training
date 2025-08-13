package Day7;

import java.util.Scanner;

public class FactorialExcep {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number:");
		try {
			int n = sc.nextInt();
			if(n<0) {
				throw new Exception("No negative numbers.");
			}
			long fact = 1;
			for(int i = 1; i<=n; i++) {
				fact*=i;
			}
			System.out.println("Factorial of " + n + " is :"+ fact);
			}
		catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			System.out.println("program Executed successfully");
			sc.close();
		}
	}
}
