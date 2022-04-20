package practicaAdicionalSemana17.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.dao.exception.DuplicatedException;
import ar.com.educacionit.dao.exception.GenericException;
import ar.com.educacionit.dao.jdbc.AdministradorDeConexiones;
import ar.com.educacionit.dao.jdbc.util.DTOUtils;
import practicaAdicionalSemana16.entities.Imagenes;
import practicaAdicionalSemana17.dao.ListadoDao;

public class ListadoDaoImpl implements ListadoDao {

	@Override
	public List<Imagenes> findAll() throws GenericException {
		//Listado de todas las imagenes
		String sql = "SELECT * FROM carrousel";
				
		List<Imagenes> imagenes = new ArrayList<>();

		//connection
		try (Connection con = AdministradorDeConexiones.obtenerConexion();){
					
			try (Statement st = con.createStatement()) {
						
				try (ResultSet res = st.executeQuery(sql)) {

					imagenes = DTOUtils.populateDTOs(Imagenes.class,res);
				}
			}
		} catch (Exception e) {
			throw new GenericException("No se pudo consultar: " + sql,e);
		}
		return imagenes;
	}

	@Override
	public void update(Imagenes imagen) throws GenericException {

		String sql = "UPDATE carrousel SET imagen =? WHERE id =?";
		
		try (Connection con = AdministradorDeConexiones.obtenerConexion();) {
			
			try (PreparedStatement st = con.prepareStatement(sql)) {
						
				st.setString(1,imagen.getImagen());
				st.setLong(2, imagen.getId());
				
				st.execute();
			}
		} catch (SQLException e) {
			throw new GenericException("No se pudo actualizar: " + sql,e);
		}
	}

}
