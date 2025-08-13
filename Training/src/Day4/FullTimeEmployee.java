package Day4;

class FullTimeEmployee extends Employee {
	double monthlySalary;
	public FullTimeEmployee(String name, int empId, double monthlySalary) {
        super(name, empId);
        this.monthlySalary = monthlySalary;
    }
    double calculateSalary() {
        return monthlySalary;
    }
}

