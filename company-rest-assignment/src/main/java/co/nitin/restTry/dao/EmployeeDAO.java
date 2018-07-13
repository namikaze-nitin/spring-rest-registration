package co.nitin.restTry.dao;

import java.util.List;
import co.nitin.restTry.model.Employee;

/**
 * 
 * @author Nitin Sharma
 * Interface Defining Blue print of DAO class
 * 
 */
public interface EmployeeDAO {

	public void addEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public void deleteEmployee(Integer employeeId);
	public Employee getEmployee(int employeeid);
}
