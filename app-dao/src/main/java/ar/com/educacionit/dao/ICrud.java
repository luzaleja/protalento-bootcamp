package ar.com.educacionit.dao;

import ar.com.educacionit.domain.Socios;

public interface ICrud {

	//insertar registros en la tabla Socios por medio de esta interface
	public Socios create(Socios socioACrear);
	// Socios tiene datos: nombre, apellido, etc, 
	// que son las columnas en la tabla que se deben llenar
	// para que quede más claro, se usa la clase Socios como tipo de dato
	// pues esta clase es donde están los atributos que van a la tabla
	// el id se lo agrega el motor
	// alguien llama este metodo, crea el socio con los datos, se lo pasa al 
	// metodo y este lo inserta en la tabla 
	
	
	//la implementacion de esto va en su propio paquete, dao.impl
	
	public Socios findById(Long id);
	
	public Socios[] findAll(); //un listado, un vector de socios
	
}
