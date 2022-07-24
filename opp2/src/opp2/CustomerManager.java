package opp2;

public class CustomerManager {
	private Logger logger;
	public CustomerManager(Logger logger) {
		this.logger=logger;
	}
	
	public void add(Customer customer) {
		System.out.println(customer.getFirstName()+ " added");
		this.logger.log(customer.getFirstName());
		/*DatabaseLogger databaseLogger=new DatabaseLogger();
		databaseLogger.log(customer.getFirstName());*/
	}
	

	
	public void update(Customer customer) {
		System.out.println(customer.getFirstName()+" updated");
		this.logger.log(customer.getFirstName());
	}

}
