package practicaAdicionalSemana17.service.impl;

import java.util.List;

import ar.com.educacionit.dao.exception.GenericException;
import ar.com.educacionit.services.exceptions.ServiceException;
import practicaAdicionalSemana16.entities.Imagenes;
import practicaAdicionalSemana17.dao.ListadoDao;
import practicaAdicionalSemana17.dao.impl.ListadoDaoImpl;
import practicaAdicionalSemana17.service.ListadoService;

public class ListadoServiceImpl implements ListadoService {

	private ListadoDao listadoDao;
	
	public ListadoServiceImpl() {
		listadoDao = new ListadoDaoImpl();
	}
	
	@Override
	public List<Imagenes> findAll() throws ServiceException {
		try {
			return listadoDao.findAll();
		} catch (GenericException e) {
			throw new ServiceException("Error consultando listado de imagenes.",e);
		}
	}

	@Override
	public void update(Imagenes imagen) throws ServiceException {

		try {
			listadoDao.update(imagen);
		} catch (GenericException e) {
			throw new ServiceException("Error actualizando imagen",e);
		}
	}

}
