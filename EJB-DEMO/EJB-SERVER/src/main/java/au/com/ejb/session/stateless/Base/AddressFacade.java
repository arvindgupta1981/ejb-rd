package au.com.ejb.session.stateless.Base;

import javax.ejb.Stateless;
import au.com.ejb.dao.DAOFactory;
import au.com.ejb.entity.pojo.Address;

@Stateless
public class AddressFacade implements AddressFacadeLocal {
	public boolean persistAddress(Address address){
		 DAOFactory.getAddressDAO().persist(new Address("100", "Delhi"));
		 return true;
	}
}
