package wipro_java;
class Employee{
	private String name;
	private double salary;
	void setName(String n) {
		name = n;
	}
	void setSalary(double s) {
		salary = s ;
	}
	public void display() {
		System.out.println("Name:" + name);
		System.out.println("Salary: " + salary);
	}
}
public class EncapsulationExample {
	public static void main(String[]args) {
		Employee emp = new Employee();
		emp.setName("Varun");
		emp.setSalary(50000);
		emp.display();
	}

}
