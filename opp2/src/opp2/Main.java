package opp2;

public class Main {

	public static void main(String[] args) {
		
		
		Employee employee=new Employee(1,"Betül","Kayam","1212",100000);
		Customer customer=new Customer(2,"İbrahim","Kaplan",12345);
		
		Logger[] loggers=new Logger[] {new DatabaseLogger(),new CloudLogger()};
		
		DatabaseLogger databaseLogger=new DatabaseLogger();
		databaseLogger.log("Loglandı");
		
		CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
		customerManager.add(new Customer());

		EmployeeManager employeeManager=new EmployeeManager(loggers);
		employeeManager.add(employee);
		
		
	}

}
