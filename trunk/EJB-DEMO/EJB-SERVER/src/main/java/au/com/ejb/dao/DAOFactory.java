package au.com.ejb.dao;

public class DAOFactory {
	private static AddressDAO addressDAO;
	static{
		addressDAO=new AddressDAO();
	}
	private DAOFactory(){}
	public static BaseDAO getAddressDAO(){
		return addressDAO;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("DAO Factory can not be instantiated!");
	}
	
}
