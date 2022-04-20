package practicaAdicionalSemana16.dao;

import java.util.Collection;

import ar.com.educacionit.dao.exception.GenericException;
import practicaAdicionalSemana16.entities.Imagenes;

public interface CarrouselDao {

	public Collection<Imagenes> getActiveCarrousel() throws GenericException;
}
