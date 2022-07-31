package kodlamaioCleanCode.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlamaioCleanCode.dataAccess.abstracts.EmployeeDao;
import kodlamaioCleanCode.entities.concretes.Employee;

public class FrameworkEmployeeDao implements EmployeeDao{

	List<Employee> employees=new ArrayList<Employee>();
	@Override
	public void add(Employee employee) {
		employees.add(employee);
		System.out.println("Framework employee eklendi");
		
	}

	
	@Override
	public List<Employee> getAll() {
		return employees;
	}

	
}
