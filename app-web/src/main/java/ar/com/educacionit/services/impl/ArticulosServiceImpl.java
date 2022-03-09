package ar.com.educacionit.services.impl;

import ar.com.educacionit.dao.GenericDao;
import ar.com.educacionit.dao.impl.ArticuloDaoImpl;
import ar.com.educacionit.domain.Articulos;
import ar.com.educacionit.services.ArticulosService;

public class ArticulosServiceImpl extends AbstractBaseService<Articulos> implements ArticulosService {

	public ArticulosServiceImpl() {
		super(new ArticuloDaoImpl());
	}

}
