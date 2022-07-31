package kodlamaioCleanCode.dataAccess.abstracts;

import kodlamaioCleanCode.entities.concretes.Customer;

public interface CustomerDao {
	void add(Customer customer);
	boolean customerExists(Customer customer);

}
