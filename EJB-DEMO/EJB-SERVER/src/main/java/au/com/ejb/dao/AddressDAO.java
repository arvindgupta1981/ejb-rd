package au.com.ejb.dao;

import javax.persistence.EntityManager;



public class AddressDAO extends BaseDAO implements AddressDAOInt{

	public AddressDAO(EntityManager entityManager) {
		super(entityManager);
	}

}
