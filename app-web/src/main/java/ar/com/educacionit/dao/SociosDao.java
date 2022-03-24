package ar.com.educacionit.dao;

import ar.com.educacionit.dao.exception.GenericException;
import ar.com.educacionit.domain.Socios;

//import ar.com.educacionit.domain.Socios;

public interface SociosDao extends GenericDao<Socios> {
	
	public Socios getSociosByUserId(Long id) throws GenericException;
}
