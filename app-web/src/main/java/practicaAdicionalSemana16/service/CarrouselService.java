package practicaAdicionalSemana16.service;

import java.util.Collection;

import ar.com.educacionit.services.exceptions.ServiceException;
import practicaAdicionalSemana16.entities.Imagenes;

public interface CarrouselService {
	
	public Collection<Imagenes> getActiveCarrousel() throws ServiceException;

}
