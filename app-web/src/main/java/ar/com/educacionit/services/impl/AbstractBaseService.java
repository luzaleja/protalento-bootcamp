package ar.com.educacionit.services.impl;

import ar.com.educacionit.dao.GenericDao;
import ar.com.educacionit.dao.exception.DuplicatedException;
import ar.com.educacionit.dao.exception.GenericException;
import ar.com.educacionit.services.GenericService;
import ar.com.educacionit.services.exceptions.ServiceException;

public class AbstractBaseService<T> implements GenericService<T> {

	protected GenericDao<T> genericDao;
	
	public AbstractBaseService(GenericDao<T> daoDelHijo) {
		this.genericDao = daoDelHijo;
	}

	public T getOne(Long id) throws ServiceException{
		//no es necesario lanzar un service exception, es suficiente
		//con devolver un null si el id es null.
		T entity;
		try {
			entity = genericDao.getOne(id);
		} catch (GenericException e) {
			//e.printStackTrace();
			//tambien puede haber un error asi nos hayan dado un id not null
			//por ejemplo que no se pudo conectar al servidor. En ese caso
			//si necesitamos lanzar un ServiceException
			//if(id != null) {
			//o se puede lanzar una excepcion siempre, con la excepcion original 
			//para que el cliente busque por ahí la causa del error
			throw new ServiceException("Error de DB al intentar obtener entity id="+id,e);
		} finally {
			//siempre se ejecuta
			entity = null;
		}
		return entity;
	}

	public void delete(Long id) {
		genericDao.delete(id);
	}

	public T save(T entity) throws ServiceException{
		try {
			return genericDao.save(entity);
		} catch (DuplicatedException de) {
			//relanzo la exception como una ServiceException que contiene la 
			//excepction original (la de)
			throw new ServiceException("C101",de);
		}
	}

	public void update(T entity) {
		genericDao.update(entity);
	}

	public T[] findAll() {
		return genericDao.findAll();
	}

}
