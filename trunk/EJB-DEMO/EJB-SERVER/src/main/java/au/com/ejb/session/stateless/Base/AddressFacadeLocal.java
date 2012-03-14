package au.com.ejb.session.stateless.Base;

import javax.ejb.Local;

import au.com.ejb.entity.pojo.Address;
@Local
public interface AddressFacadeLocal {
	public boolean persistAddress(String city);
}
