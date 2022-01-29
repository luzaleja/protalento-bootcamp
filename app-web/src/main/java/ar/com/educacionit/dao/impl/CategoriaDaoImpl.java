package ar.com.educacionit.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import ar.com.educacionit.dao.CategoriaDao;
import ar.com.educacionit.domain.Categorias;

public class CategoriaDaoImpl extends JdbcDaoBase<Categorias> implements CategoriaDao {
	
	public CategoriaDaoImpl() {
		super("CATEGORIAS");
	}

	@Override
	public String getSaveSQL() {
		return ("(descripcion,codigo,habilitada) VALUES(?,?,?)" );
	}

	@Override
	protected void save(PreparedStatement st, Categorias entity) throws SQLException {
		//insert into categorias(
		st.setString(1, entity.getDescripcion());
		st.setString(2, entity.getCodigo());
		st.setLong(3, entity.getHabilitada());
	}
	
	@Override
	public String getUpdateSQL() {
		String sql = "descripcion='?',";
		sql = sql + "habilitada='?'";
		return sql;
	}

	@Override
	protected void update(PreparedStatement st, Categorias entity) throws SQLException {
		st.setString(1, entity.getDescripcion());
		st.setLong(2, entity.getHabilitada());
	}



	/*public Categorias getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	public Categorias save(Categorias entity) {
		String sql = "INSERT INTO Categorias(descripcion, codigo) VALUES('"+entity.getDescripcion()+"','"+entity.getCodigo()+"')";
		System.out.println("Ejecutando sql: "+sql);
		
		entity.setId(1L);
		
		return entity;
	}

	public void update(Categorias entity) {
		// TODO Auto-generated method stub
		
	}

	public Categorias[] findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	 */
}
