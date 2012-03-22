package au.com.ejb.dao;

import javax.persistence.EntityManager;

import au.com.ejb.entity.pojo.Department;
import au.com.ejb.entity.pojo.Employee;

public class EmployeeDAO extends BaseDAO implements EmployeeDAOInt {

	public EmployeeDAO(EntityManager entityManager) {
		super(entityManager);	
	}

	public boolean persistEmployee() {
		Employee employee=new Employee();
		employee.setEmpId(100);
		employee.setName("Arvind");
		Department department=new Department();
		department.setDepId(200);
		department.setName("IT");
		//department.setEmployee(employee);
		//department.getEmployees().add(employee);
		//employee.setDepId(department);
		
		entityManager.persist(department);
		return false;
	}
}
