package au.com.ejb.dao;

import javax.persistence.EntityManager;



public class AddressDAO extends BaseDAO{

	public AddressDAO(EntityManager entityManager) {
		super(entityManager);
	}

}
