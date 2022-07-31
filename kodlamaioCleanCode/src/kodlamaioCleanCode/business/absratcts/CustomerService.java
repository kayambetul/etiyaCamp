package kodlamaioCleanCode.business.absratcts;

import kodlamaioCleanCode.entities.concretes.Customer;

public interface CustomerService {
	void add(Customer customer) throws Exception ;
	void addByOtherBusiness(Customer customer) throws Exception ;
	

}
