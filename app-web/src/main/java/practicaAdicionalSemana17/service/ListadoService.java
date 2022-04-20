package practicaAdicionalSemana17.service;

import java.util.List;

import ar.com.educacionit.services.exceptions.ServiceException;
import practicaAdicionalSemana16.entities.Imagenes;

public interface ListadoService {

	public List<Imagenes> findAll() throws ServiceException;
	
	public void update(Imagenes imagen) throws ServiceException;
}
