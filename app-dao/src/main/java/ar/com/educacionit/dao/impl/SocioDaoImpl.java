package ar.com.educacionit.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

//import ar.com.educacionit.dao.ICrud;
import ar.com.educacionit.dao.SociosDao;
import ar.com.educacionit.dao.exception.GenericException;
import ar.com.educacionit.domain.Socios;

public class SocioDaoImpl extends JdbcDaoBase<Socios> implements SociosDao{

	public SocioDaoImpl() {
		super("socios"); //es la tabla
		//super("socios",Socios.class); aca con Socios.class le estoy diciendo con que clase trabajar
		//api reflection etc
	}

	@Override
	public String getSaveSQL() {

		//se hace aca lo particular del sql de Socios
		//(campo1,campo2,campon)
		//values
		//(value1,value2,valuen)
		
		return ("(nombre,apellido,email,direccion,paises_id,fecha_alta) VALUES(?,?,?,?,?,?)" );
	}

	@Override
	protected void save(PreparedStatement st, Socios entity) throws SQLException {
		st.setString(1, entity.getNombre());
		st.setString(2, entity.getApellido());
		st.setString(3, entity.getEmail());
		st.setString(4, entity.getDireccion());
		st.setLong(5, entity.getPaisesId());
		st.setDate(6, new java.sql.Date(new Date().getTime()));
	}
	
	@Override
	public String getUpdateSQL() {
		String sql = "nombre=?, apellido=?, email=?, paises_id=?";
		return sql;
	}

	@Override
	protected void update(PreparedStatement st, Socios entity) throws SQLException{
		st.setString(1, entity.getNombre());
		st.setString(2, entity.getApellido());
		st.setString(3, entity.getEmail());
		st.setLong(4, entity.getPaisesId());
	}

	@Override
	public Socios getSociosByUserId(Long id) throws GenericException {
		
		String sql = "select * from socios where users_id = " + id;
		
		Socios entity = null;

		List<Socios> list = super.findBySQL(sql);
		
		if(!list.isEmpty()) {
			entity = list.get(0);
		}
		return entity;
	}

	
	/*
	//estaba ICrud, SocioSQLCustom
	
	//create
	public Socios save(Socios socio) {
		// mas adelante veremos como conectarnos a la db
		// luego tendrias que crear una clase SocioMain que ejecute la implementacion
				
		//como insertar datos
		
		//INSERT
		
		String sql = "INSERT INTO SOCIOS(nombre,apellido,email,direccion) VALUES('carlos','lopez','krloss@gmail.com','av siempre viva 46')";
		System.out.println("Ejecutando sql: " + sql);
		return new Socios(10L,"carlos","lopez","krloss@gmail.com","av siempre viva 46",1L);
	}

	//read (by id)
	public Socios getOne(Long id) {
		String sql = "SELECT * FROM SOCIOS WHERE ID = "+id;
		System.out.println("Ejecutando sql: " + sql);
		return new Socios(id,"carlos","lopez","krloss@gmail.com","av siempre viva 46",1l);
	}

	public void update(Socios entity) {
		String sql = "UPDATE socios" +
				"SET direccion = '"+entity.getDireccion()+"' , apellido = '"+
				entity.getApellido()+"' , paises_id = " +entity.getPaisesId()+
				" WHERE id = 1";
		System.out.println(sql);
	}
	
	//select *
	
	public Socios[] findAll() {
		String sql = "SELECT * FROM socios";
		
		//varios row 0 > n
		System.out.println("Ejecutando sql: " + sql);
		
		Socios socio1 = new Socios(1L,"carlos","lopez","krloss@gmail.com","av siempre viva 46",1l);
		Socios socio2 = new Socios(2L,"carlos","lopez","krloss@gmail.com","av siempre viva 46",1l);
		Socios socio3 = new Socios(3L,"carlos","lopez","krloss@gmail.com","av siempre viva 46",1l);
		
		return new Socios [] {socio1,socio2,socio3};
		//retorna un vector de socios 
	}
	
	//para revisar herencias de interfaz 
	//versus
	//implementar dos interfaces independientes
	/*public Socios selectCustom() {
		String sql = "select nombre,apellido from socios ";
		System.out.println("Ejecutando sql: " + sql);
		return new Socios(1L,"carlos","lopez","krloss@gmail.com","av siempre viva 46",1l);
	}
	
	
	public void delete(Long id) {
		String sql = "DELETE FROM socios WHERE id = " + id;
		System.out.println(sql);
	}
	*/
	
}
