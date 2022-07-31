package kodlamaioCleanCode.business.concretes;

import java.util.List;

import kodlamaioCleanCode.business.absratcts.EmployeeService;
import kodlamaioCleanCode.dataAccess.abstracts.EmployeeDao;
import kodlamaioCleanCode.entities.concretes.Employee;

public class EmployeeManager implements EmployeeService{

	private EmployeeDao employeeDao;
	
	
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public void add(Employee employee) {
		employeeDao.add(employee);
		
	}

	@Override
	public List<Employee> getAll() {
		
		return employeeDao.getAll();
	}

}
