package generics;

public class CustomerService {
	
	//customer için add çalışır.
	public void add(Customer customer) {
		DataRepository<Customer> customerRepository=new DataRepository<Customer>();
		customerRepository.add(customer);
	}
	
	

}
