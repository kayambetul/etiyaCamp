package kodlamaioCleanCode.dataAccess.abstracts;

import java.util.List;

import kodlamaioCleanCode.entities.concretes.Employee;

public interface EmployeeDao {
	void add(Employee employee);
	List<Employee> getAll();
	
	

}
