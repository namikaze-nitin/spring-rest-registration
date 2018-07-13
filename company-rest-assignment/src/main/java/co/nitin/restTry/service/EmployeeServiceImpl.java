package co.nitin.restTry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.nitin.restTry.dao.EmployeeDAO;
import co.nitin.restTry.dao.EmployeeDAOImpl;
import co.nitin.restTry.model.Employee;

/**
 * 
 * @class : Service class for database queries.
 * @see {@link EmployeeDAOImpl}
 * @author Nitin Sharma
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	/**
	 * @author Nitin Sharma
	 * @class : Set member Variable for {@link EmployeeDAO}
	 * @param employeeDAO
	 */
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	/**
	 * @author Nitin Sharma
	 * Method performs insertion of new object {@link Employee} object into database or update it
	 * @param : {@link Employee} 
	 */
	@Override
	public void addEmployee(Employee employee) {
		employeeDAO.addEmployee(employee);
	}

	/**
	 * @author Nitin Sharma
	 * Method fetches all {@link Employee} records from database.
	 * @return List of Employee objects
	 */
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

	/**
	 * @author Nitin Sharma
	 * Method to delete a employee entity. Doing deletion on the basis of EmployeeId but can be updated depending on need.
	 * @param : employeeId
	 */
	@Override
	public void deleteEmployee(Integer employeeId) {
		employeeDAO.deleteEmployee(employeeId);
	}

	/**
	 * @author Nitin Sharma
	 * Method to return detail of an {@link Employee} using its employeeId
	 * @param : empId : Employees unique ID
	 * @return : an {@link Employee} record
	 */
	@Override
	public Employee getEmployee(int empid) {
		return employeeDAO.getEmployee(empid);
	}
}
