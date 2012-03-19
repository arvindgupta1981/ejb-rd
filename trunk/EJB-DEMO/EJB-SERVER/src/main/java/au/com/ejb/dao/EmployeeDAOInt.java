package au.com.ejb.dao;

import au.com.ejb.entity.pojo.Employee;
public interface EmployeeDAOInt extends BaseDAOInt{
	public boolean persistEmployee();
}
