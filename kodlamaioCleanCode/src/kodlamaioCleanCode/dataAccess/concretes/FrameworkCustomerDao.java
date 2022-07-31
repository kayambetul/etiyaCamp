package kodlamaioCleanCode.dataAccess.concretes;

import kodlamaioCleanCode.dataAccess.abstracts.CustomerDao;
import kodlamaioCleanCode.entities.concretes.Customer;

public class FrameworkCustomerDao implements CustomerDao{

	@Override
	public void add(Customer customer) {
		System.out.println("Entity Framework kullanarak veritabanına eklendi. ");
		
	}

	@Override
	public boolean customerExists(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

}
