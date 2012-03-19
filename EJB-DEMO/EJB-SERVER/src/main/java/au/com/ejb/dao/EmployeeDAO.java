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
		employee.setEmpId(1);
		employee.setName("Arvind");
		Department department=new Department();
		department.setDepId(2);
		department.setName("IT");
		//employee.setDepId(department);
		department.getEmployees().add(employee);
		entityManager.persist(employee);
		return false;
	}
	

}
