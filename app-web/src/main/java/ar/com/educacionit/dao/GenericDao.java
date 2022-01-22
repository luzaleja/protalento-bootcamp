package ar.com.educacionit.dao;

import ar.com.educacionit.dao.exception.DuplicatedException;
import ar.com.educacionit.dao.exception.GenericException;

public interface GenericDao<T> {

	public T getOne(Long id) throws GenericException;
	
	public void delete(Long id);
	
	public T save(T entity) throws DuplicatedException;
	// entity es una entidad en la base de datos, es decir una tabla
		
	public void update(T entity);
	
	public T[] findAll();
}
