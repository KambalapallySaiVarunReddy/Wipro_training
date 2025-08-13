package Day4;

abstract class Employee {
	String name;
	int empId;
	public Employee(String name, int empId) {
		this.name =name;
		this.empId = empId;
	}
	abstract double calculateSalary();
	public void display() {
		System.out.println("Employee ID: "+ empId);
		System.out.println("Employee Name:"+ name);
		
	}
	
}
