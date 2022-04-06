package practicaAdicionalSemana16.dao;

import java.util.Collection;

import ar.com.educacionit.dao.exception.GenericException;
import practicaAdicionalSemana16.entities.Carrousel;

public interface CarrouselDao {

	public Collection<Carrousel> getActiveCarrousel() throws GenericException;
}
