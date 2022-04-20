package practicaAdicionalSemana16.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ar.com.educacionit.dao.exception.GenericException;
import ar.com.educacionit.dao.jdbc.AdministradorDeConexiones;
import ar.com.educacionit.dao.jdbc.util.DTOUtils;
import practicaAdicionalSemana16.dao.CarrouselDao;
import practicaAdicionalSemana16.entities.Imagenes;

public class CarrouselDaoImpl implements CarrouselDao {

	@Override
	public Collection<Imagenes> getActiveCarrousel() throws GenericException {

		//Solo queremos los que están activos
		String sql = "SELECT * FROM carrousel WHERE activo = b'1'";
		
		Collection<Imagenes> carrouselActivo = new ArrayList<>();

		//connection
		try (Connection con = AdministradorDeConexiones.obtenerConexion();){
			
			try (Statement st = con.createStatement()) {
				
				try (ResultSet res = st.executeQuery(sql)) {

					List<Imagenes> list = new ArrayList<>();
					
					list = DTOUtils.populateDTOs(Imagenes.class,res);
					
					if(!list.isEmpty()) {
						carrouselActivo = list;
					}
				}
			}
		} catch (Exception e) {
			throw new GenericException("No se pudo consultar: " + sql,e);
		}
		return carrouselActivo;
	}

}
