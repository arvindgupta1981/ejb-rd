package au.com.ejb.dao;

import java.io.Serializable;

public interface BaseDAOInt extends Serializable {
	public <T> T getReferance(Class<T> clz, Object id) ;
	public <T> T find(Class<T> clz, Object id);
	public void persist(Object transientEntity);
}
