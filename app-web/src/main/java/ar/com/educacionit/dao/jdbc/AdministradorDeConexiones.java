package ar.com.educacionit.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import ar.com.educacionit.dao.exception.GenericException;

public class AdministradorDeConexiones {

	public static Connection obtenerConexion() throws GenericException {
		
		String url = "jdbc:postgresql://ec2-44-194-92-192.compute-1.amazonaws.com:5432/d535m72im9huc4";
		String user = "volzirmyhfjrvf";
		String password = "f645994df058e08a07d0159d061bba0ff54dbd4772597b716051d7b7d7a9d097";
		String driverName = "org.postgresql.Driver"; //depende del motor 
		//es el paquete donde esta el driver
		//en la dependencia MAVEN
		//en este caso podemos usar los dos paquetes que tienen jdbc. 
		//Usamos el que tiene cj.
		
		try {
			Class.forName(driverName);
			Connection connection = DriverManager.getConnection(url, user, password);
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			throw new GenericException("Error obteniendo conexion: "+ e.getMessage(),e);
		}
		
	}

}
