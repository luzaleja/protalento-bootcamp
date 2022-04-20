package practicaAdicionalSemana17.dao;

import java.util.List;

import ar.com.educacionit.dao.exception.GenericException;
import practicaAdicionalSemana16.entities.Imagenes;

public interface ListadoDao {

	public List<Imagenes> findAll() throws GenericException;
	
	public void update(Imagenes imagen) throws GenericException;
}
