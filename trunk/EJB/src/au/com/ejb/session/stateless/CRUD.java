package au.com.ejb.session.stateless;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@Remote(CRUDRemote.class)
public class CRUD implements CRUDRemote{
	
	@PersistenceContext(name="testDB")
	EntityManager entityManager;
	
	@Override
	public <E> E load(Class<E> clazz, int id) {
		return entityManager.getReference(clazz, id);
	}

	@Override
	public Object merga(Object entity) {
		return entityManager.merge(entity);
	}

	@Override
	public <E> int remove(Class<E> clazz, int id) {
		return 0;
	}

	@Override
	public void remove(Object entity) {
		return;
	}

	@Override
	public int save(Object entity) {
		return 0;
	}

	@Override
	public int update(Object entity) {
		return 0;
	}

}
