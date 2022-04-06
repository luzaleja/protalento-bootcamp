package practicaAdicionalSemana16.service;

import java.util.Collection;

import ar.com.educacionit.services.exceptions.ServiceException;
import practicaAdicionalSemana16.entities.Carrousel;

public interface CarrouselService {
	
	public Collection<Carrousel> getActiveCarrousel() throws ServiceException;

}
