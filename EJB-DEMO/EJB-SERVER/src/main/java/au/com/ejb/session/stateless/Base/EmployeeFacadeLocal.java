package au.com.ejb.session.stateless.Base;

import javax.ejb.Local;

@Local
public interface EmployeeFacadeLocal {
	public boolean persistEmployee();
}
