package co.nitin.restTry.service;

import java.util.List;
import co.nitin.restTry.model.Employee;

/**
 * 
 * @author Nitin Sharma
 * @class : Service class interface to define blueprint of our to-be Service class
 */
public interface EmployeeService {
	
	public void addEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public void deleteEmployee(Integer employeeId);
	public Employee getEmployee(int employeeid);
}
