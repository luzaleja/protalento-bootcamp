package ar.com.educacionit.services.impl;

import java.util.List;

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
			//para que el cliente busque por ah� la causa del error
			throw new ServiceException("Error de DB al intentar obtener entity id="+id,e);
		} 
		return entity;
	}

	public void delete(Long id) throws ServiceException{
		try {
			genericDao.delete(id);
		} catch (GenericException e) {
			throw new ServiceException("Error eliminando entity id: "+id,e);
		}
	}

	public T save(T entity) throws ServiceException{
		try {
			return genericDao.save(entity);
		} catch (DuplicatedException | GenericException de) {
			//relanzo la exception como una ServiceException que contiene la 
			//excepction original (la de)
			throw new ServiceException("C101",de);
		} 
	}

	public void update(T entity) throws ServiceException{
		try {
			genericDao.update(entity);
		} catch (GenericException | DuplicatedException e) {
			throw new ServiceException("Error actualizando socio", e);
		}
	}

	public List<T> findAll() throws ServiceException {
		try {
			return genericDao.findAll();
		} catch (GenericException e) {
			throw new ServiceException("Error consultando listado",e);
		}
	}

}
