package au.com.ejb.session.stateless.Base;

import javax.ejb.Stateless;

import au.com.ejb.dao.DAOFactory;

@Stateless
public class EmployeeFacade implements EmployeeFacadeLocal{
	
	public boolean persistEmployee() {
		DAOFactory.getInstance().getEmployeeDAO().persistEmployee();
		return false;
	}

}
