package ar.com.educacionit.services.impl;

//import ar.com.educacionit.dao.CategoriaDao;
import ar.com.educacionit.dao.impl.CategoriaDaoImpl;
import ar.com.educacionit.domain.Categorias;
import ar.com.educacionit.services.CategoriaService;

public class CategoriaServiceImpl extends AbstractBaseService<Categorias> implements CategoriaService {

	//el atributo Dao se podr�a hacer de las siguientes dos formas:
	//private GenericDao<Categorias> dao;
	//private CategoriaDao dao;
	
	public CategoriaServiceImpl () {
		super(new CategoriaDaoImpl());
	}
	
	
	/*
	 * ahora que extiende de abstractbaseservice, no tiene que implementar los metodos del crud aca
	 * porque su padre (abstractbaseservice) ya los est� implementando
	 * si los volviera a escribir, estar�a sobreescribiendo esos metodos crud
	 * 
	 */
	
	/*public Categorias getOne(Long id) {
		return dao.getOne(id);
	}

	public void delete(Long id) {
		dao.delete(id);
	}

	public Categorias save(Categorias entity) {
		return dao.save(entity);
	}

	public void update(Categorias entity) {
		dao.update(entity);
	}

	public Categorias[] findAll() {
		return dao.findAll();
	}
	*/
}
