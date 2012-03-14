package au.com.ejb.dao;

import javax.persistence.EntityManager;

public class BaseDAO implements BaseDAOInt{
	protected EntityManager entityManager;
	public BaseDAO(EntityManager entityManager){
		this.entityManager=entityManager;
	}
	public <T> T getReferance(Class<T> clz, Object id) {
		return entityManager.getReference(clz, id);
	}

	public <T> T find(Class<T> clz, Object id) {
		return entityManager.find(clz, id);
	}

	public void persist(Object transientEntity){		
		entityManager.persist(transientEntity);		
	}
	
}
