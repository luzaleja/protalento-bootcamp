package ar.com.educacionit.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.dao.GenericDao;
import ar.com.educacionit.dao.exception.DuplicatedException;
import ar.com.educacionit.dao.exception.GenericException;
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
			//los seteos de los atributos
		} catch (Exception e) {
			entity = null;
		}
		return entity;
	}

	public void delete(Long id) {
		
	}

	public T save(T entity) throws DuplicatedException {
		String sql = "INSERT INTO " + this.tabla + this.getSaveSQL(entity);
		System.out.println(sql);
		entity.setId(12l); //en realidad el id lo da el motor sql
		return entity;
	}
	
	//cuando tenemos un metodo abstracto, los hijos estan obligados a implementarlos
	//entonces podemos usar el getSaveSQL aca así no esté aún con el codigo implementado aca
	
	public abstract String getSaveSQL(T entity);

	public void update(T entity) {
		
		String sql = "UPDATE " + this.tabla + " SET "+ this.getUpdateSQL(entity) + " WHERE id = " + entity.getId();
		System.out.println(sql);
	}

	public abstract String getUpdateSQL(T entity);
	
	public T[] findAll() {
		String sql = "SELECT * FROM " + this.tabla;
		
		//supongo que hay 2 registros
		List<T> instances = new ArrayList<T>();
		T instance;
		try {
			instance = this.clazz.getDeclaredConstructor().newInstance();
			instance.setId(1l);;
			//instance.add(instance);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
		//return instances;
	}
	
	
}
