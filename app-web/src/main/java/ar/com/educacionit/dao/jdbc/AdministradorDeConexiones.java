package ar.com.educacionit.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import ar.com.educacionit.dao.exception.GenericException;

public class AdministradorDeConexiones {

	public static Connection obtenerConexion() throws GenericException {
		
		String url = "jdbc:postgresql://ec2-52-203-164-61.compute-1.amazonaws.com:5432/d80430r61b06e8";
		String user = "xnvixqoqtrajjd";
		String password = "8a71219d08a848290aa153e3af48d9f4c0a82bcc78f9d9c8e686ad918655b424";
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
	
	//public static void main(String[] args) {
		
	//	try (Connection con = AdministradorDeConexiones.obtenerConexion();) {
	//		System.out.println("Conexion obtenida");
	//	} catch (Exception e) {
	//		e.printStackTrace();
	//	}
	//}
}
