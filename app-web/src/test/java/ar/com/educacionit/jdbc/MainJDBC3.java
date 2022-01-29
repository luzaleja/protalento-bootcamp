package ar.com.educacionit.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ar.com.educacionit.dao.exception.GenericException;
import ar.com.educacionit.dao.jdbc.AdministradorDeConexiones;
import ar.com.educacionit.services.CategoriaService;
import ar.com.educacionit.services.exceptions.ServiceException;
import ar.com.educacionit.services.impl.CategoriaServiceImpl;

public class MainJDBC3 {

	public static void main(String[] args) throws ServiceException {
        /*
		//Connection: conexion a la db con user y pass
		Connection con = AdministradorDeConexiones.obtenerConexion();
				
		//PreparedStatement: sql
		String sql = "DELETE * FROM categorias WHERE id =? ";
		
		PreparedStatement st = con.prepareStatement(sql);
				
		st.setLong(1, 10l);
		//que sea el dato correcto que quiero como parametro
		
		//ejecutar
		st.executeUpdate();
		
		con.close();*/
		
		CategoriaService cs = new CategoriaServiceImpl();
		cs.delete(10l);
	}

}
