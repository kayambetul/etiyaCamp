package kodlamaioCleanCode.entities.concretes;

public class Employee extends Person{
	
	private double salary;

	public Employee() {
		super();
	}

	public Employee(double salary) {
		super();
		this.salary = salary;
	}
	
	public Employee (int id, String firstName, String lastName, String identityNumber, int yearOfBirth,double salary) {
        super(id, firstName, lastName, identityNumber, yearOfBirth);
        this.salary=salary;
    }

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
