package co.nitin.restTry.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.nitin.restTry.model.Employee;
import co.nitin.restTry.service.EmployeeServiceImpl;

/**
 * 
 * @author Nitin Sharma
 * @class : Provide platform to perform different queries on database.
 * @see {@link EmployeeServiceImpl}
 */
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	/**
	 * @author Nitin Sharma
	 * Method performs insertion of new object {@link Employee} object into database or update it
	 * @param : {@link Employee} 
	 */
	@Override
	public void addEmployee(Employee employee) {
		sessionFactory.getCurrentSession().saveOrUpdate(employee);
	}
	
	/**
	 * @author Nitin Sharma
	 * Method fetches all {@link Employee} records from database.
	 * @return List of Employee objects
	 */
	@Override
	public List<Employee> getAllEmployees() {
		return sessionFactory.getCurrentSession().createQuery("from Employee").list();
	}

	/**
	 * @author Nitin Sharma
	 * Method to delete a employee entity. Doing deletion on the basis of EmployeeId but can be updated depending on need.
	 * @param : employeeId
	 */
	@Override
	public void deleteEmployee(Integer employeeId) {
		
		Employee employee = (Employee) sessionFactory.getCurrentSession().load(Employee.class, employeeId);	
		if (null != employee) this.sessionFactory.getCurrentSession().delete(employee);
	}

	/**
	 * @author Nitin Sharma
	 * Method to return detail of an {@link Employee} using its employeeId
	 * @param : empId : Employees unique ID
	 * @return : an {@link Employee} record
	 */
	@Override
	public Employee getEmployee(int empid) {
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, empid);
	}
}