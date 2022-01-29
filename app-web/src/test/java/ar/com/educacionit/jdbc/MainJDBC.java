package ar.com.educacionit.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import ar.com.educacionit.dao.exception.GenericException;
import ar.com.educacionit.dao.jdbc.AdministradorDeConexiones;
import ar.com.educacionit.domain.Categorias;
import ar.com.educacionit.domain.Entity;
import ar.com.educacionit.domain.Socios;

public class MainJDBC {

	public static void main(String[] args) throws GenericException, SQLException {

		//Connection: conexion a la db con user y pass
		Connection con = AdministradorDeConexiones.obtenerConexion();
		
		//Statement / PreparedStatement: sql
		Statement st = con.createStatement();
		
		//ResultSet: datos (columnas / filas)
		ResultSet res = st.executeQuery("SELECT * FROM categorias");
		
		Collection<Entity> lista = new ArrayList<>();
		
		
		while(res.next()) { //reviso que tenga datos
			Long id = res.getLong(1); //obtener un valor long de la columna 1
			String descripcion = res.getString(2);
			String codigo = res.getString(3);
			Long habilitada = res.getLong(4);
			
			//se puede poner en los parentesis el numero de la columna del dato
			//o el nombre, por ejemplo
			//Long id = res.getLong("ID");
			
			Categorias categoria = new Categorias(id,descripcion,codigo);
			lista.add(categoria);
		}
		
		System.out.println(lista);

		//socios
		
		res = st.executeQuery("SELECT * FROM socios");
		
		while(res.next()) { //reviso que tenga datos
			Long id = res.getLong("id"); //obtener un valor long de la columna 1
			String nombre = res.getString("nombre");
			String apellido = res.getString("apellido");
			String email = res.getString("email");
			Date fechaAlta = res.getDate("fecha_alta");
			String direccion = res.getString("direccion");
			Long paisId = res.getLong("paises_id");
			
			
			
			//se puede poner en los parentesis el numero de la columna del dato
			//o el nombre, por ejemplo
			//Long id = res.getLong("ID");
			
			Socios socios = new Socios(id,nombre,apellido,email,direccion,paisId);
			
			System.out.println(socios);
		}
		
		con.close();
		
	}

}
