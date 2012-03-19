package au.com.ejb.dao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;



public class DAOFactory{
	private static AddressDAOInt addressDAO=null;
	private static EmployeeDAOInt emplDAO=null;
	private static DAOFactory daoFactory=new DAOFactory();
	
	private DAOFactory() {
		Context iniCtx=null;
		try {
			iniCtx = new InitialContext();
			EntityManager entityManager=(EntityManager) iniCtx.lookup("java:entityManager");
			addressDAO=new AddressDAO(entityManager);
			emplDAO=new EmployeeDAO(entityManager);
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
	}
	public static DAOFactory getInstance(){
		return daoFactory;
	}
	public static AddressDAOInt getAddressDAO(){
		return addressDAO;
	}
	public static EmployeeDAOInt getEmployeeDAO(){
		return emplDAO;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("DAO Factory can not be instantiated!");
	}
	
}
