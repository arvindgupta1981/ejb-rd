package au.com.ejb.dao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;



public class DAOFactory implements DAOFactoryInt{
	private static AddressDAO addressDAO=null;
	private static DAOFactory daoFactory=new DAOFactory();
	private DAOFactory() {
		Context iniCtx=null;
		try {
			iniCtx = new InitialContext();
			EntityManager entityManager=(EntityManager) iniCtx.lookup("java:Manager1");
			addressDAO=new AddressDAO(entityManager);
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
	}
	public static DAOFactory getInstance(){
		return daoFactory;
	}
	public static BaseDAO getAddressDAO(){
		return addressDAO;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("DAO Factory can not be instantiated!");
	}
	
}
