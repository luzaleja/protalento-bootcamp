package practicaAdicionalSemana16.service.impl;

import java.util.Collection;

import ar.com.educacionit.dao.exception.GenericException;
import ar.com.educacionit.services.exceptions.ServiceException;
import practicaAdicionalSemana16.dao.CarrouselDao;
import practicaAdicionalSemana16.dao.impl.CarrouselDaoImpl;
import practicaAdicionalSemana16.entities.Imagenes;
import practicaAdicionalSemana16.service.CarrouselService;

public class CarrouselServiceImpl implements CarrouselService {

	private CarrouselDao carrouselDao;
	
	public CarrouselServiceImpl() {
		this.carrouselDao = new CarrouselDaoImpl();
	}
	
	@Override
	public Collection<Imagenes> getActiveCarrousel() throws ServiceException {
		
		try {
			Collection<Imagenes> carrouselActive = this.carrouselDao.getActiveCarrousel();
			return carrouselActive;
		} catch (GenericException e) {
			throw new ServiceException("Error al buscar el carrousel.",null);
		}
	}

}
