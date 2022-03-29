package ar.com.educacionit.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ar.com.educacionit.dao.GenericDao;
import ar.com.educacionit.dao.exception.DuplicatedException;
import ar.com.educacionit.dao.exception.GenericException;
import ar.com.educacionit.dao.jdbc.AdministradorDeConexiones;
import ar.com.educacionit.dao.jdbc.util.DTOUtils;
import ar.com.educacionit.domain.Entity;

public abstract class JdbcDaoBase<T extends Entity> implements GenericDao<T> {

	// Las T son entidades que representan tablas, por ende van a heredar de Entity
	// por que extends y no implements? entonces T es una interface? pero si T es socios entonces
	// seria Socios extends entity, pero Socios es una clase, no una interfaz...??
	protected String tabla;
	protected Class<T> clazz;
	
	public JdbcDaoBase(String tablaDelHijo) {
		this.tabla = tablaDelHijo;
		//api reflection de java
		this.clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public T getOne(Long id) throws GenericException {
		
		if(id == null) {
			throw new GenericException("Id no informado");
		}
		
		T entity = null;
		
		String sql = "SELECT * FROM " + this.tabla + " WHERE ID = " + id;
		
		List<T> list = this.findBySQL(sql);
			
		if(!list.isEmpty()) {
			entity = list.get(0);
		}
		return entity;
	}
	
	/*
	public T getOne(Long id) throws GenericException {
		
		if(id == null) {
			throw new GenericException("Id no informado");
		}
		
		String sql = "SELECT * FROM " + this.tabla + " WHERE ID = " + id;
		System.out.println("Ejecutando sql: " + sql);
		T entity;
		try {
			//entity = this.clazz.newInstance(); //como conoce la clase, y Socios y Categorias tienen un constructor
			//por defecto, sin parametros, puede crear una nueva instancia de la clase para luego poder llamarla en el return
			//tambien podria ser
			entity = this.clazz.getDeclaredConstructor().newInstance();
			//entonces con el T extends Entity, puedo ahora usar getId y setId 
			entity.setId(id);
			
			//despues vamos a ver una clase utilitaria que va a saber como tomar la instancia y como armar
			//los seteos de los atributos (para ir a la base de datos)
		} catch (Exception e) {
			entity = null;
		}
		return entity;
	}*/

	public void delete(Long id) throws GenericException {
		
		if(id == null) {
			throw new GenericException("El id informado es NULL");
		}	
		
		String sql = "DELETE FROM " + this.tabla + " WHERE id =? ";
		System.out.println(sql);
		
		//connection
		try (Connection con = AdministradorDeConexiones.obtenerConexion();){
			
			try (PreparedStatement st = con.prepareStatement(sql)) {
				
				st.setLong(1, id);
				
				st.executeUpdate();
			}
		} catch (Exception e) {
			throw new GenericException("No se pudo eliminar: " + sql,e);
		}
		//ejecutar el sql
		//podriamos retornar un error de correccion por ejemplo
		//pues al borrar no es necesario retornar nada
		//la exception tendria que ser con try catch porque si sale un error de conexión
		//es mejor que el cliente pueda tratar de borrar otra vez, en vez de que se
		//dañe toda la aplicación
	}

	public T save(T entity) throws DuplicatedException, GenericException {

		String sql = "INSERT INTO " + this.tabla + this.getSaveSQL();
		//connection
		try (Connection con = AdministradorDeConexiones.obtenerConexion();){

			//insert into tabla (ca1,ca2,ca3,...) values(?,?,?,...)
			
			try (PreparedStatement st = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS)) {
				//le pasamos PreparedStatement.RETURN_GENERATED_KEYS para que nos regrese lo último
				//creado en la tabla
				
				//this.save toma el PreparedStatement que ya tiene la consulta armada con los ?,?...
				//y le setea los ? con el tipo y dato de la entidad que llega por parametro
				//este save lo ejecuta el hijo, pues es quien sabe como se tienen que setear
				//los datos, como esta creada la tabla en la db, etc
				this.save(st, entity); 
				
				st.execute();
				
				try (ResultSet res = st.getGeneratedKeys()) {
				//usamos un resultSet pues queremos el id de el registro que acabamos de crear
				//para poder crear el objeto de la entidad con su id incluído, y que luego
				//se pueda usar(buscar, eliminar, etc) por medio de ese id
				//st.getGeneratedKeys nos regresa un res con la clave que fue generada, el ultimo id
					
					if(res.next()) {//si hay next quiere decir que si creo un registro
						
						Long lastGeneratedId = res.getLong(1); //acá esta el id que se acaba de generar
						
						entity.setId(lastGeneratedId);
					}
				}
			}
		} catch (Exception e) {
			throw new GenericException("No se pudo insertar: " + sql,e);
		}
		return entity;
	}
	
	public void update(T entity) throws DuplicatedException, GenericException {
		//update tabla set camp1 =?, camp2 =?,... where id =?;
		String sql = "UPDATE " + this.tabla + " SET "+ this.getUpdateSQL() + " WHERE id = " + entity.getId();
		
		//connection
		try (Connection con = AdministradorDeConexiones.obtenerConexion();) {
					
			try (PreparedStatement st = con.prepareStatement(sql)) {
						
				this.update(st, entity);
				
				st.execute();
			}
		} catch (SQLException e) {
			//analizar si hay duplicated
			if(e instanceof SQLIntegrityConstraintViolationException) {
				throw new DuplicatedException("No se ha podido actualizar: " + sql,e);
			}
			throw new GenericException("No se pudo actualizar: " + sql,e);
		}
	}

	public List<T> findAll() throws GenericException {
		
		List<T> list = new ArrayList<>();
		
		String sql = "SELECT * FROM " + this.tabla;
		//connection
		try (Connection con = AdministradorDeConexiones.obtenerConexion();){
			
			try (Statement st = con.createStatement()) {
				
				try (ResultSet res = st.executeQuery(sql)) {
					
					list = DTOUtils.populateDTOs(this.clazz,res);
				}
			}
		} catch (Exception e) {
			throw new GenericException("No se pudo consultar: " + sql,e);
		}
		return list;
	}
	
	//metodos que los hijos estan obligados a usar
	
	protected abstract void save(PreparedStatement st, T entity) throws SQLException;
	//cuando tenemos un metodo abstracto, los hijos estan obligados a implementarlos
	//entonces podemos usar el getSaveSQL aca así no esté aún con el codigo implementado aca
	public abstract String getSaveSQL();

	protected abstract void update(PreparedStatement st, T entity) throws SQLException;
	public abstract String getUpdateSQL();
	
	public List<T> findBySQL(String whereSQL) throws GenericException {
		
		List<T> entity = new ArrayList<>();
		
		try (Connection con = AdministradorDeConexiones.obtenerConexion();){
			
			try (Statement st = con.createStatement()) {
				
				try (ResultSet res = st.executeQuery(whereSQL)) {

					entity = DTOUtils.populateDTOs(this.clazz, res);
				}
			}
		} catch (Exception e) {
			throw new GenericException("No se pudo consultar: " + whereSQL,e);
		}
		return entity;
	}
	
}
