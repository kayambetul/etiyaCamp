package kodlamaioCleanCode.business.absratcts;

import java.util.List;

import kodlamaioCleanCode.entities.concretes.Employee;

public interface EmployeeService {
	void add(Employee employee);
	List<Employee> getAll();

}
