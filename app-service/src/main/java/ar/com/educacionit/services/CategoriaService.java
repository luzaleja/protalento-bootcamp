package ar.com.educacionit.services;

import ar.com.educacionit.domain.Categorias;

public interface CategoriaService extends GenericService<Categorias> {

	// algun metodo particular que quiera adem�s del CRUD
	/*
	 Queremos implementar un metodo select
	 SELECT * FROM categorias where nombre = 'algo' and ... 
	 
	 Categorias findByNombreAndAlgoMas(String nombre, Object algoMas); 
	 este metodo se tendria que implementar en sql en categoriaServiceImpl
	 */
}
