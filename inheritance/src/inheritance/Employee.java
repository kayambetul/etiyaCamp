package inheritance;

public class Employee extends Person{
	
	
	private double salary;

	
	public Employee() {
		super();
	}


	public Employee(double salary) {
		super();
		this.salary = salary;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	

}
