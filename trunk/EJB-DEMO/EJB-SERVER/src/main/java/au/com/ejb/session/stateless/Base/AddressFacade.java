package au.com.ejb.session.stateless.Base;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import au.com.ejb.dao.AddressDAOInt;
import au.com.ejb.dao.DAOFactory;
import au.com.ejb.entity.pojo.Address;

@Stateless
public class AddressFacade implements AddressFacadeLocal {
	public boolean persistAddress(String city){
		System.out.println(DAOFactory.getAddressDAO().getClass());
		DAOFactory.getInstance().getAddressDAO().persist(new Address(city));
		 return true;
	}
}
