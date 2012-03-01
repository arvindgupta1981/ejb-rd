package au.com.ejb.session.stateless;

import javax.ejb.Remote;

@Remote
public interface CRUDRemote {
	public int save(Object entity);
	public Object merga(Object entity);
	public int update(Object entity);
	public <E> E load(Class<E> clazz,int id);
	public void remove(Object entity);
	public <E> int remove(Class<E> clazz,int id);
}
