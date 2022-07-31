import java.util.List;

import kodlamaioCleanCode.adapter.KpsServiceAdapter;
import kodlamaioCleanCode.business.absratcts.CampaignService;
import kodlamaioCleanCode.business.absratcts.CustomerService;
import kodlamaioCleanCode.business.absratcts.EducationSaleService;
import kodlamaioCleanCode.business.absratcts.EmployeeService;
import kodlamaioCleanCode.business.concretes.CustomerManager;
import kodlamaioCleanCode.business.concretes.EducationSaleManager;
import kodlamaioCleanCode.business.concretes.EmployeeManager;
import kodlamaioCleanCode.business.concretes.PercentDiscountCampaignManager;
import kodlamaioCleanCode.business.concretes.StandardPriceCampaignManager;
import kodlamaioCleanCode.dataAccess.concretes.FrameworkEducationSaleDao;
import kodlamaioCleanCode.dataAccess.concretes.FrameworkEmployeeDao;
import kodlamaioCleanCode.dataAccess.concretes.HibernateCustomerDao;
import kodlamaioCleanCode.entities.concretes.Customer;
import kodlamaioCleanCode.entities.concretes.EducationSale;
import kodlamaioCleanCode.entities.concretes.Employee;

public class Main {

	public static void main(String[] args) throws Exception {
	//	customerDemo();
	//	employeeDemo();
		educationSaleDemo();
		
		
	
		
	}	
		
	private static void customerDemo() throws Exception {
       Customer customer=new Customer(1,"Betul","Kayam","123456789",1995,76);
       Customer customer1=new Customer(1,"Kadir","Demirel","123456789",1998,33);
       Customer customer2=new Customer(1,"Burcu","Kayam","123456789",1998,16);
		
		CustomerService customerService=new CustomerManager(new HibernateCustomerDao() , new KpsServiceAdapter());

		customerService.add(customer);
		customerService.add(customer1);
		customerService.add(customer2);
	}
	
	
	private static void employeeDemo() {
		
		Employee employee=new Employee(1,"Betul","Kayam","123456789",1995,100.000);
		EmployeeService employeeService=new EmployeeManager(new FrameworkEmployeeDao());
		employeeService.add(employee);
		
		for (Employee employee2 : employeeService.getAll()) {
			System.out.println(employee2.getFirstName()+" "+ employee2.getLastName());
			
		}
	}
	
	private static void educationSaleDemo() {
		EducationSale educationSale=new EducationSale(1,"Java",50.0);
		EducationSaleService educationSaleService=new EducationSaleManager(new FrameworkEducationSaleDao(), new PercentDiscountCampaignManager());
		educationSaleService.add(educationSale);
		
		
		for (EducationSale educationSale2 : educationSaleService.getAll()) {
			System.out.println(educationSale2.getName()+ " " + educationSale2.getSale());
		}
	}
	

}
