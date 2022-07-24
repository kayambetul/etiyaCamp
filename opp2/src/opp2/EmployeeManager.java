package opp2;

public class EmployeeManager {
	//çoklu loglama imkanı getirin 
	//database ,cloud,elastic ....
	
	private Logger[] loggers;

	public EmployeeManager(Logger[] loggers) {
		
		this.loggers = loggers;
	}
	
	public void add(Employee employee) {
		System.out.println(employee.getFirstName()+" added");
		for (Logger logger : loggers) {
			logger.log(employee.getFirstName());
		}
		
		
	}
	
	public void update(Employee employee) {
		System.out.println(employee.getFirstName()+ " updated");
		for (Logger logger : loggers) {
			logger.log(employee.getFirstName());
		}
		
	}
	
	

}
