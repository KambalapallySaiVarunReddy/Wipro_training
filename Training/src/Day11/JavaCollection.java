package Day11;

import java.util.ArrayList;

public class JavaCollection {
class department{
	private String name;
	private double sales;
	private double expenses;
	public department(String name,double sales,double expenses) {
		this.name = name;
		this.sales = sales;
		this.expenses =  expenses;
		
	}
	public double getprofit() {
		return sales-expenses;
	}
	public String getName() {
		return name;
	}
}
public static void main(String[]args ) {
	ArrayList<department> dept = new ArrayList<>();
	dept.add(new JavaCollection().new department("Sales",20000,15000));
	dept.add(new JavaCollection().new department("Marketing",15000,5000));
	dept.add(new JavaCollection().new department("Research",30000,20000));
	for(department d: dept) {
		System.out.println(d.getName() + "Profit:" + d.getprofit()); 
	}
	dept.sort((d1,d2) -> Double.compare(d2.getprofit(),d1.getprofit()));
	System.out.println("Sorting is sucessfull");
	for(department d : dept)
	{
	 System.out.println(d.getName() + "Profit: " + d.getprofit());
	}
}


}

